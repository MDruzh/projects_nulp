package com.edu.task;

import java.util.ArrayList;
import java.util.List;

public class Bobry {
    public final int BINARY = 2;

    public long power(int n, int degree) {
        long result = 1;
        for (int i = 0; i < degree; i++) {
            result = result * n;
        }
        return result;
    }

    public String longToBinaryString(long number) {
        return Long.toBinaryString(number);
    }

    public long stringToLong(String binaryNumber) {
        long result = 0L;
        long multiply = 1;
        long CurrentBit = 0;
        for (int index = binaryNumber.length() - 1; index >= 0; index--) {
            CurrentBit = binaryNumber.charAt(index) == '1' ? 1L : 0L;
            result = result + CurrentBit * multiply;
            multiply = multiply * BINARY;
        }
        return result;
    }

    public int getMaxDegreeN(String binaryNumber, int n) {
        int resultDegree = 0;
        long nDegree = 1;
        while (nDegree < stringToLong(binaryNumber)) {
            resultDegree++;
            nDegree = nDegree * n;
        }
        return resultDegree - 1;
    }

    public List<String> getMinBinaryParts(String binaryNumber, int n) {
        List<String> resultParts = new ArrayList<>();
        int maxDegreeN = getMaxDegreeN(binaryNumber, n);
        int index = -1;
        System.out.println("Original binaryNumber = " + binaryNumber);
        for (int currentDegree = maxDegreeN; currentDegree >= 0; currentDegree--) {
//            System.out.println("currentDegree = " + currentDegree);
            String CurrentDegreeN = longToBinaryString(power(n, currentDegree));
            while ( (index = binaryNumber.indexOf(CurrentDegreeN)) >= 0) {
//                System.out.println("\tFound = " + binaryNumber.substring(index, index + CurrentDegreeN.length()));
                resultParts.add(binaryNumber.substring(index, index + CurrentDegreeN.length()));
                binaryNumber = binaryNumber.replaceFirst(CurrentDegreeN, "*");
            }
        }
        return resultParts;
    }

    public static void main(String[] args) {
        Bobry bobry = new Bobry();
        List<String> parts = bobry.getMinBinaryParts("110011011", 5);
        System.out.println("\nResult:");
        if (parts.size() > 0) {
            System.out.println("Count of parts = " + parts.size());
            for (String part : parts) {
                System.out.print(part + "  ");
            }
        } else {
            System.out.println("-1");
        }
    }
}

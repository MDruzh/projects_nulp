package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public String readInputText() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        return br.readLine();
    }

   public String processText(String inputText){
    		inputText = inputText.replaceAll("-\\(\\)", "");
        Pattern pattern = Pattern.compile("0\\s?\\(?800\\)?\\s?[0-9]{3}\\s?\\d{3}");


       Matcher matcher = pattern.matcher(inputText);

        StringBuffer sb = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(sb, "HOT_LINE");
        }
       matcher.appendTail(sb);

        return sb.toString();
    		
    }

    public void showResults(String resultText){
        System.out.println(resultText);
    }

}

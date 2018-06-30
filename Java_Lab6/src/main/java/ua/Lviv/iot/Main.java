//package ua.Lviv.iot;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Exhibition exhibition = new Exhibition(10, "Roman Empire", 12.5);
//
//        exhibition.addExhibit(new Sword(ExhibitName.SWORD, ExhibitAge.SEVENBC, "Weapon", "Rome", "Average", 5.4, 1.2));
//        exhibition.addExhibit(
//                new Shield(ExhibitName.SHIELD, ExhibitAge.SIXBC, "Weapon", "Rome", "Average", 5.4, "Square"));
//        exhibition.addExhibit(
//                new Clothes(ExhibitName.CLOTHES, ExhibitAge.FIVEBC, "ua.Lviv.iot.Clothes", "Rome", "Average", 5.4, "Leather"));
//        exhibition.addExhibit(
//                new Chronicle(ExhibitName.CHRONICLE, ExhibitAge.EIGHTBC, "ua.Lviv.iot.Chronicle", "Rome", "Average", 5.4, 234));
//
//        boolean menu = true;
//        while (menu) {
//            System.out.println("Menu:");
//            System.out.println("1 - Print list of exhibits");
//            System.out.println("2 - Find by age");
//            System.out.println("3 - Print list of exhibits sorted by age ");
//            System.out.println("4 - Exit");
//
//            Scanner scan = new Scanner(System.in);
//            int num = scan.nextInt();
//
//            switch (num) {
//                case 1: {
//                    System.out.println(exhibition.getExhibitList());
//                    break;
//                }
//                case 2: {
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("Enter the age to find: ");
//                    int ageToFind = scanner.nextInt();
//                    System.out.println(exhibition.findExhibitByAge(ageToFind));
//                    break;
//                }
//                case 3: {
//                    System.out.println(exhibition.sortExhibitByAge());
//                    break;
//                }
//                case 4:
//                default: {
//                    menu = false;
//                    System.out.println("Exit program...");
//                    break;
//                }
//            }
//
//        }
//    }
//}
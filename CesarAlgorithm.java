import java.util.Scanner;

public class CesarAlgorithm {
    public static void main(String[] args) {
        int pos = imput1();
        String str = imput2();
        boolean leftOrRight = imput3();
        int size = str.length();
        char[] arr = new char[size];
        arr = declaration(str, arr);
        algorithm(leftOrRight, pos, arr, str);
        print(arr);
    }

    public static void algorithm(boolean leftOrRight, int pos, char[] arr, String str) {
        pos = pos % 26;
        if (leftOrRight) {
            rightShift(pos, arr, str);
        }
        else {
            leftShift(pos, arr, str);
        }
    }
    public static void rightShift(int pos, char[] arr, String str){
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = caseForUppercaseRight(arr[i], pos);
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = caseForLowercaseRight(arr[i], pos);
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                arr[i] = caseForNumbersRight(arr[i], pos);
            }
        }
    }
    public static void leftShift(int pos, char[] arr, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = caseForUppercaseLeft(arr[i], pos);
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = caseForLowercaseLeft(arr[i], pos);
            } else if (arr[i] >= '0' && arr[i] <= '9') {
                arr[i] = caseForNumbersLeft(arr[i], pos);
            }
        }
    }
    public static char[] declaration(String str, char[] arr) {
        arr = str.toCharArray();
        return arr;
    }

    public static int imput1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many times you want to move the element");
        int pos = scan.nextInt();
        return pos;
    }

    public static String imput2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("imput string");
        String str = scan.nextLine();
        return str;
    }
    public static boolean imput3(){
        Scanner scan = new Scanner(System.in);
        int i;
        do {
        System.out.println("Left decod or Right decod");
        System.out.println("For left imput 0");
        System.out.println("For right imput 1");
        i = scan.nextInt();} while (i < 0 || i > 1);
        if (i == 1)
             return true;
        return false;
    }
    private static char caseForUppercaseRight (char member, int position) {
        while (position > 0) {
            if (member + 1 == 91) {
                member = 'A';
                position--;
            }else {
                member += 1;
                position--;
            }
        }
        return member;
        }
    private static char caseForLowercaseRight(char member, int position) {
        while (position > 0) {
            if (member + 1 == 123) {
                member = 'a';
                position--;
            }else {
                member += 1;
                position--;
            }
        }
        return member;
    }
    private static char caseForNumbersRight(char member, int position) {
        while (position > 0) {
            if (member + 1 == 58) {
                member = '0';
                position--;
            }else {
                member += 1;
                position--;
            }
        }
        return member;
    }
    private static char caseForUppercaseLeft (char member, int position) {
        while (position > 0) {
            if (member - 1 == 64) {
                member = 'Z';
                position--;
            }else {
                member -= 1;
                position--;
            }
        }
        return member;
    }
    private static char caseForLowercaseLeft(char member, int position) {
        while (position > 0) {
            if (member - 1 == 96) {
                member = 'z';
                position--;
            }else {
                member -= 1;
                position--;
            }
        }
        return member;
    }
    private static char caseForNumbersLeft(char member, int position) {
        while (position > 0) {
            if (member - 1 == 47) {
                member = '9';
                position--;
            }else {
                member -= 1;
                position--;
            }
        }
        return member;
    }
    public static void print (char[] arr){
        for(char x : arr){
            System.out.print(x);
        }
    }
    }

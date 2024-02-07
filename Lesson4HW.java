package lesson4;

public class Lesson4HW {
    public static void main(String[] args) {
        System.out.println("14: " + isDividedBy5Or7(14));
        System.out.println("11: " + isDividedBy5Or7(11));
        System.out.println("leap 1900: " + isLeapYear(1900));
        System.out.println("leap 2024: " + isLeapYear(2024));
        System.out.println("leap 2025: " + isLeapYear(2025));
        System.out.println("contsins 76 64: " + contains(76, 64));
        System.out.print("printSeconds 3662: ");
        printSeconds(3662);
        System.out.println("10 eur convert yen: " + convert(10,'Y'));
    }
    public static double convert(double e, char c){
        if(c=='R'){
            return e*97.46; } else if (c == 'D') {
            return e*1.07;
        } else if (c == 'Y') {
            return e*158.98;
        } else if (c == 'G') {
            return e*0.85;
        } else {
            return 0;
        }
    }

    public static void printSeconds(int t) {
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = (t - h * 3600 - m * 60);
        System.out.println("" + h + ":" + m + ":" +s);
    }

    public static boolean contains(int a, int b) {
        String f = " " + a;
        String s = " " + b;
        String f1 = f.substring(0, 1);
        String f2 = f.substring(1, 2);
        return s.contains(f1) || s.contains(f2);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDividedBy5Or7(int number) {
        boolean result = (number % 7 == 0) || (number % 5 == 0);
        return result;

    }

}

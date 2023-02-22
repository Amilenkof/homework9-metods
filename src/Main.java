import java.util.Scanner;

public class Main {

    public static void leapYear (int i) {

        if (i%4==0 && i%100!=0){
            System.out.println("Год "+i+" является високосным");}
        else {
            System.out.println("Год "+i+" не является високосным");
    }}
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int year=2052;
        leapYear(year);
    }
}
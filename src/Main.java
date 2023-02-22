import java.util.Scanner;

public class Main {

    public static void leapYear(int i) {
/*Задача 1
Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
Эту проверку вы уже реализовывали в задании по условным операторам.
Текст прошлого задания
Напишите программу, которая определяет, является ли год високосным или нет.
Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
Программа должна определять, високосный год или нет, и выводить соответствующее сообщение: « …. год является
 високосным» или «... год не является високосным».
Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным
является каждый четырехсотый год.
 Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение: «...  год — високосный год».
 Если год невисокосный, то: «... год — невисокосный год».
*/
        if (i % 4 == 0 && i % 100 != 0) {
            System.out.println(i + "  год — високосный год");
        } else {
            System.out.println(i + "  год — не високосный год");
        }
    }

    public static void checkOs(int phoneProductYear, int os) {
        /*Задача 2
Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
Текст прошлого задания
У банка появилось мобильное приложение. Когда пользователь заходит на сайт с телефона, ему предлагается скачать приложение
 с учетом операционной системы и года выпуска телефона.
Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
Для Android: «Установите облегченную версию приложения для Android по ссылке».
Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить облегченную версию.
Текущий год можно получить таким способом:
int currentYear = LocalDate.now().getYear();
Или самим задать значение вручную — ввести в переменную числовое значение.
В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для
 какой ОС (Android или iOS) установить пользователю.*/

        if (phoneProductYear < 2015) {
            if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        } else {
            if (os == 1) {
                System.out.println("Установите  версию приложения для Android по ссылке");
            } else
                System.out.println("Установите  версию приложения для IOS по ссылке");
        }
    }

    public static int durationDelivery(int distance) {
        int duration = 0;
        if (distance <= 20) {
            duration +=1;
        } else if (distance > 20 && distance < 60) {
            duration +=2;
        } else if (distance >= 60 && distance < 100) {
            duration +=3;
        } else if (distance >= 100){
            System.out.println("К сожалению, мы не сможем доставить карту");}


        return duration;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1.");

        int year = 2052;
        leapYear(year);


        System.out.println("Задание 2.");
        int yearPhone = 2022;
        int os = 0;
        checkOs(yearPhone, os);

        System.out.println("Задание 3.");
        int distanceNew = 95;
         System.out.println("Потребуется дней: " +durationDelivery(distanceNew));
    }


}
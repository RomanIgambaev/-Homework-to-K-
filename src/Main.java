import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Привет, я сравниваю два числа введи первое число");
            int fir;
            int sec;
            fir = scanner.nextInt();
            System.out.println("Твоё число " + fir + " введи второе число");
            sec = scanner.nextInt();
            if (fir > sec) {
                System.out.println(fir + ">" + sec);
            } else if (fir < sec) {
                System.out.println(fir + "<" + sec);
            } else if (fir == sec) {
                System.out.println(fir + "=" + sec);
            }
        }catch (Exception ex){
            System.out.println("Ты ввёл что-то не так");
        }
    }
}
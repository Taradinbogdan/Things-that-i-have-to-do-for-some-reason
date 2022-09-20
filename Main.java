import java.util.Scanner;
public class Main {
    //1.done!
    public static void main(String[] args) {

        //2.
        byte a1 = 127;
        short b1 = 32767;
        int c1 = 2147483647;
        long d1 = 9223372036854775807L;//if im adding more numbers after 9-th without the "L"-
        // it says that it's too large

        float e1 = 120.0f;
        double f1 = 15.72775;
        boolean g1 = false;//just like our life's
        char h1 = '\uffff';//oof:)
        //done!

        //3.
        int a = 9;
        int b = 4151420;
        int c = 2311420;
        int d = 2015;
        //i used words to numbers translator, but i didn't found the one that goes backwards
        int e = a*(b+(c/d));
        System.out.println(e);//it says 37373103 witch means... i don't know what it means
        //done!

        //4.
        Scanner inner = new Scanner(System.in);
        System.out.println("Input a number(ts gotta be the number from 10 to 20 or 'i' will give 'false'): ");
        int f = inner.nextInt();
        if (f >= 10 && f <= 20) {
            System.out.println("true:)");
        } else {
            System.out.println("false:(");
        }
        //done!

        //5.
        System.out.println("Input a number so 'i' will say if its even or no: ");
        int g = inner.nextInt();
        if (g % 2 == 0) {
            System.out.println("even (ﾉﾟ▽ﾟ)ﾉ");
        } else {
            System.out.println("odd number (ﾉ-_-)ﾉ");
        }
        //done!

        //6.
        System.out.println("Input a negative number so 'i' will say 'true' or nothing: ");
        int h = inner.nextInt();
        if (h < 0) {
            System.out.println("true (≖ ‿ ≖)");
        } else {
            System.out.println("✿_✿");
        }
        //done!

        //7.
        System.out.println("g~I~v~E m~E y~O~u~R n~A~m~E ✿_✿: ");
        String i = inner.nextLine();
        System.out.println("H~e~L~l~O " + i + " ✿‿✿ смотреть комментарий");// тут я вообще хз
        // в онлайн эмуляторе консоли все работает збс но тут хер как бы
        // если знаете как исправить отпишите
        //wrode done

        //8.
        System.out.println("Input a year and i will say it is leap or no but exept those that divisible to 100 exept those that divisible to 400 idk: ");
        //високосный на английском звучит как сексуальная ориентация "bissextile" и это не норм
        int j = inner.nextInt();
        if (j % 4 == 0 && j % 100 != 0 || j % 400 ==0) {
            System.out.println("leap(￣-￣)");
        } else {
            System.out.println("nonleap(￣‿￣)");
        }


    }
}
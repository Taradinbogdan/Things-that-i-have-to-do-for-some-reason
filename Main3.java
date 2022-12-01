import java.util.Scanner;
import java.util.Random;
public class Main3 {
    public static void main(String[] args) {
        //subject 1
        Random rand = new Random();
        int x = rand.nextInt(10);
        System.out.println("Guess the number from 0 to 9 :)");//юзайте 4-ку, так шансы больше
        Scanner scanner = new Scanner(System.in);
        for (int z = 1; z < 4; z++) {
            int y = scanner.nextInt();
            if (z == 3) {
                System.out.println("Time is up (0_0)");
                break;
            }
            if (y == x) {
                System.out.println("You're god damn right~");
                break;
            } else if (y < x) {
                System.out.println("A little higher");
            } else if (y > x) {
                System.out.println("A little lower");
            }
        }
        //subject 2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String q = words[rand.nextInt(words.length)];
        String d = q;
        System.out.println("Guess the word now +_+");
        System.out.println("Its an eatable and not cooked thing");
        int w = 0;
        char r = '#';
        while (w > -1) {
            String y = scanner.nextLine();
            if (y.length() > q.length()) {
                y = y.substring(0, (q.length()));
            }
            for (int e = 0; e < y.length(); e++){
                if (y.charAt(e) == q.charAt(e)) {
                    w += 1;
                } else {
                    y = y.substring(0, e) + r + y.substring(e + 1);
                }
            }
            if (w < q.length()) {
                w = 0;
            }
            System.out.println(y);
            if (w == q.length()) {
                System.out.println("Good job ^-^");
                break;
            }
        }
    }
}
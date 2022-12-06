import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static final int size = 5;
    public static final int conditions = 4;
    public static final char slash = '-';
    public static final char cross = 'x';
    public static final char circles = 'o';
    public static Scanner input = new Scanner(System.in);
    public static char[][] gameField;
    public static void initGameField() {
        gameField = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameField[i][j] = slash;
            }
        }
    }
    public static void printGameField() {
        for (int i = 0; i <= gameField.length; i++) {
            System.out.print(i == 0 ? "  " : i + " ");
        }
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isCellAvailable(int x, int y) {
        return x >= 0 && x < size && y >= 0 && y < size && gameField[y][x] == slash;
    }
    public static void player1Move() {
        int x, y;
        do {
            System.out.printf("Imput those mutherf#ckers in order like <column> <space> <line> \n");
            printGameField();
            x = Integer.valueOf(input.next()) - 1;
            y = Integer.valueOf(input.next()) - 1;
        } while (!isCellAvailable(x, y));
        gameField[y][x] = cross;
    }
    public static void player2Move() {
        int x, y;
        do {
            x = new Random().nextInt(size);
            y = new Random().nextInt(size);
        } while (!isCellAvailable(x, y));
        System.out.println("AI turn " + (x + 1) + " " + (y + 1));
        gameField[y][x] = circles;
    }
    public static boolean isWin(char playerDot) {
        int hor, ver;
        int diagMain, diagReverse;
        for (int i = 0; i < size; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < size; j++) {
                if (gameField[i][j] == playerDot) {
                    hor++;
                } else if (gameField[i][j] != playerDot && hor < conditions) {
                    hor = 0;
                }
                if (gameField[j][i] == playerDot) {
                    ver++;
                } else if (gameField[j][i] != playerDot && ver < conditions) {
                    ver = 0;
                }
            }
            if (hor >= conditions || ver >= conditions) {
                return true;
            }
        }
        for (int j = 0; j < size; j++) {
            diagMain = 0;
            for (int i = 0; i < size; i++) {
                int k = j + i;
                if (k < size) {
                    if (gameField[i][k] == playerDot) {
                        diagMain++;
                    } else if (gameField[i][k] != playerDot && diagMain < conditions) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= conditions) {
                    return true;
                }
            }
        }
        for (int j = 1; j < size; j++) {
            diagMain = 0;
            for (int i = 0; i < size; i++) {
                int k = j + i;
                if (k < size) {
                    if (gameField[k][i] == playerDot) {
                        diagMain++;
                    } else if (gameField[k][i] != playerDot && diagMain < conditions) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= conditions) {
                    return true;
                }
            }
        }
        for (int j = 0; j < size; j++) {
            diagReverse = 0;
            for (int i = 0; i < size; i++) {
                int k = (size - 1) - i;
                int l = j + i;
                if (k >= 0 && l < size) {
                    if (gameField[l][k] == playerDot) {
                        diagReverse++;
                    } else if (gameField[l][k] != playerDot && diagReverse < conditions) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= conditions) {
                    return true;
                }
            }
        }
        for (int j = 1; j < size; j++) {
            diagReverse = 0;
            for (int i = 0; i < size; i++) {
                int k = (size - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k] == playerDot) {
                        diagReverse++;
                    } else if (gameField[i][k] != playerDot && diagReverse < conditions) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= conditions) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isDraw() {
        for (char[] aGameField : gameField) {
            for (int j = 0; j < gameField.length; j++) {
                if (aGameField[j] == slash) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        initGameField();
        System.out.printf("It's crosses and circles");

        switch (new Random().nextInt(2)) {
            case 0: {
                System.out.println("\n Your turn");
                while (true) {
                    player1Move();
                    printGameField();
                    if (isWin(cross)) {
                        System.out.println("I guess you won");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Even");
                        break;
                    }
                    player2Move();
                    printGameField();
                    if (isWin(circles)) {
                        System.out.println("AI wins - FATALITY");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Even");
                        break;
                    }
                }
                break;
            }
            case 1: {
                System.out.println("\n AI turn");
                while (true) {
                    player2Move();
                    printGameField();
                    if (isWin(circles)) {
                        System.out.println("AI wins - FATALITY");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Even");
                        break;
                    }
                    player1Move();
                    printGameField();
                    if (isWin(cross)) {
                        System.out.println("I guess you won");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Even");
                        break;
                    }
                }
            }
        }
    }
}
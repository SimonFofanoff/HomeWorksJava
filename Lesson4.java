import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static char[][] map;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_0 = '0';
    public static int SIZE = 4;
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args){
        InitMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (WinnerCheck(DOT_X)){
                System.out.println("Победил человек");
                break;
            }
            if (isFullMap()){
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (WinnerCheck(DOT_0)){
                System.out.println("Победил компьютер");
                break;
            }
            if (isFullMap()){
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Конец игры!");
        printMap();
    }
    public static void InitMap(){
        map = new char[SIZE][SIZE];
        for ( int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap(){
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты X и Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }
    public static void aiTurn(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }
        while (!isCellValid(x, y));
        System.out.println("ИИ сходил в точку: " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
    }
    public static boolean isFullMap(){
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j ++){
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return false;
    }
    public static boolean WinnerCheck(char Char){
        for ( int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == Char) {
                    if (i == j || i + j == 3) return true;
                    else return false;
                }
            }
        }
        return false;
    }
}
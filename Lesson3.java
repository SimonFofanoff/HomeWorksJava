import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args){
//        int[] OneZero = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        Task1();
        int[] myArray = new int[100];
        Task2(myArray);
        System.out.println("Второе задание: " + Arrays.toString(myArray));
        Task3();
        System.out.println("Четвертое задание: ");
        Task4();
        int[] MyArray2 = Task5(10, 77);
        System.out.println("Пятое задание: " + Arrays.toString(MyArray2));
    }
    public static void Task1(){
        int[] OneZero = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Первое задание: " + Arrays.toString(OneZero));
        for (int i = 0; i < OneZero.length; i++){
            int x = OneZero[i];
            if (x < 1){
                OneZero[i] = 1;
            } else {
                OneZero[i] = 0;
            }
        }
        System.out.println("                " + Arrays.toString(OneZero));
    }
    public static void Task2(int[] ZeroHundred){
        for (int i = 0; i < ZeroHundred.length; i++){
            ZeroHundred[i] = i + 1;
        }
    }
    public static void Task3() {
        int[] MultiplyByTwo = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Третье задание: " + Arrays.toString(MultiplyByTwo));
        for (int i = 0; i < MultiplyByTwo.length; i++){
            int x = MultiplyByTwo[i];
            if (x < 6){
                MultiplyByTwo[i] = x * 2;
            }
        }
        System.out.println("                " + Arrays.toString(MultiplyByTwo));
    }
    public static void Task4(){
        int[][] arrayDiagonal = new int[5][5];
        for (int i = 0; i < arrayDiagonal.length; i++){
            for (int j = 0; j < arrayDiagonal.length; j++){
                int x = (i + j);
                if (x == 4){
                    arrayDiagonal[i][j] = 1;
                } if (i == j){
                    arrayDiagonal[i][j] = 1;
                }
                System.out.print(arrayDiagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] Task5(int len, int initialValue){
        int[] ArrayArray = new int[len];
        len = ArrayArray.length;
        for (int i = 0; i < len; i++){
            ArrayArray[i] = initialValue;
        }
        return ArrayArray;
    }
}

/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
(можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
[0][0], [1][1], [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
массива равны.
**Примеры:
checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1

граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива
на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
[ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/
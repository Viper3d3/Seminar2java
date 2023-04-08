package Seminar3;

import java.util.LinkedList;
import java.util.List;

//// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.
public class seminar4 {

    static LinkedList<Integer> linList = new LinkedList<>();
    static LinkedList<Integer> reversedList = new LinkedList<>();
    public static void main(String[] args) {

        linList.add(1);
        linList.add(2);
        linList.add(3);
        linList.add(4);
        linList.add(5);
        linList.add(6);
        linList.add(7);
        linList.add(8);
        System.out.println(linList);
        reversed();
    }
    public static List reversed(){

        for (int i = linList.size() - 1; i >= 0; i--) {
            reversedList.add(linList.get(i));
        }
        System.out.println(reversedList);
        return linList;
    }
}


















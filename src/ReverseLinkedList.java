import java.util.LinkedList;

public class ReverseLinkedList {
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (Integer element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }

    public static void main(String[] args) {
        // создаем связанный список и добавляем несколько элементов
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // выводим оригинальный список
        System.out.println("Оригинальный список: " + list);

        // вызываем метод для переворота списка
        LinkedList<Integer> reversed = reverseList(list);

        // выводим перевернутый список
        System.out.println("Перевернутый список: " + reversed);
    }
}
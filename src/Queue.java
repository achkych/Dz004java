import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        return list.pollFirst();
    }

    public T first() {
        return list.getFirst();
    }

    public static void main(String[] args) {
        // Создаем новую очередь
        Queue<String> queue = new Queue<>();

        // Добавляем элементы в очередь
        queue.enqueue("Первый");
        queue.enqueue("Второй");
        queue.enqueue("Третий");

        // Получаем первый элемент без удаления
        System.out.println(queue.first()); // "Первый"

        // Извлекаем первый элемент из очереди
        String firstElement = queue.dequeue();

        // Проверяем, что он соответствует ожидаемому
        System.out.println(firstElement); // "Первый"

        // Получаем первый элемент после извлечения
        System.out.println(queue.first()); // "Второй"
    }
}

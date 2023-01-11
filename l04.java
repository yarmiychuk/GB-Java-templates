import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// Приоритетные коллекции

// LinkedList - двухсвязный список
// Каждая ячейка знает, где в памяти находится следующий элемент дынного списка
// Важно! Чтобы дойти до N элемента списка, нужно пройти все предыдущие
// Отличие от массивов - достаточно знать расположение первой ячейки, и дальше вычислить где находится искомая 

// Двусвязный список - знает и о предыдущем элементе тоже

// Queue - Очерёдный список
// Работает с теми данными, которые были добавлены в последнюю очередь

// PriorityQueue - рработает с ПЕРВЫМ элементом

// Dequeue - работает в обратку (см. код ниже)

// Stack - работает с последними поступившими данными 1 2 + 3 * = (1 + 2) * 3 -  УСТАРЕВШЕЕ

public class l04 {

    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        
        Queue<Integer> queue = new LinkedList<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1456);
        pq.add(666);
        pq.add(136);
        pq.add(76);
        // Вывод: 7б 13б 145б 666
    }

}
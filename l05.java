import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Map
// Ключ-значение
// Ключи уникальны
// Ускоренная обработка данных
// Порядок не важен

public class l05 {
    
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        // Добавить, если возможно. Усли уже есть 1, ничего не произойдёт
        db.putIfAbsent(1, "Один");
        // Обычное добавление, значение перезаписывается, если ключ есть
        db.put(2, "Два");
        // Получить значение по ключу
        db.get(2);
        // Удалить запись по ключу
        db.remove(2);
        // Проверка наличия ключа/значения
        db.containsKey(2);
        db.containsValue("Один");
        // Набор ключей/значений
        db.keySet();
        db.values();

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s", item.getKey(), item.getValue());
        }
    }

    // TreeMap
    // Значения хранятся по ключу
    public static void aboutTreeMap() {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(2, "Два");
        tm.put(1, "Один");
        tm.put(3, "Три");
        System.out.println(tm);
        // 1=Один, 2=Два, 3=Три
    }

    // LinkedHashMap - более медлительный, ибо
    // Помнит порядок добавления элементов
    public static void aboutLinkedHashMap() {
        TreeMap<Integer, String> lm = new TreeMap<>();
        lm.put(2, "Два");
        lm.put(1, "Один");
        lm.put(3, "Три");
        System.out.println(lm);
        // 1=Один, 2=Два, 3=Три
    }

    // HashTable - устаревшая, ибо
    // Не позволяет хранить null в качестве ключа
}

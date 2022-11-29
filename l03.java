import java.util.ArrayList;
import java.util.Iterator;

public class l03 {
    
    public static void main(String[] args) {
        Object obj = 1;
        showType(obj); // Integer
        obj = 1.2;
        showType(obj); // Double
        
        // Списки
        ArrayList<Integer> list = new ArrayList<>();
    
        // Итераторы - ???
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            // col.remove();
            // col.next();
        }
    }

    static void showType(Object o) {
        System.out.println(o.getClass().getName());
    }

}

import java.util.Arrays;
import java.util.HashSet;

// HashSet - множество

// TreeSet
// В основе HashMap
// Упорядочен по возрастанию
// null'ов быть не может

// LinkedHashSet
// В основе HashMap
// Помнит порядок


// Создание собственных типов
public class l06set {

    public void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя1";
        w1.lastName = "Фамилия1";
        w1.salary = 100;
        w1.id = 1;

        Worker w2 = new Worker();
        w2.firstName = "Имя2";
        w2.lastName = "Фамилия2";
        w2.salary = 200;
        w2.id = 2;

        Worker w3 = new Worker();
        w3.firstName = "Имя3";
        w3.lastName = "Фамилия3";
        w3.salary = 300;
        w3.id = 3;

        Worker w4 = new Worker();
        w4.firstName = "Имя4";
        w4.lastName = "Фамилия4";
        w4.salary = 400;
        w4.id = 4;

        HashSet<Worker> workers = new HashSet<>(Arrays.asList(w1, w2, w3, w4));

    }
    
}

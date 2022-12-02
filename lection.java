import java.util.Random;

// На вход некоторому исполнителю
// подаётся два числа (a, b).

// У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раз (xC), а умножается на c
// - команда 2 (к2): увеличить на d ( +d ), к a прибавляется d
// написать программу, которая выдаёт общее количество
// возможных преобразований a в b.

// a < b; a, b, c, d - натуральные

// Пример 1: а = 2, b = 7, c = 2, d = 1 ответ 3

// Подумать как можно показать хотя бы один маршрут преобразования

// ответ: (+1) (x2) (+1) или (х2) (+1) (+1) (+1)
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения.

// РЕШЕНИЕ
// f(x) = 
// x-c, x%d == 1
// x-c + x/d, x%d==0

public class lection {
    static public void main(String[] args) {
        int a = 2; //getNumber("a");
        System.out.printf("a: %s", a);
        int b = 7; //getNumber("b");
        System.out.printf("b: %s", b);
        int c = 2; //getNumber("b");
        System.out.printf("c: %s", c);
        int d = 1; //getNumber("b");
        System.out.printf("d: %s", d);

        // Пример 1: а = 2, b = 7, c = 2, d = 1 ответ 3
        int count = 0;
        int temp;
        for (int j = 0; j < b - a; j++) {
            for (int i = 0; i < a % c; i++) {
                temp = a;
                
                // a = d+d+d+d+d
                // a = *c+d+d+d
                // a = +d*c+d
                while ((j * b + temp) * (i * d) < b) {
                    temp += d;
                    if (temp == b) {
                        count++;

                    }
                }
            }

        }

        System.out.printf("count: %s", count);
    }

    static int getNumber(String name) {
        Random r = new Random();
        int number = r.nextInt(100);
        return number;
    }
}

// def seminar(a, b, c, d):
// res = []
// while a <= b:
//     a = a * c
//     if a <= b:
//         res.append(c)
//     else:
//         a = a + d
//         res.append(d)
// return res
// res = seminar(1, 7, 2, 1)
// print(res)    


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class program {
    static public void main(String[] args) {

    }

    static void code() {
        System.out.println("Hello world!");
        Scanner mScanner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = mScanner.nextLine();
        System.out.printf("Привет, %s!", name);

        System.out.printf("int: ");
        int x = mScanner.nextInt();
        System.out.println(x);

        String res = String.format("%d + %d = %d", 2, 3, 5);
        System.out.println(res);

        mScanner.close();

        sayHi();

        int a = 1;
        int b = 2;
        int min = a < b ? a : b; // 1

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {   // i - чётное?
                continue;       // Пропускает код ниже, возвращаясь к началу цикла
            }
            System.out.println(i);
        }
    }

    static void sayHi() {
        System.out.println("Hi!");
    }

    static void writeFile() {
        try (FileWriter fw = new FileWriter("file.txt", false);) {
            fw.write("line 1");
            fw.append("\n");
            fw.write("line 2");
            fw.append("\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void readFile() {
        try (FileReader fr = new FileReader("file.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                System.out.println(ch);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void readFile2() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
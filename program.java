import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.io.BufferedReader;
import java.io.File;
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

    static void file() {
        try {
            // Код, где может появиться ошибка
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println(f3.getAbsolutePath());
        } catch (Exception ex) {
            // Обработка ошибки
        }
        finally {
            // Код, который выполнится в любом случае
        }
    }

    static void myLogger() {
        // Параметр Логгера - класс для логгирования 
        Logger logger = Logger.getLogger(program.class.getName());

        // Для работы с консолью
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        
        // Для работы с файлами
        try {
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Простой формат вывода
        SimpleFormatter sFormatter = new SimpleFormatter();
        info.setFormatter(sFormatter);

        // Формат вывода xml (предпочтительнее)
        XMLFormatter xml = new XMLFormatter();
        info.setFormatter(xml);

        // Вывод
        logger.log(Level.WARNING, "Текст предупреждения 1");
        logger.info("Тест предупреждения 2");
    }
}
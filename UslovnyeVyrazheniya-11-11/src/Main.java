
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        *Задача 1:
        Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
c = b*a*(a + b)/(a2),      где a2 - a в квадрате
Совпадает ли результат выражения, если a и b — переменные типа int
(для проверки не забудьте также использовать подходящий метод Scanner)?
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("задача 1");
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        int aa = scanner.nextInt(), bb = scanner.nextInt();
        System.out.println(b * a * (a + b) / (a * a));
        System.out.println(bb * aa * (aa + bb) / (aa * aa));
        System.out.println("************************");
        /*
        Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:
a3 > b2,  где a3 - a в кубе, b2 - b  в квадрате
         */
        System.out.println("задача 2");
        int aA = scanner.nextInt(), bB = scanner.nextInt();
        System.out.println(aA * aA * aA > bB * bB);
        System.out.println("************************");
        /*
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        b += a++;
        System.out.println(b);
    }
}
Значение b, выведенное на экран совпадает с тем, что вы ожидали увидеть?
         */
        System.out.println("задача 3");
        int aaA = 1;
        int bbB = aaA++;//сначала присвоили значение bbB=aaA=1, потом увеличили aaA, aaA=1+1
        bbB += aaA++; //bbB сначала сложили bbB=1+aaA2, потом увеличили aaA на 1, aaA=2+1
        System.out.println(bbB);
        scanner.close();
    }
}
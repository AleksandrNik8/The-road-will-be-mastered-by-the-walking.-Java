public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        a = a + b;
        b = a + b;
        a = b - a;
        b = b - 2 * a;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
        System.out.println("задача 2");
        String str = "Ale";
        char k = 'k';
        char s = 's';
        String str2 = "a";
        char n = 'n';
        char d = 'd';
        char r = 'r';
        System.out.println(str + k + s + str2 + n + d + r);
        System.out.print('A' + "\n" + 'l' + "\n" + 'e' + "\n" + 'k' + "\n" + 's' + "\n" + 'a' + "\n" + 'n' + "\n" + 'd' + "\n" + 'r');
    }
}
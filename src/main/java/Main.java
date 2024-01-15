import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число:");
            tree.add(scanner.nextInt());
            System.out.println("Ок!");
        }
    }
}

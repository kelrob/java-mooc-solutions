import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] strings = input.split(" ");
            printFirstWords(strings);
        }
    }

    public static void printFirstWords(String[] strings) {
        System.out.println(strings[0]);
    }
}

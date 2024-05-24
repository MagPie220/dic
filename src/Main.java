import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DigitDictionary digitDictionary = new DigitDictionary();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите ключ");
            String key = scanner.nextLine();
            System.out.println("Введите значение");
            String value = scanner.nextLine();
            digitDictionary.put_word(key, value);
            digitDictionary.print_dictionary();
        }
    }
}
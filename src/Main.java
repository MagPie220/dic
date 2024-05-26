import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DigitDictionary digitDictionary = new DigitDictionary();
        LatinDictionary latinDictionary = new LatinDictionary();
        boolean isWorking = true;
        try {


            System.out.println("Введите какой словарь Вы хотите использовать:\n 1) С цифрами (второе вводимое число должно состоять из 5-и цифр)\n 2) C латинскими буквами (вводимая строка дожна состоять из 4-х букв латинского языка");
            int what_digit = scanner.nextInt();
            while (isWorking) {
                switch (what_digit) {
                    case (1):
                        System.out.println("\nВы находитесь в циферном словаре");
                        System.out.println("\nВведите:\n1) Если Вы хотите поместить новое значение в словарь \n2) Если Вы хотите заменить уже имеющуюся запись \n3) Вывести словарь \n4) Сохранить словарь \n5) Открыть имеющийся словарь \n0) Выход\n");
                        switch (scanner.nextInt()) {
                            case (1):
                                System.out.println("Введите ключ");
                                String key_digit = scanner.next();
                                System.out.println("Введите значение");
                                String value_digit = scanner.next();
                                digitDictionary.put_word(key_digit, value_digit);
                                break;
                            case (2):
                                System.out.println("Введите ключ");
                                String old_key_digit = scanner.next();
                                System.out.println("Введите значение");
                                String new_value_digit = scanner.next();
                                digitDictionary.replace_word(old_key_digit, new_value_digit);
                                break;
                            case (3):
                                System.out.println("\nВаш словарь:");
                                digitDictionary.print_dictionary();
                                break;
                            case (0):
                                isWorking = false;
                                break;
                            case (4):
                                System.out.println("Введите имя словаря");
                                String path_digit = scanner.next();
                                digitDictionary.save_dictionary(path_digit);
                                break;
                            case (5):
                                System.out.println("Введите имя словаря");
                                String path_digit_open = scanner.next();
                                digitDictionary.set_dictionary(digitDictionary.open_dictionary(path_digit_open));
                                break;
                        }
                        break;
                    case (2):
                        System.out.println("\nВы находитесь в латинском словаре");
                        System.out.println("\nВведите:\n1) Если Вы хотите поместить новое значение в словарь \n2) Если Вы хотите заменить уже имеющуюся запись \n3) Вывести словарь \n4) Сохранить словарь \n5) Отрыть имеющийся словарь\n0) Выход\n");
                        switch (scanner.nextInt()) {
                            case (1):
                                System.out.println("Введите ключ");
                                String key_latin = scanner.next();
                                System.out.println("Введите значение");
                                String value_latin = scanner.next();
                                latinDictionary.put_word(key_latin, value_latin);
                                break;
                            case (2):
                                System.out.println("Введите ключ");
                                String old_key_latin = scanner.next();
                                System.out.println("Введите значение");
                                String new_value_latin = scanner.next();
                                latinDictionary.replace_word(old_key_latin, new_value_latin);
                                break;
                            case (3):
                                System.out.println("\nВаш словарь:");
                                latinDictionary.print_dictionary();
                                break;
                            case (0):
                                isWorking = false;
                                break;
                            case (4):
                                System.out.println("Введите имя словаря");
                                String path_latin = scanner.next();
                                latinDictionary.save_dictionary(path_latin);
                                break;
                            case (5):
                                System.out.println("Введите имя словаря");
                                String path_latin_open = scanner.next();
                                latinDictionary.set_dictionary(latinDictionary.open_dictionary(path_latin_open));
                                break;
                        }
                        break;
                    case (0):
                        isWorking = false;
                        break;
                }
            }
        }
        catch (Exception e){
            System.out.println("Ошибка ввода");
        }
    }
}
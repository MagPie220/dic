import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LatinDictionary extends Dictionary {
    public LatinDictionary(){
        REGEX = "[a-zA-Z]{4}$";
        dictionary = new HashMap<String, String>();
    }

    @Override
    public String get_regex() {
        return REGEX;
    }

    @Override
    public Map<String, String> get_map() {
        return dictionary;
    }

    @Override
    public boolean check_word(String word) {
        return word.matches(REGEX);
    }

    @Override
    public void put_word(String key, String value) {
        if(check_word(value)){
            dictionary.put(key, value);
        }
        else {
            System.out.println("/////////////Ошибка при вводе ключа//////////////");
        }
    }

    @Override
    public void print_dictionary() {
        for(Map.Entry<String, String> item:dictionary.entrySet()){
            System.out.println(item.getKey() + "  " + item.getValue());
        }
    }

    @Override
    public String get_value(String key) {
        return dictionary.get(key);
    }

    @Override
    public void save_dictionary(String path) {
        try {
            FileWriter file_dictionary = new FileWriter(path);
            file_dictionary.write("ЛАТИНСКИЙ ");
            for(Map.Entry<String, String> item:dictionary.entrySet()){
                file_dictionary.write(item.getKey() + " " + item.getValue() + " ");
            }
            file_dictionary.close();
            System.out.println("Файл успешно создан, а словарь записан");
        }
        catch (IOException e){
            System.out.println("Ошибка создания файла");
        }
    }

    @Override
    public void replace_word(String old_key, String new_value) {
        if(check_word(new_value)){
            dictionary.replace(old_key, new_value);
        }
        else {
            System.out.println("/////////////Ошибка при вводе ключа//////////////");
        }
    }

    @Override
    public Map<String,String> open_dictionary(String path) {
        Map<String, String> dict = new HashMap<String, String>();
        try(FileReader reader = new FileReader(path))
        {
            int c;
            String s = "";
            while((c=reader.read())!=-1) s+=(char)c;
            String[] words = s.split(" ");
            if(words[0].matches("ЦИФЕРНЫЙ")){
                System.out.println("Вы пытаетесь открыть некоректный словарь");
                return dict;
            }

            for(int i = 0; i < words.length; i = i + 2)
            {
                dict.put(words[i], words[i+1]);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        finally {
            return dict;
        }
    }

    @Override
    public void set_dictionary(Map<String, String> dict) {
        dictionary = dict;
    }
}

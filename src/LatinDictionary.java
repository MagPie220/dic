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
}

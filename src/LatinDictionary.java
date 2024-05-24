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
}

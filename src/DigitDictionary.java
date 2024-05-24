import java.util.HashMap;
import java.util.Map;
public class DigitDictionary extends Dictionary{
    public DigitDictionary(){
        REGEX = "[0-9]{5}$";
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

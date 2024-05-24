import java.util.HashMap;
import java.util.Map;
public class DigitDictionary extends Dictionary{
    public DigitDictionary(){
        REGEX = "[0-9]{5}";
        dictionary = new HashMap<String, String>();
    }
}

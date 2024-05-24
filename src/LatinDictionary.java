import java.util.HashMap;
public class LatinDictionary extends Dictionary {
    public LatinDictionary(){
        REGEX = "[a-zA-Z]{4}";
        dictionary = new HashMap<String, String>();
    }
}

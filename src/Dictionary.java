import java.util.HashMap;
import java.util.Map;
public abstract class Dictionary {
    protected String REGEX;
    protected Map<String, String> dictionary;
    public abstract String get_regex();
    public abstract Map<String, String> get_map();
    public abstract boolean check_word(String word);
    public abstract void put_word(String key, String value);
    public abstract void print_dictionary();
    public abstract String get_value(String key);
    public abstract void save_dictionary(String path);
    public abstract void replace_word(String old_key, String new_value);
    public abstract Map<String, String> open_dictionary(String path);
    public abstract void set_dictionary(Map<String, String> dictionary);
}

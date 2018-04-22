package logic;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionFramework {
    public Map<Character, Integer> countCharacters(String s) {
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            characterIntegerMap.merge(c, 1, (a, b) -> a + b);
        }
        return characterIntegerMap;
    }

}

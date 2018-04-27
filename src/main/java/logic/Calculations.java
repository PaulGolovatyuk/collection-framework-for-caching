package logic;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Calculations {
    private Map<String, String> storedStringsMap;
    private Map<Character, Integer> characterIntegerMap;

    public Calculations() {
        characterIntegerMap = new LinkedHashMap<>();
        storedStringsMap = new HashMap<>();
    }

    public boolean isStringAbsent(String incoming) {
        return storedStringsMap.get(incoming) == null;
    }

    public boolean addToStoredStringsMap(String incoming) {
        boolean isAdded = false;
        if (isStringAbsent(incoming) || storedStringsMap.isEmpty()) {
            storedStringsMap.put(incoming, stringToHashMap(incoming));
            isAdded = true;
        }
        return isAdded;
    }

    private String stringToHashMap(String s) {
        String result = "";
        characterIntegerMap.clear();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            characterIntegerMap.merge(c, 1, (a, b) -> a + b);
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : characterIntegerMap.entrySet()) {
            String key = String.valueOf(characterIntegerEntry.getKey());
            String value = String.valueOf(characterIntegerEntry.getValue());
            result += "\"" + key + "\"" + " - " + value + "\n";
        }
        return result;
    }

    public Map<String, String> getStoredStringsMap() {
        return storedStringsMap;
    }
}

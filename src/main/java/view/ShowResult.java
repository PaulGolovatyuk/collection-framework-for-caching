package view;

import logic.Calculations;

import java.util.Map;


public class ShowResult {
    private Calculations calculations;
    private Map<String, String> storedStrings;
    private String currentKey;
    private String currentValue;

    public ShowResult() {
        calculations = new Calculations();
        storedStrings = calculations.getStoredStringsMap();
    }

    public String buildResultString(String s) {
        StringBuilder result = new StringBuilder();
        calculations.addToStoredStringsMap(s);
        for (Map.Entry<String, String> stringStringEntry : storedStrings.entrySet()) {
            if (stringStringEntry.getKey().equals(s)) {
                currentKey = stringStringEntry.getKey();
                currentValue = stringStringEntry.getValue();
                break;
            }
        }
        result.append(currentKey).append("\n").append(currentValue);

        return result.toString();
    }

}

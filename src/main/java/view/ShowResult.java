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

    public String buildResultString(String incomingString) {
        StringBuilder result = new StringBuilder();
        calculations.addToStoredStringsMap(incomingString);
        currentKey = incomingString;
        currentValue = storedStrings.get(incomingString);
        result.append(currentKey).append("\n").append(currentValue);

        return result.toString();
    }

}

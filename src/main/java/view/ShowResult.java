package view;

import logic.CollectionFramework;

import java.util.Map;

public class ShowResult {

    public void buildResultString(String simple){
        CollectionFramework  collectionFramework = new CollectionFramework();
        System.out.println(simple);
        System.out.println(buildResultString(collectionFramework.countCharacters(simple)));
    }
    private String buildResultString(Map<Character, Integer> map){
        String result = "";
        for (Character character : map.keySet()) {
           String temp;
           temp =  "\""+character+"\""+" - "+map.get(character);
           result += temp+"\n";
        }
        return result;
    }
}

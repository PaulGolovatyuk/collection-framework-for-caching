package logic;

import view.ShowResult;

public class App {
    public static void main(String[] args) {
        CollectionFramework collectionFramework = new CollectionFramework();
        ShowResult showResult = new ShowResult();
        showResult.buildResultString("Shit happens");
    }
}

package view;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShowResultTest {
    private ShowResult showResult = new ShowResult();
    @Test
    public void withoutRepeatingSymbolsTest(){

        String expected = "Light\n"+
                          "\""+"L"+"\""+ " - "+ 1+"\n"+
                          "\""+"i"+"\""+ " - "+ 1+"\n"+
                          "\""+"g"+"\""+ " - "+ 1+"\n"+
                          "\""+"h"+"\""+ " - "+ 1+"\n"+
                          "\""+"t"+"\""+ " - "+ 1+"\n";
        assertEquals(expected, showResult.buildResultString("Light"));
    }
    @Test
    public void withRepeatingSymbolsTest(){

        String expected = "hakkapeliitta\n"+
                          "\""+"h"+"\""+ " - "+ 1+"\n"+
                          "\""+"a"+"\""+ " - "+ 3+"\n"+
                          "\""+"k"+"\""+ " - "+ 2+"\n"+
                          "\""+"p"+"\""+ " - "+ 1+"\n"+
                          "\""+"e"+"\""+ " - "+ 1+"\n"+
                          "\""+"l"+"\""+ " - "+ 1+"\n"+
                          "\""+"i"+"\""+ " - "+ 2+"\n"+
                          "\""+"t"+"\""+ " - "+ 2+"\n";


        assertEquals(expected, showResult.buildResultString("hakkapeliitta"));
    }

    @Test
    public void severalWordsTest(){
        String expected = "Sh*t happens\n"+
                          "\""+"S"+"\""+ " - "+ 1+"\n"+
                          "\""+"h"+"\""+ " - "+ 2+"\n"+
                          "\""+"*"+"\""+ " - "+ 1+"\n"+
                          "\""+"t"+"\""+ " - "+ 1+"\n"+
                          "\""+" "+"\""+ " - "+ 1+"\n"+
                          "\""+"a"+"\""+ " - "+ 1+"\n"+
                          "\""+"p"+"\""+ " - "+ 2+"\n"+
                          "\""+"e"+"\""+ " - "+ 1+"\n"+
                          "\""+"n"+"\""+ " - "+ 1+"\n"+
                          "\""+"s"+"\""+ " - "+ 1+"\n";


        assertEquals(expected, showResult.buildResultString("Sh*t happens"));
    }
    @Test
    public void singleSymbolTest(){
        String expected = "aaaaa\n"+
                          "\""+"a"+"\""+ " - "+ 5+"\n";
        assertEquals(expected, showResult.buildResultString("aaaaa"));
    }

}

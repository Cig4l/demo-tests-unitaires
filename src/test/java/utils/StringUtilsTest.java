package utils;
import fr.diginamic.utils.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    public void testLevenshteinDistance1(){
        StringUtils demo = new StringUtils();
        int res = StringUtils.levenshteinDistance("chat", "char");
        assertEquals(1, res, "la distance de Levenshtein devrait être de 1");
    }
    @Test
    public void testLevenshteinDistance2(){
        StringUtils demo = new StringUtils();
        int res = StringUtils.levenshteinDistance("chat", "chat");
        assertEquals(0, res, "la distance de Levenshtein devrait être de 0");
    }

    @Test
    public void testLevenshteinDistance3(){
        StringUtils demo = new StringUtils();
        int res = StringUtils.levenshteinDistance("distance", "instance");
        assertEquals(2, res, "la distance de Levenshtein devrait être de 2");
    }
}
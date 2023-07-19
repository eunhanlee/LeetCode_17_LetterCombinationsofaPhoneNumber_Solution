import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        String digits1 = "23";
        List<String> expected1 = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual1 = solution.letterCombinations(digits1);
        assertIterableEquals(expected1, actual1);

        String digits2 = "7";
        List<String> expected2 = Arrays.asList("p", "q", "r", "s");
        List<String> actual2 = solution.letterCombinations(digits2);
        assertIterableEquals(expected2, actual2);

        String digits3 = "2";
        List<String> expected3 = Arrays.asList("a", "b", "c");
        List<String> actual3 = solution.letterCombinations(digits3);
        assertIterableEquals(expected3, actual3);

        String digits4 = "";
        List<String> expected4 = new ArrayList<>();
        List<String> actual4 = solution.letterCombinations(digits4);
        assertIterableEquals(expected4, actual4);

        String digits5 = null;
        List<String> expected5 = new ArrayList<>();
        List<String> actual5 = solution.letterCombinations(digits5);
        assertIterableEquals(expected5, actual5);

        String digits7 = "222";
        List<String> expected7 = Arrays.asList("aaa", "aab", "aac", "aba", "abb", "abc", "aca", "acb", "acc", "baa", "bab", "bac", "bba", "bbb", "bbc", "bca", "bcb", "bcc", "caa", "cab", "cac", "cba", "cbb", "cbc", "cca", "ccb", "ccc");
        List<String> actual7 = solution.letterCombinations(digits7);
        assertIterableEquals(expected7, actual7);

        String digits8 = "456";
        List<String> expected8 = Arrays.asList("gjm", "gjn", "gjo", "gkm", "gkn", "gko", "glm", "gln", "glo", "hjm", "hjn", "hjo", "hkm", "hkn", "hko", "hlm", "hln", "hlo", "ijm", "ijn", "ijo", "ikm", "ikn", "iko", "ilm", "iln", "ilo");
        List<String> actual8 = solution.letterCombinations(digits8);
        assertIterableEquals(expected8, actual8);


        System.out.println("All test cases passed.");
    }
}

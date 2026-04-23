import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls


  @Test
  void testConcatValsNormalCase() {
    // Arrange
    Map<Integer, List<Integer>> map = new HashMap<>();
    map.put(1, Arrays.asList(2, 3));
    map.put(2, Arrays.asList(4));
    map.put(3, Arrays.asList(5, 6));

    // Act
    List<Integer> result = Practice.concatVals(map);

    // Assert
    List<Integer> expected = Arrays.asList(2, 3, 4, 5, 6);
    assertEquals(expected, result);
  }

  @Test
  void testConcatValsEmptyMap() {
    // Arrange
    Map<Integer, List<Integer>> map = new HashMap<>();

    // Act
    List<Integer> result = Practice.concatVals(map);

    // Assert
    assertTrue(result.isEmpty());
  }


  // tests for 


}







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


  // tests for mostCommonTimeEfficient(int[] nums)
  @Test
  void testMostCommonNormalCase() {
    // Arrange
    int[] nums = {1, 2, 2, 3, 2};
    // Act
    int result = Practice.mostCommonTimeEfficient(nums);
    // Assert
    assertEquals(2, result);
  }

  @Test
  void testMostCommonWithTie() {
    // Arrange
    int[] nums = {2, 1, 2, 1};
    // Act
    int result = Practice.mostCommonTimeEfficient(nums);
    // Assert
    assertEquals(2, result);
  }

  @Test
  void testMostCommonSingleElement() {
    // Arrange
    int[] nums = {7};
    // Act
    int result = Practice.mostCommonTimeEfficient(nums);
    // Assert
    assertEquals(7, result);
  }


  // test for mostCommonSpaceEfficient(int[] nums)
  


}







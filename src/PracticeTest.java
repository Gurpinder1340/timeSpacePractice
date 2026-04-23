import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}

@Test
public void testMostTimeEfficient() {
  // Arrange
  int [] nums = {2};

  // Act
  int result = Practice.mostCommonTimeEfficient(nums);

  // Assert
  assertEquals(4, result);
}


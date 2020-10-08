package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class PalindromesTest {

  static final String[] inputValues = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  static final boolean[] expectedValues = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  @Test
  public void computeRecursive(){
    for (int i = 0; i < inputValues.length; i++) {
      String input = inputValues[i];
      boolean expected = expectedValues[i];
      boolean actual = Palindromes.testRecursive(input);
      assertEquals(expected, actual);
    }
  }

}

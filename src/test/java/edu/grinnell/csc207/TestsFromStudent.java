package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Sam Schmidt
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()

  /**
   * Will test that set works with a fairly straightforward string.
   * @throws NullKeyException
   */
  @Test
    public void schmidtSamTest01() throws NullKeyException {
    AssociativeArray<String, String> sampleArray = new AssociativeArray<String, String>();
    sampleArray.set("Sample", "Array");
    assertEquals(true, sampleArray.hasKey("Sample"), "Simple setting of an array");
  } // schmidtSamTest01()

  /**
   * Tests that remove works with a fairly simple string.
   * @throws NullKeyException
   */
  @Test
  public void schmidtSamTest02() throws NullKeyException {
    AssociativeArray<String, String> sampleArray = new AssociativeArray<String, String>();
    sampleArray.set("Sample", "Array");
    assertEquals(true, sampleArray.hasKey("Sample"), 
    "Did it set the array?");
    sampleArray.remove("Sample");
    assertFalse(sampleArray.hasKey("Sample"), 
    "Did it remove a key?");
  } // schmidtsSamTest02()

  /**
   * Tests how set and get handle special characters like newline.
   * @throws NullKeyException
   * @throws KeyNotFoundException 
   */
  @Test
  public void schmidtSamEdge01() throws KeyNotFoundException, NullKeyException {
    AssociativeArray<String, String> sampleArray = new AssociativeArray<String, String>();
    sampleArray.set("\nhi\n", "\nthere\n");
    assertEquals("\nthere\n", sampleArray.get("\nhi\n"), "Do newlines work?");
  } // schmidtSamEdge01()
} // class TestsFromSam

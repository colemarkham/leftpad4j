package net.ccmcomputing.leftpad;

import static net.ccmcomputing.leftpad.LeftPad.leftpad;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLeftPad{

   @Test
   public void testLeftpad(){
      assertEquals(leftpad("foo", 5), "  foo");
      assertEquals(leftpad("foobar", 6), "foobar");
      assertEquals(leftpad("1", 2, "0"), "01");
      assertEquals(leftpad("1", 2, "-"), "-1");
   }

}

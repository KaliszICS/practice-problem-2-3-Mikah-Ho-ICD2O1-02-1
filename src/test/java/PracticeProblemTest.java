/**
 * File: Creating Test Cases
 * Author: Mikah Ho
 * Date Created: Mar 12, 2026
 * Date Last Modified: Apr 10, 2026 (i was most definitely not avoiding this assignment)
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void testExample() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   //Function 1 - Circle area
   @Test
   void circleAreaTest1() { //small even
      assertEquals(Math.PI * 4, PracticeProblem.circleArea(2));
   }
   @Test
   void circleAreaTest2() { //large odd
      assertEquals(Math.PI * 67 * 67, PracticeProblem.circleArea(67));
   }
   @Test
   void circleAreaTest3() { //double
      assertEquals(Math.PI * 6.25, PracticeProblem.circleArea(2.5));
   }
   @Test
   void circleAreaTest4() { //another double
      assertEquals(Math.PI * 3.14 * 3.14, PracticeProblem.circleArea(3.14));
   }
   @Test
   void circleAreaTest5() { //decimal fraction
      assertEquals(Math.PI * Math.pow(1/3, 2), PracticeProblem.circleArea(1/3));
   }

   //Function 2 - Minutes to hours
   @Test
   void minToHourTest1() { //even
      assertEquals("1 hours and 30 minutes", PracticeProblem.minutesToHours(90));
   }
   @Test
   void minToHourTest2() { //zero
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }
   @Test
   void minToHourTest3() { //no minutes left
      assertEquals("10 hours and 0 minutes", PracticeProblem.minutesToHours(600));
   }
   @Test
   void minToHourTest4() { //negative? (i was running out of ideas)
      assertEquals("-5 hours and -40 minutes", PracticeProblem.minutesToHours(-340));
   }
   @Test
   void minToHourTest5() { //odd
      assertEquals("12 hours and 19 minutes", PracticeProblem.minutesToHours(739));
   }

   //Function 3 - Simple interest
   @Test
   void simpleInterestTest1() { //even small
      assertEquals(0.8, PracticeProblem.simpleInterest(10, 2, 4));
   }
   @Test
   void simpleInterestTest2() { //zero
      assertEquals(0.0, PracticeProblem.simpleInterest(0, 0, 0));
   }
   @Test
   void simpleInterestTest3() { //odd large negative
      assertEquals(-592372.55, PracticeProblem.simpleInterest(3065, -77, 251));
   }
   @Test
   void simpleInterestTest4() { //double principal
      assertEquals(200.5 * 0.42 * 5, PracticeProblem.simpleInterest(200.5, 42, 5));
   }
   @Test
   void simpleInterestTest5() { //double annual rate
      assertEquals(200 * 0.2896 * 30, PracticeProblem.simpleInterest(200, 28.96, 30));
   }

   //Function 4 - Hypoteneuse
   @Test
   void hypoteneuseTest1() { //small even
      assertEquals(Math.sqrt(52), PracticeProblem.hypotenuse(4, 6));
   }
   @Test
   void hypoteneuseTest2() { //zero
      assertEquals(0.0, PracticeProblem.hypotenuse(0, 0));
   }
   @Test
   void hypoteneuseTest3() { //large odd
      assertEquals(Math.sqrt(10265), PracticeProblem.hypotenuse(67, 76));
   }
   @Test
   void hypoteneuseTest4() { //double
      assertEquals(Math.sqrt(234.8596), PracticeProblem.hypotenuse(3.14, 15));
   }
   @Test
   void hypoteneuseTest5() { //decimal fraction
      assertEquals(Math.sqrt(36.2404 + Math.pow(6.0/7.0, 2)), PracticeProblem.hypotenuse(6.02, 6.0/7.0));
   }

}

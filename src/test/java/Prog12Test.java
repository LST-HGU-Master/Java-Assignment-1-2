import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Prog12Test {

   @Test
   public void testHelloWorld()
   {
     PrintStream originalOut = System.out;
     ByteArrayOutputStream bos = new ByteArrayOutputStream();
     System.setOut(new PrintStream(bos));

     // action
     Prog12.main(null);
     String expected = "半径5cmのパイの面積は、" + System.lineSeparator() +
             "78.5" + System.lineSeparator() +
             "パイの半径を倍にします" + System.lineSeparator() +
             "半径10cmのパイの面積は、" + System.lineSeparator() +
             "314.0" + System.lineSeparator();

     // assertion
     assertEquals(expected, bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}

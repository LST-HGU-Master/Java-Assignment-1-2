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
     String expected = "半径5cmのパイの面積は、\n" +
             "78.5\n" +
             "パイの半径を倍にします\n" +
             "半径10cmのパイの面積は、\n" +
             "314.0\n";

     // assertion
     assertEquals(expected, bos.toString());

     // undo the binding in System
     System.setOut(originalOut);
   }
}

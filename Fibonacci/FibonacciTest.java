import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @org.junit.jupiter.api.Test
     void fiboTest(){
         String res = "1,1,2,3,5";
         String output = Fibonacci.FibO(6);
        assertEquals(res,output);
     }
}
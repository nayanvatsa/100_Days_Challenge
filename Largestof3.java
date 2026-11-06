import java.io.*;

class prog {

   
    static int biggestOfThree(int x, int y, int z) {
      
        if (x >= y && x >= z)
           
            return x;
        else if (y >= x && y >= z)
           
            return y;
        else
           
            return z;
    }

    public static void main(String[] args) {
    
        int a = 5;
        int b = 10;
        int c = 3;

        
        int largest = biggestOfThree(a, b, c);

       
        System.out.println(largest + " is the largest number.");
    }
}

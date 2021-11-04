package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int g = input.nextInt();  
    float[] array = new float[g];
    float max = -100;

    for(int i = 0; i < g; i ++)
    {
      array[i] = input.nextInt();
      if (max < array[i]) {
        max = array[i];
      }
    }
    System.out.println("Max number: " + max);

    
    
       
    }

}
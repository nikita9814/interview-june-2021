
import java.util.*;
public class ShiftElementsInArray {

  public void shift(int[] arr) {
      int n=arr.length;
        for(int i = 0; i < n; i++){  
            int j, first;  
              
            first = arr[0];  
          
            for(j = 0; j < arr.length-1; j++){  
                arr[j] = arr[j+1];  
            }  
            arr[j] = first;  
        }  
          
        System.out.println();  
          
       
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }

  }

}


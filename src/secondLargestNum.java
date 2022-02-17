

import java.util.Arrays;
import java.util.Collections;

public class secondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]<array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
//	     for(int a : array) 
//	     
//	     {
//	    	 System.out.println(a);
//	    	 
//	     }
	      System.out.println(" second largest number is:: "+array[1]);
	      
	      System.out.println("***********************************");
	   
	}

}

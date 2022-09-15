package com.arrays.bll;
import java.util.Arrays;;

public class Excercise1 {

	public static void main(String[] args) {
		 int[] my_array1 = { 1233,1300,1500,1456,2022,2458,2365,2035,2144,1457,1472,2366};
		 
		 String[] my_array2 = { "Java", "Python", "Php", "C#", "C Programming", "C++"};
		 
		 System.out.println("Original numeric array: "+Arrays.toString(my_array1));
		 Arrays.sort(my_array1);
		 System.out.println("Sorted numeric array: " +
		 Arrays.toString(my_array1));
		 
		 System.out.println("Original numeric array: "+Arrays.toString(my_array2));
		 Arrays.sort(my_array2);
		 System.out.println("Sorted numeric array: " +
		 Arrays.toString(my_array2));
		 
		

	}

}

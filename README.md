

# Coding-Interview

## INfoSys questions
1. Write .equals() and hashcode() methods and explain what they do.
2. Write pseudocode to calculate the sum of 2 numbers.
3. Write code that takes a list of integers and prints out the sum using streams.
4. Write a function that defines an array parameter and a sum and finds the first two values that, when added, equal that sum.
5. Write code to traverse a linked list.
6. Write code to sort an array so it's ordered in increasing order by how many times an integer occurs.
7. Write code to model an ArrayList
8. Write code to model a Map
9. Write code to check for duplicate values in a string
10. Write code to print "fizz" if a value is divisible by 5, "buzz" if a value is divisible by 3, and "fizzbuzz" if divisible by both 3 and 5. You cannot use the modulus operator.
11. Write code to sort an array of numbers.
12. Write a program to swap two variables without using a temp variable.

## 1. FizzBuzz

  1. loop from 1 to n;
  2. check multiple of 3 and 5
     * print FizzBuzz
  3. check multiple of 3
     * print Fizz
  4. check multiple of 5
     * print Buzz
  
  ```java
  public static void main (String[] args){
      
  }

  public static void fizzBuzz(int n){

    for(int i = 0; i < n; i++){
			if(n % 3 == 0 && n % 5 == 0){
				System.out.println("FizzBuzz");
				continue;
			}
			if(n % 3 == 0){
				System.out.println("Fizz");
				continue;
			}
			if(n % 5 == 0 )
				System.out.println("Buzz");
				continue;
		}
  }

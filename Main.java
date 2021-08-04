import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   System.out.println("Enter the number to check for palindrome");
    	   int n=sc.nextInt();
    	   int reverse=0;
    	   int temp=n;
    	   while(temp!=0)
    	   {
    		   reverse=reverse*10;
    		   reverse=reverse+temp%10;
    		   temp=temp/10;
    	   }    	      
    	   if(n==reverse) { 
    	         System.out.println("Entered number is a palindrome.");  }
    	      else  {
    	         System.out.println("Entered number isn't a palindrome."); }  
    	   }
    		   

 

            //function to printPattern

       public void printPattern() {
    	   System.out.println("Enter the number of rows: "); //to take input from user
    	    int rows = sc.nextInt();
    	    for (int i= rows-1; i>=0 ; i--)
    	    {
    	    for (int j=0; j<=i; j++)
    	    {

    	    System.out.print("*" + "");

    	    }

    	    System.out.println();

    	    }
            }

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.println("Enter a number to check for prime");
        	sc.nextInt();
        	int num =sc.nextInt(); 
            int b=1; 
            int c=0; 
             while(b<= num) 
                { 
                    if((num%b)==0) 
                       c=c+1; 
                       b++; 
                } 
                 if(c==2) 
                 System.out.println(num +" is a prime number"); 
                 else 
                 System.out.println(num +" is not a prime number");

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0,second = 1,n,i,count;
           System.out.print("Enter the number of count you want to print :");
           count = sc.nextInt();
           System.out.print(first+""+second);
           for(i=2; i < count; i++)
           {
        	  n=first+second;
        	  System.out.print(""+n);
        	  first=second;
        	  second=n;
           }


          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}


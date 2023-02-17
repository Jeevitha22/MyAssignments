package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 17 ;
	    boolean flag = false;
	    for (int i = 2; i <= n / 2; ++i) {
	      // condition for non-prime number
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(n + " is a prime number.");
	    else
	      System.out.println(n + " is not a prime number.");
	  }
	}

		

	



package recursion1;

public class recursion1 {

	public static void main(String[] args) {
			    int result = sum(5, 10);
			    System.out.println(result);
			  }
			  public static int sum(int start, int end) {
			    if (end > start) {
			      return end + sum(start, end - 1);
			    } else {
			      return end;
			    }
			  }
			

	}



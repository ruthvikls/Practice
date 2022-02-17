import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp=0;
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				temp = temp+1;
			}
		}
if(temp!=0) {
	System.out.println("Number is not a prime number");
}
else {
	System.out.println("Prime Number");
}
	}

}


public class JoinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This";
		String s2 = " is";
		String s3 = " Awesome";
		System.out.println(s1+s2+s3);
		
		s1 = s1.concat(s2).concat(s3);
		//s2 = s2.concat(s3);
		System.out.println(s1);

	}

}



public class NumberOfCharactersInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title= "Avengers : Age Of Ultron";
		int count =0;
		for(int i=0;i<title.length();i++) {
			if(title.charAt(i)!=' ') {
				count++;
			}
		}
System.out.println("Total Number of characters in a givern string is = "+ count);
	}

}

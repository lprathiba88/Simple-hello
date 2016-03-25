import java.util.Scanner;
public class SimpleHello {
	
	static Scanner scanner = new Scanner(System.in);

	static String[] address;
	static String[] contents;
	
	public static String[] getInfo(String... address){
		
		contents = new String [address.length];
		for(int i=0; i<address.length; i++){
			System.out.println("What's your " +address[i]+ " ?");
			contents[i] = scanner.nextLine();
		}
		
		return address;
	}
	
	public static void displayInfo(){
		for(int i=0; i<contents.length; i++){
			System.out.println("Your " +address[i]+ " is: " +contents[i]+ ".");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
		System.out.println("Welcome to SQA Solutions!");
		System.out.println("Please enter your name");
		name = scanner.nextLine();
		System.out.println("Hi " +name+ ", where do you live ?");
		address = getInfo("building number", "Street name", "City", "Zip code");
		
		displayInfo();
		System.out.println("Pleased to meet you " +name+ "!. Bye!");

	}

}

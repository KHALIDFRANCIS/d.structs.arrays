package arraySection;

public class testing {
	public static void method(String brand, int size) {
		System.out.println("There is a " + brand + " in size " + size + " available.");
		
	}
	
	public static String second(String store) {
		System.out.println("There is a " + store + " store in the city");
		return "name";
		
	}
	
	public static int add(int x, int y, int z) {
			return (((x + y) * z) + 1)/ 2;
	}
//	if the method returns something, you must print it out in the main method
	
	
//		when creating a method, a parameter is given
//		when calliing that method, what is required for calling will be the argument
//		a parameter is the format through which the argument for a specified method is to be written
//		a parameter allows you create a variable without initializing it
	public static void main(String[] args) {
		method("Adidas", 11);
		method("Nike", 10);
		method("Clarks", 9 );
		
		second("Footlocker");
		
		System.out.println(add(5, 2, 9));
		
		
		
	}
	

}

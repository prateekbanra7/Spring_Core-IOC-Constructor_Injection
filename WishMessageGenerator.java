package in.abc.bean;

import java.util.Date;

//Target class ---> UserDefined
public class WishMessageGenerator {

	// Dependant class --> Predefined
	private Date date;

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator object is created...");
	}
	
	public WishMessageGenerator(Date date) {
		System.out.println("Constructor injection is happening to inject Date object :: " + date);
		this.date = date;
	}

	// BUSINESS logic to use Injected DATE in the Target class object
	public String generateWishMessage(String name) {
		@SuppressWarnings("deprecation")
		int hour = date.getHours();
		if (hour <= 12)
			return "Hello :: " + name + " Good morning!!!";
		else if (hour <= 16)
			return "Hello :: " + name + " Good Afternoon!!!";
		else if (hour <= 20)
			return "Hello :: " + name + " Good Evening!!!";
		else
			return "Hello :: " + name + " Good Night!!!";

	}
}

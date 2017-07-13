
public class Earth {

	public static void main(String[] args) {
		
		Human tom;
		
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Zsabo";
		
		tom.speak();
		
		Human john;
		john = new Human();
		john.age = 20;
		john.eyeColor = "green";
		john.heightInInches = 70;
		john.name = "John Armless";
		
		john.speak();
		
	}

}

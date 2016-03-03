package StringBuilderExercise;

public class StrExercise {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		name.append("bablu");
		System.out.println(name);
		name.append(", you should not be there!");
		System.out.println(name);
		System.out.println(name.reverse());
		System.out.println(name.reverse().delete(6, 10));
		
		StringBuilder name2= new StringBuilder();
		System.out.println (name2.append("bangladesh").append
				(" is nice country! "));
		System.out.println (name2.reverse());
		
	}

}

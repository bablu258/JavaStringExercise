
public class CharString {

	public static void main(String[] args) {
		
		String str = "program";
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.codePointCount(0, 7));
		System.out.println("mom".compareTo("mom"));
		System.out.println(str.compareToIgnoreCase("proGram"));
		System.out.println(str.concat(" i like most").concat(" is java!"));
		System.out.println(str.contains("program"));
		System.out.println(str.contentEquals("program"));
		System.out.println(str.endsWith("am"));
		System.out.println(str.hashCode());
		System.out.println(str.indexOf('p'));
		System.out.println(str.isEmpty());
		System.out.println(str.lastIndexOf("p"));
		System.out.println(str.matches("pr"));
		System.out.println(str.replace("p", "P"));
		System.out.println(str.startsWith("pro"));
		System.out.println(str.substring(4));
		System.out.println("BAbLu".toLowerCase());
		System.out.println(("BAbLu".toLowerCase()).compareTo("bablu"));
		System.out.println("1253".toString());
		System.out.println("BAbLu".toUpperCase());
		
		
		
		
		

	}

}

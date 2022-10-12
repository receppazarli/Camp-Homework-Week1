package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesage = "The weather is very nice today.";
		System.out.println(mesage);

		/*
		System.out.println("Number of elements : " + mesage.length());
		System.out.println("5. elements : " + mesage.charAt(5));
		System.out.println(mesage.concat("thumbs up!"));
		System.out.println(mesage);
		System.out.println(mesage.startsWith("A"));
		System.out.println(mesage.startsWith("T"));
		char [] characters = new char[6] ;
		mesage.getChars(0, 6, characters, 0);
		System.out.println(characters);
		System.out.println(mesage.indexOf("at"));
		System.out.println(mesage.lastIndexOf('a'));
		*/
		
		
		String newMessage = mesage.replace(' ','-');
		System.out.println(newMessage);
		System.out.println(mesage.substring(2)); // kaçıncı indexten alayım
		System.out.println(mesage.substring(0,2));
		
		for (String word :mesage.split(" ") ) {
			System.out.println(word);
			
		}
		
		System.out.println(mesage.toLowerCase());
		System.out.println(mesage.toUpperCase());

		System.out.println(mesage.trim()); // başındaki ve sonundaki boşlukları atma 
		
	}

}

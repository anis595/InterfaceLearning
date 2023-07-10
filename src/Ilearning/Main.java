package Ilearning;

public class Main {

	public static void main(String[] args) {
		yassine yassine = new yassine("theo","humain",20);
		yassine.Icrier();
		yassine.vieillir();
		yassine.getAge();
		System.out.println(yassine.getAge());
		chien chien = new chien("ouf ouf ouf","batard",10);
		chien.Icrier();
		chien.vieillir();
		chien.getAge();
		System.out.println(chien.getAge());
		// chat chat = new chat("miaou","bengal",17);
		// chat.Icrier();
		
		
	}	
		

}

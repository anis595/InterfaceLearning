package Ilearning;

public class chien extends animaux implements Ianimal {

	public chien(String nom, String race, int age) {
		super(nom, race, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Icrier() {
		System.out.println("ouf ouf ouf");
		
	}

}

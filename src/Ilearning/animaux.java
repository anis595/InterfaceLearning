package Ilearning;

public class animaux {
	private String nom;
	private String race;
	private int age;
	public void vieillir() {
		age++;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public animaux(String nom, String race, int age) {
		super();
		this.nom = nom;
		this.race = race;
		this.age = age;
	}
	@Override
	public String toString() {
		return "animaux [nom=" + nom + ", race=" + race + ", age=" + age + ", getNom()=" + getNom() + ", getRace()="
				+ getRace() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}

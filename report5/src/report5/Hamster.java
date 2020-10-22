package report5;

public class Hamster extends Animal implements Happy {
	public Hamster() {
		species = "½Ã¸®¾Æ ÇÜ½ºÅÍ";
		name = "³È³È";
		age = "3»ì";
	}
	String introduce() {
		return ("±Í¿©¿î ÇÜ½ºÅÍ " + name + "!");
	}
	public String play() {
		return ("¹ÙÄû±¼¸®±â¸¦ ÁÁ¾ÆÇØ¿ä.");
	}
}

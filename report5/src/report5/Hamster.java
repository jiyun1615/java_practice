package report5;

public class Hamster extends Animal implements Happy {
	public Hamster() {
		species = "시리아 햄스터";
		name = "냠냠";
		age = "3살";
	}
	void introduce() {
		System.out.println("종: "+ species + " 이름: " + name + " 나이 : " + age);
		System.out.println("귀여운 햄스터 " + name + "!");
	}
	public String play() {
		return ("바퀴굴리기를 좋아해요.");
	}
}

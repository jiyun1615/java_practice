package report5;

public class Cat extends Animal implements Happy{
	public Cat() {
		species = "터키쉬앙고라";
		name = "모하";
		age = "3살";
	}
	String introduce() {
		return ("저의 애완묘 " + name + "!");
	}
	public String play() {
		return ("우다다를 좋아해요.");
	}
}

package report5;

public class Hamster extends Animal implements Happy {
	public Hamster() {
		species = "�ø��� �ܽ���";
		name = "�ȳ�";
		age = "3��";
	}
	String introduce() {
		return ("�Ϳ��� �ܽ��� " + name + "!");
	}
	public String play() {
		return ("���������⸦ �����ؿ�.");
	}
}

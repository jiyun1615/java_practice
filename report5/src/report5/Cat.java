package report5;

public class Cat extends Animal implements Happy{
	public Cat() {
		species = "��Ű���Ӱ��";
		name = "����";
		age = "3��";
	}
	String introduce() {
		return ("���� �ֿϹ� " + name + "!");
	}
	public String play() {
		return ("��ٴٸ� �����ؿ�.");
	}
}

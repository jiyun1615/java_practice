package report5;

public class Hamster extends Animal implements Happy {
	public Hamster() {
		species = "�ø��� �ܽ���";
		name = "�ȳ�";
		age = "3��";
	}
	void introduce() {
		System.out.println("��: "+ species + " �̸�: " + name + " ���� : " + age);
		System.out.println("�Ϳ��� �ܽ��� " + name + "!");
	}
	public String play() {
		return ("���������⸦ �����ؿ�.");
	}
}

package report5;

public class Cat extends Animal implements Happy{
	public Cat() {
		species = "��Ű���Ӱ��";
		name = "����";
		age = "3��";
	}
	void introduce() {
		System.out.println("��: "+ species + " �̸�: " + name + " ���� : " + age);
		System.out.println("���� �ֿϹ� " + name + "!");
	}
	public String play() {
		return ("��ٴٸ� �����ؿ�.");
	}
}

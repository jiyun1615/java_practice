class Buyer {
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Item it, int count) {
		System.out.println(it + "��(��) " + count + "�� ���ְ� �Ծ����ϴ�.");
		money = money - it.price*count;
		System.out.println("���� ���� �� : " + money);
	}
}

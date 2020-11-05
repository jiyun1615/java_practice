public class PolymorphismTest2 {
	public static void main(String args[]) {
		Buyer me = new Buyer(20000);
		me.buy((new Wodong()), 3);
		me.buy((new Noodle()), 2);
		me.buy((new Mixnoodle()), 2);
	}
}

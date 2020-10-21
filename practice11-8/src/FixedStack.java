class FixedStack implements IStack{
	private int stack[];
	private int tos;
	FixedStack(int size) {
		stack = new int[size];
		tos = -1;
	}
	public void push(int item) {
		if(tos == stack.length-1)
			System.out.println("Stack is full.");
		else
			stack[++tos] = item;
	}
	public int pop() {
		if(tos < 0) {
			System.out.println("스택이 비었음");
			return 0;
		}
		else
			return stack[tos--];
	}

}

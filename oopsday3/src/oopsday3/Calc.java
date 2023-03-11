package oopsday3;

public class Calc {
	private int num;
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Calc(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Calc [num=" + num + "]";
	}

}

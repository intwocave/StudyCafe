package tmp.tmp;

public class OperandPriority {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int value = 356;
		System.out.println((value/100) * 100);
	}

}
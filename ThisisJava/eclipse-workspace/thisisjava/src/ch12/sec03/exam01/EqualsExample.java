package ch12.sec03.exam01;

public class EqualsExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Member mem1 = new Member("765");
		Member mem2 = new Member("432");
		Member mem3 = new Member("765");
		
		if (mem1.equals(obj1)) {
			System.out.println("mem1과 obj1은 동일합니다.");
		} else {
			System.out.println("mem1과 obj1은 동일하지 않습니다.");
		}
		
		if (mem1.equals(mem2)) {
			System.out.println("mem1과 mem2은 동일합니다.");
		} else {
			System.out.println("mem1과 mem2은 동일하지 않습니다.");
		}
		
		if (mem1.equals(mem3)) {
			System.out.println("mem1과 mem3은 동일합니다.");
		} else {
			System.out.println("mem1과 mem3은 동일하지 않습니다.");
		}
		
		if (mem1.equals(mem1)) {
			System.out.println("mem1과 mem1은 동일합니다.");
		} else {
			System.out.println("mem1과 mem1은 동일하지 않습니다.");
		}
	}
}

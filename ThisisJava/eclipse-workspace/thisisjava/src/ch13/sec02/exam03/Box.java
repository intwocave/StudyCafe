package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	boolean compare(Box<T> other) {
		if (this.content.equals(other.content)) {
			return true;
		} else {
			return false;
		}
	}
}

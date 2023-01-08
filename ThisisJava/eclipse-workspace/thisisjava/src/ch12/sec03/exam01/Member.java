package ch12.sec03.exam01;

public class Member {
	String id;
	
	Member() {}
	
	Member(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			
			if (member.id.equals(this.id)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

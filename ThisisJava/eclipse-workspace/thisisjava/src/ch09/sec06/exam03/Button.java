package ch09.sec06.exam03;

public class Button {
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	void click() {
		clickListener.onClick();
	}
}
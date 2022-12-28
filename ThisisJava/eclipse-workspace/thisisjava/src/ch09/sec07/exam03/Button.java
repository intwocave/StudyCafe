package ch09.sec07.exam03;

public class Button {
	interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	void click() {
		clickListener.onClick();
	}
	
	void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
}

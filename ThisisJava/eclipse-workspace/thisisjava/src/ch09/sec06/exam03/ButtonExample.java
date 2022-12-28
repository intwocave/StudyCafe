package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		class ButtonOk implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했어요.");
			}
		}
		
		btnOk.setClickListener(new ButtonOk());
		btnOk.click();
		
		
		Button btnCancel = new Button();
		
		class ButtonCancel implements Button.ClickListener {
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했어요.");
			}
		}
		
		
		btnCancel.setClickListener(new ButtonCancel());
		btnCancel.click();
	}
}

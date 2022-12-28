package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		Button.ClickListener cl = new Button.ClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("OK 버튼을 클릭했어요.");
			}
		};
		btnOk.setClickListener(cl);
		btnOk.click();
		
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Cancel 버튼을 클릭했어요.");
			}
		});
		btnCancel.click();
	}
}

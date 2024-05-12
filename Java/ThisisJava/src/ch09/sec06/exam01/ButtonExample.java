package ch09.sec06.exam01;

import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            public void onClick() {
                System.out.println("Ok 버튼을 클릭함");
            };
        }

        btnOk.setClickListener(new OkListener());
        btnOk.click();

        Button btnCancel = new Button();

        class cancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭함");
            }
        }

        btnCancel.setClickListener(new cancelListener());
        btnCancel.click();
    }
}

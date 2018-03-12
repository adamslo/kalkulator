import java.awt.EventQueue;

public class Kalkulator {

	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Ramka();
			}
		});
	}
}


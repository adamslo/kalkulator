import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel implements ActionListener{

	public static final int HEIGHT = 100;
	public static final int WIDTH = 600;
	
	private JButton addButton;
	private JButton substractButton;
	private JButton divideButton;
	private JButton multipleButton;
	
	private JTextField a;
	private JTextField b;
	private JTextField wynik;
	
	public Panel(){
		
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		addButton = new JButton("+");
		substractButton = new JButton("-");
		divideButton = new JButton("/");
		multipleButton = new JButton("*");

		addButton.addActionListener(this);
		substractButton.addActionListener(this);
		divideButton.addActionListener(this);
		multipleButton.addActionListener(this);
		
		wynik = new JTextField("",12);
		
		JLabel lab1 = new JLabel("Liczba a");
		add(lab1);
		a = new JTextField("",12);
		add(a);
		
		JLabel lab2 = new JLabel("Liczba b");
		add(lab2);
		b = new JTextField("",12);
		add(b);
		
		JLabel lab3 = new JLabel("Wynik");
		add(lab3);
		add(wynik);
		
		add(addButton);
		add(substractButton);
		add(divideButton);
		add(multipleButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == addButton){
			long n = Integer.parseInt(a.getText());
			long m = Integer.parseInt(b.getText());
			long w = n+m;
			wynik.setText(""+w);
		}
		else if (source == substractButton){
			long n = Integer.parseInt(a.getText());
			long m = Integer.parseInt(b.getText());
			long w = n-m;
			wynik.setText(""+w);
		}
		else if (source == multipleButton){
			long n = Integer.parseInt(a.getText());
			long m = Integer.parseInt(b.getText());
			long w = n*m;
			wynik.setText(""+w);
		}
		else if (source == divideButton){
			long n =  Integer.parseInt(a.getText());
			long m = Integer.parseInt(b.getText());
			if (m == 0)
				wynik.setText("Nie wolno!!!");
			else{
			double w = n/m;
			wynik.setText(""+w);
		
			}
	}
}
}
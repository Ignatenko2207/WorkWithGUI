package info.sjd.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame{
	private JTextField tfVar1;
	private JTextField tfOut;

	public MainWindow(String title) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		setSize(742, 364);
		setLocation(150, 150);
		getContentPane().setLayout(null);
		
		JLabel lblSomeText = new JLabel("input your name");
		lblSomeText.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSomeText.setBounds(12, 13, 189, 40);
		getContentPane().add(lblSomeText);
		
		tfVar1 = new JTextField();
		tfVar1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfVar1.setBounds(213, 13, 502, 40);
		getContentPane().add(tfVar1);
		tfVar1.setColumns(10);
		
		JButton btnMakeOutText = new JButton("make out text");
		btnMakeOutText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfOut.setText(tfVar1.getText() + ", you are the best!");
			}
		});
		btnMakeOutText.setBounds(12, 100, 702, 40);
		getContentPane().add(btnMakeOutText);
		
		tfOut = new JTextField();
		tfOut.setEditable(false);
		tfOut.setBounds(12, 153, 700, 151);
		getContentPane().add(tfOut);
		tfOut.setColumns(10);
		
		setResizable(false);
		setVisible(true);
	}
}

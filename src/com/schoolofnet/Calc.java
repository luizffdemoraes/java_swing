
package com.schoolofnet;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.schoolofnet.Components.BtnHandler;

public class Calc {
	private static JFrame mainFrame; // Janela
	private static JPanel mainPanel;
	private static JButton btnCalc;
	private static JTextField txtNum1;
	private static JTextField txtNum2;
	private static JComboBox op;
	
	public Calc() {
		prepareGUI();
	}

	public static void main(String[] args) {
		EventsSwing event = new EventsSwing();
	}

	private void prepareGUI() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 400, 400);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new GridLayout(2, 0));

		//input
		//combobox
		//input
		//button
		
		mainPanel = new JPanel(); // Um painel pode conter varios outros
		mainPanel.setLayout(new FlowLayout());

		mainFrame.add(mainPanel);

		btnCalc = new JButton("Calculate");
		btnCalc.setActionCommand("Action");
		txtNum1 = new JTextField(30);
		txtNum2 = new JTextField(30);
		op = new JComboBox();
		op.addItem("+");
		op.addItem("-");
		op.addItem("*");
		op.addItem("/");
		
		
		btnCalc.addActionListener(new BtnHandler());
		mainPanel.add(txtNum1);
		mainPanel.add(op);
		mainPanel.add(txtNum2);
		mainPanel.add(btnCalc);
		mainFrame.setVisible(true);
	}

	public class BtnHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			switch (command) {
			case "Action":
				System.out.println("My first event");
				JOptionPane.showMessageDialog(null, txtNum1.getText());
				break;
			default:
				System.out.println("Invalid Action");
			}
		}
	}


}

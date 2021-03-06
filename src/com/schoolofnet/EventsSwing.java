package com.schoolofnet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventsSwing {

	private static JFrame mainFrame; // Janela
	private static JPanel mainPanel;
	private static JButton btnAction;

	public EventsSwing() {
		showGUI();

	}

	public static void main(String[] args) {
		EventsSwing event = new EventsSwing();
	}

	private void showGUI() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 250, 200);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

		mainPanel = new JPanel(); // Um painel pode conter varios outros
		mainPanel.setLayout(new FlowLayout());

		mainFrame.add(mainPanel);

		btnAction = new JButton("Click Here");
		btnAction.setActionCommand("Action");

		mainPanel.add(btnAction);
		btnAction.addActionListener(new BtnHandler());

	}

	public class BtnHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			switch (command) {
			case "Action":
				System.out.println("My first event");
				JOptionPane.showMessageDialog(null, "My first event");
				break;
			default:
				System.out.println("Invalid Action");
			}
		}
	}
}

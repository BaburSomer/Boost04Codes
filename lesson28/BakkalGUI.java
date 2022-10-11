package com.bilgeadam.course04.lesson28;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class BakkalGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BakkalGUI window = new BakkalGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BakkalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initFrame();
		initMenu();
	}

	private void initFrame() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MMMMMBakkal");
		frame.setUndecorated(true);
	}

	private void initMenu() {
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("Dosya");
		menuBar.add(menuFile);
		
		JMenuItem menuItemNewBakkal = new JMenuItem("Yeni Bakkal Oluştur");
		menuFile.add(menuItemNewBakkal);
		menuItemNewBakkal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selection = JOptionPane.showConfirmDialog(frame, "Yeni bir Bakkal oluşturmak üzeresiniz");
				System.out.println(selection);
				if (selection == JOptionPane.OK_OPTION) {
					
				}
			}
		});
		JMenuItem menuExit = new JMenuItem("Uygulamadan çık");
		menuExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		menuFile.add(menuExit);
	}

}

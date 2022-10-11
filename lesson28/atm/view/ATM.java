package com.bilgeadam.course04.lesson28.atm.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import com.bilgeadam.course04.lesson28.atm.controller.ATMController;
import com.bilgeadam.course04.lesson28.atm.model.BankAccount;
import com.bilgeadam.course04.lesson28.atm.model.BankCustomer;

public class ATM {

	private static final int    PANEL_Y            = 56;
	private static final int    PANEL_X            = 168;
	private static final int    PANEL_HEIGHT       = 300;
	private static final int    PANEL_WIDTH        = 400;
	private static final String PASSWORD_PANEL     = "PASSWORD_PANEL";
	private static final String WELCOME_PANEL      = "WELCOME_PANEL";
	private static final String DEPOSIT_PANEL      = "DEPOSIT_PANEL";
	private static final String WITHDRAWAL_PANEL   = "WITHDRAWAL_PANEL";
	private static final String TRANSFER_PANEL     = "TRANSFER_PANEL";
	private static final String TRANSACTIONS_PANEL = "TRANSACTIONS_PANEL";

	private static final int BUTTON_HEIGHT = 22;
	private static final int BUTTON_WIDTH  = 200;

	private JFrame         mainFrame;
	private JTextField     fldUserName;
	private JPasswordField fldPassword;
	private JPanel         passwordPanel;
	private JPanel         welcomePanel;
	private JPanel         depositPanel;
	private JTextField     textField;
	private List<JPanel>   panels;

	private JButton btnAuthenticate;
	private JButton btnDeposit;
	private JButton btnTransfer;
	private JButton btnTransactions;
	private JButton btnWithdrawal;

	private BankCustomer      actualCustomer;
	private JComboBox<String> comboBoxAccounts;
	private ATMController     ATMController;
	private BankAccount selectedAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM window = new ATM();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM() {
		this.ATMController = new ATMController();
		this.panels        = new ArrayList<>();
		passwordScreen();
		welcomeScreen();
		depositScreen();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		initMainFrame();
		mainFrame.getContentPane().add(passwordPanel);
		mainFrame.getContentPane().add(welcomePanel);
		mainFrame.getContentPane().add(depositPanel);
		changePanel(WELCOME_PANEL);
	}

	private void passwordScreen() {
		passwordPanel = new JPanel();
		passwordPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordPanel.setBackground(SystemColor.info);
		passwordPanel.setBounds(ATM.PANEL_X, ATM.PANEL_Y, ATM.PANEL_WIDTH, ATM.PANEL_HEIGHT);
		passwordPanel.setLayout(null);
		passwordPanel.setName(ATM.PASSWORD_PANEL);
		this.panels.add(passwordPanel);

		JButton btnCancel = new JButton("Vazgeç");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAuthenticationData();
				changePanel(ATM.WELCOME_PANEL);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBounds(27, 152, 110, 21);
		passwordPanel.add(btnCancel);

		JButton btnOK = new JButton("Tamam");
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOK.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String username = fldUserName.getText();
				String password = fldPassword.getText(); // aslında getpassword kullanılmalı

				try {
					if (ATMController.isPinCorrect(username, password)) {
						actualCustomer = ATMController.findCustomer(username);
						List<BankAccount> accountsForCombo = actualCustomer.listAccounts();
						comboBoxAccounts.addItem("Bir hesap seçin");
						for (BankAccount accountForCombo : accountsForCombo) {
							comboBoxAccounts.addItem(accountForCombo.getName());
						}
						comboBoxAccounts.setSelectedIndex(0);
						resetAuthenticationData();
						changePanel(ATM.WELCOME_PANEL);
						activateButtons();
					} else {
						resetAuthenticationData();
						JOptionPane.showConfirmDialog(passwordPanel, "Yanlış PIN", "Hatalı Giriş",
								JOptionPane.WARNING_MESSAGE);
					}
				} catch (Exception e1) {
					JOptionPane.showConfirmDialog(passwordPanel, "Müşteri bulunamadı: <<< " + username + " >>>",
							"Hatalı Giriş", JOptionPane.WARNING_MESSAGE);
					resetAuthenticationData();
				}
			}

			private void activateButtons() {
				btnAuthenticate.setEnabled(false);
				btnDeposit.setEnabled(true);
				btnTransfer.setEnabled(true);
				btnTransactions.setEnabled(true);
				btnWithdrawal.setEnabled(true);
			}
		});
		btnOK.setBounds(187, 152, 110, 21);
		passwordPanel.add(btnOK);

		JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(27, 39, 110, 13);
		passwordPanel.add(lblNewLabel);

		JLabel lblifre = new JLabel("Şifre");
		lblifre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblifre.setBounds(27, 74, 110, 13);
		passwordPanel.add(lblifre);

		fldUserName = new JTextField();
		fldUserName.setToolTipText("Kullanıcı adı giriniz");
		fldUserName.setBounds(147, 36, 150, 19);
		passwordPanel.add(fldUserName);
		fldUserName.setColumns(10);

		fldPassword = new JPasswordField();
		fldPassword.setBounds(147, 71, 150, 19);
		passwordPanel.add(fldPassword);
	}

	private void welcomeScreen() {
		welcomePanel = new JPanel();
		welcomePanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		welcomePanel.setBackground(SystemColor.inactiveCaption);
		welcomePanel.setBounds(ATM.PANEL_X, ATM.PANEL_Y, ATM.PANEL_WIDTH, ATM.PANEL_HEIGHT);
		welcomePanel.setLayout(null);
		welcomePanel.setName(ATM.WELCOME_PANEL);
		this.panels.add(welcomePanel);

		btnAuthenticate = new JButton("Şifre Gir");
		btnAuthenticate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(ATM.PASSWORD_PANEL);
			}
		});
		btnAuthenticate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAuthenticate.setBounds(57, 13, ATM.BUTTON_WIDTH, ATM.BUTTON_HEIGHT);
		welcomePanel.add(btnAuthenticate);

		btnDeposit = new JButton("Para Yatır");
		btnDeposit.setEnabled(false);
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeposit.setBounds(57, 81, ATM.BUTTON_WIDTH, ATM.BUTTON_HEIGHT);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(ATM.DEPOSIT_PANEL);
			}
		});

		welcomePanel.add(btnDeposit);

		btnTransfer = new JButton("Para Gönder");
		btnTransfer.setEnabled(false);
		btnTransfer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTransfer.setBounds(57, 115, ATM.BUTTON_WIDTH, ATM.BUTTON_HEIGHT);
		welcomePanel.add(btnTransfer);

		btnTransactions = new JButton("Hesap Bilgilerini Göster");
		btnTransactions.setEnabled(false);
		btnTransactions.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTransactions.setBounds(57, 149, ATM.BUTTON_WIDTH, ATM.BUTTON_HEIGHT);
		welcomePanel.add(btnTransactions);

		btnWithdrawal = new JButton("Para Çek");
		btnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWithdrawal.setBounds(57, 47, ATM.BUTTON_WIDTH, ATM.BUTTON_HEIGHT);
		welcomePanel.add(btnWithdrawal);
		btnWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnWithdrawal.setEnabled(false);
		changePanel(ATM.PASSWORD_PANEL);
	}

	private void depositScreen() {
		depositPanel = new JPanel();
		depositPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		depositPanel.setBackground(SystemColor.inactiveCaption);
		depositPanel.setBounds(ATM.PANEL_X, ATM.PANEL_Y, ATM.PANEL_WIDTH, ATM.PANEL_HEIGHT);
		depositPanel.setLayout(null);
		depositPanel.setName(ATM.DEPOSIT_PANEL);
		this.panels.add(depositPanel);

		JButton btnNewButton_2 = new JButton("Vazgeç");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				changePanel(ATM.WELCOME_PANEL);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(51, 267, 83, 22);
		depositPanel.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("Tamam");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePanel(ATM.WELCOME_PANEL);
			}
		});
		btnNewButton_2_1.setBounds(291, 267, 83, 22);
		depositPanel.add(btnNewButton_2_1);

		JLabel lblNewLabel = new JLabel("Para Yatırmak istediğiniz hesap");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 76, 215, 25);
		depositPanel.add(lblNewLabel);

		JLabel lblGncelBakiyeniz = new JLabel("Güncel bakiyeniz");
		lblGncelBakiyeniz.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGncelBakiyeniz.setBounds(10, 127, 215, 25);
		depositPanel.add(lblGncelBakiyeniz);

		textField = new JTextField();
		textField.setBounds(224, 131, 150, 25);
		textField.setEditable(false);
		depositPanel.add(textField);
		textField.setColumns(10);

		JLabel lblAmmountToDeposit = new JLabel("Yatıralacak tutar");
		lblAmmountToDeposit.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmmountToDeposit.setBounds(10, 190, 215, 25);
		depositPanel.add(lblAmmountToDeposit);

		JTextField fldAmountToDeposit = new JTextField();
		fldAmountToDeposit.setBounds(224, 188, 150, 25);
		depositPanel.add(fldAmountToDeposit);
		fldAmountToDeposit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double enteredDepositAmount = Double.parseDouble(fldAmountToDeposit.getText());
				if (enteredDepositAmount <= 0.0) {
					JOptionPane.showConfirmDialog(depositPanel, "0 veya küçük meblağlar girilemez", "Hatalı Giriş",
							JOptionPane.WARNING_MESSAGE);
				}
				else {
					try {
						ATMController.deposit("" + actualCustomer.getCustomerNumber(), selectedAccount.getName(), enteredDepositAmount, "ATM'den para yatırma");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		comboBoxAccounts = new JComboBox<>();
		comboBoxAccounts.setBounds(224, 79, 150, 25);
		comboBoxAccounts.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED) {
					Object source = event.getSource();
					if (source instanceof JComboBox) {
						JComboBox<String> combo = (JComboBox) source;
						if (combo.getSelectedIndex() != 0) {
							Object selectedItem = combo.getSelectedItem();
							try {
								selectedAccount = ATMController.findAccount("" + actualCustomer.getCustomerNumber(),
										(String) selectedItem);
								textField
										.setText(selectedAccount.getBalance() + " " + selectedAccount.getCurrency().getSymbol());
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
						}
					}
				}
			}
		});
		depositPanel.add(comboBoxAccounts);
	}

	public void changePanel(String panelName) {
		for (JPanel panel : this.panels) {
			if (panel.getName().equals(panelName)) {
				panel.setVisible(true);
			} else {
				panel.setVisible(false);
			}
		}
	}

	private void initMainFrame() {
		mainFrame = new JFrame();
		mainFrame.getContentPane().setBackground(SystemColor.activeCaption);
		mainFrame.setTitle("Benim ATM'em");
		mainFrame.setAlwaysOnTop(true);
		mainFrame.setBounds(100, 100, 750, 450);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
	}

	private void resetAuthenticationData() {
		fldUserName.setText("");
		fldPassword.setText("");
	}
}

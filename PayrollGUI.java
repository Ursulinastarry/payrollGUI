package payrollGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class PayrollGUI {

	private JFrame frame;
	private JTextField Name;
	private JTextField Rate;
	private JTextField Day;
	private JTextField Salary;
	private JTextField Hour;
	private JTextField SSS;
	private JTextField Phil;
	private JTextField Tax;
	private JTextField Deduct;
	private JTextField Gross;
	private JTextField Totaldeduct;
	private JTextField Net;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PayrollGUI window = new PayrollGUI();
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
	public PayrollGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setForeground(new Color(0, 64, 64));
		frame.setBounds(100, 100, 722, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setBounds(20, 83, 121, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Name = new JTextField();
		Name.setBounds(159, 80, 121, 20);
		frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		JButton btnNewButton = new JButton("compute");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		btnNewButton.setBackground(new Color(0, 64, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rate,hour,days;
				
				Name.getText();
				rate=Integer.valueOf(Rate.getText());
				hour=Integer.valueOf(Hour.getText());
				days=Integer.valueOf(Day.getText());
				int salary = rate*hour*days;
				
				Salary.setText(String.valueOf(salary));
				double tax=salary*0.15;
				int taxes=(int)tax;
				Tax.setText(String.valueOf(taxes));
				double phil=0.05*salary;
				int phils=(int)phil;
				Phil.setText(String.valueOf(phils));
				double sss=0.02*salary;
				int ssss=(int)sss;
				SSS.setText(String.valueOf(ssss));
				double deduct=taxes+phils+ssss;
				int deducts=(int)deduct;
				Totaldeduct.setText(String.valueOf(deducts));
				
				Gross.setText(String.valueOf(salary));
				Deduct.setText(String.valueOf(deducts));
				
				double net=salary-deducts;
				int nets=(int)net;
				Net.setText(String.valueOf(nets));
				
			
			}
		});
		btnNewButton.setBounds(310, 240, 105, 39);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Rate Per Hour:");
		lblNewLabel_1.setBounds(35, 111, 114, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of days worked:");
		lblNewLabel_2.setBounds(0, 161, 149, 18);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hours Per Day:");
		lblNewLabel_3.setBounds(35, 136, 114, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GROSS SALARY:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 190, 139, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		Rate = new JTextField();
		Rate.setBounds(159, 108, 86, 20);
		frame.getContentPane().add(Rate);
		Rate.setColumns(10);
		
		Day = new JTextField();
		Day.setBounds(159, 160, 86, 20);
		frame.getContentPane().add(Day);
		Day.setColumns(10);
		
		Salary = new JTextField();
		Salary.setEditable(false);
		Salary.setBounds(159, 187, 86, 20);
		frame.getContentPane().add(Salary);
		Salary.setColumns(10);
		
		Hour = new JTextField();
		Hour.setBounds(159, 133, 86, 20);
		frame.getContentPane().add(Hour);
		Hour.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("simple payroll system");
		lblNewLabel_5.setFont(new Font("Serif", Font.BOLD, 25));
		lblNewLabel_5.setBounds(232, 21, 270, 34);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_6.setForeground(new Color(255, 128, 128));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(291, 81, 160, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_7.setBounds(251, 111, 200, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Philhealth 5%");
		lblNewLabel_8.setBounds(312, 136, 139, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SSS 2%");
		lblNewLabel_9.setBounds(343, 163, 96, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		SSS = new JTextField();
		SSS.setEditable(false);
		SSS.setBounds(400, 157, 86, 20);
		frame.getContentPane().add(SSS);
		SSS.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(270, 190, 163, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		Phil = new JTextField();
		Phil.setEditable(false);
		Phil.setBounds(400, 130, 86, 20);
		frame.getContentPane().add(Phil);
		Phil.setColumns(10);
		
		Tax = new JTextField();
		Tax.setEditable(false);
		Tax.setBounds(400, 108, 86, 20);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		Deduct = new JTextField();
		Deduct.setEditable(false);
		Deduct.setBounds(609, 108, 86, 20);
		frame.getContentPane().add(Deduct);
		Deduct.setColumns(10);
		
		Gross = new JTextField();
		Gross.setEditable(false);
		Gross.setBounds(609, 83, 86, 20);
		frame.getContentPane().add(Gross);
		Gross.setColumns(10);
		
		Totaldeduct = new JTextField();
		Totaldeduct.setEditable(false);
		Totaldeduct.setBounds(400, 187, 86, 20);
		frame.getContentPane().add(Totaldeduct);
		Totaldeduct.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Gross Salary:");
		lblNewLabel_11.setBounds(525, 83, 105, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Deduction:");
		lblNewLabel_12.setBounds(540, 111, 105, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("NET SALARY:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(525, 190, 120, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		Net = new JTextField();
		Net.setEditable(false);
		Net.setBounds(609, 187, 86, 20);
		frame.getContentPane().add(Net);
		Net.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\m.icon.png"));
		lblNewLabel_14.setBounds(20, -37, 64, 165);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\m.icon.png"));
		lblNewLabel_15.setBounds(619, -27, 55, 152);
		frame.getContentPane().add(lblNewLabel_15);
	}
}

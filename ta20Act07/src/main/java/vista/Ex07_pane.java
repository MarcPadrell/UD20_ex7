package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex07_pane extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Cantidad;
	private JTextField textField_Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex07_pane frame = new Ex07_pane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex07_pane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setBounds(10, 45, 144, 13);
		contentPane.add(lblNewLabel);
		
		textField_Cantidad = new JTextField();
		textField_Cantidad.setBounds(164, 42, 60, 19);
		contentPane.add(textField_Cantidad);
		textField_Cantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setBounds(244, 45, 78, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_Resultado = new JTextField();
		textField_Resultado.setBackground(Color.WHITE);
		textField_Resultado.setBounds(330, 42, 96, 19);
		contentPane.add(textField_Resultado);
		textField_Resultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Euros a ptas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pesetas = Double.valueOf(textField_Cantidad.getText())*166.386;
				textField_Resultado.setText(String.valueOf(pesetas)); 
								
			}
		});
		btnNewButton.setBounds(89, 91, 135, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Modo Pesetas -> Euros");
				double euros = Double.valueOf(textField_Cantidad.getText().toString())/166.386;
				textField_Resultado.setText(String.valueOf(euros)); 
				
			}
		});
		btnNewButton_1.setBounds(263, 91, 101, 21);
		contentPane.add(btnNewButton_1);
	}

}

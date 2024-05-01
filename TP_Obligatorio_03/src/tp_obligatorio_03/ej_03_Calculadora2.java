package tp_obligatorio_03;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;

public class ej_03_Calculadora2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPanel panelM_1;
	private JButton btn_limpiarMemoria_1;
	private JButton btn_sumarMemoria_1;
	private JButton btn_restarMemoria_1;
	private JButton btn_recuperarMemoria_1;
	private JButton btn_limpiar_1;
	private JButton btn_simbolo_1;
	private JButton btn_dividir_1;
	private JButton btn_multiplicar_1;
	private JButton btn_7_1;
	private JButton btn_8_1;
	private JButton btn_9_1;
	private JButton btn_resta_1;
	private JButton btn_4_1;
	private JButton btn_5_1;
	private JButton btn_6_1;
	private JButton btn_suma_1;
	private JButton btn_1_1;
	private JButton btn_2_1;
	private JButton btn_3_1;
	private JButton btn_igual_1;
	private JButton btn_0_1;
	private JButton btn_punto_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej_03_Calculadora2 frame = new ej_03_Calculadora2();
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
	public ej_03_Calculadora2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 385);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.scrollbar);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0};
		gbl_contentPane.columnWeights = new double[]{1.0};

		contentPane.setLayout(gbl_contentPane);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.ipady = 12;
		gbc_textField.ipadx = 5;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(4, 4, 4, 4);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(getTextField(), gbc_textField);
		GridBagConstraints gbc_panelM_1 = new GridBagConstraints();
		gbc_panelM_1.fill = GridBagConstraints.BOTH;
		gbc_panelM_1.gridx = 0;
		gbc_panelM_1.gridy = 1;
		contentPane.add(getPanelM_1(), gbc_panelM_1);
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setMargin(new Insets(0, 0, 0, 0));
			textField.setBackground(new Color(240, 255, 240));
			textField.setFont(new Font("Arial", Font.PLAIN, 22));
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setEditable(false);
			textField.setText("12374218.75");
			textField.setColumns(10);
		}
		return textField;
	}
	private JPanel getPanelM_1() {
		if (panelM_1 == null) {
			panelM_1 = new JPanel();
			panelM_1.setBackground(SystemColor.scrollbar);
			GridBagLayout gbl_panelM_1 = new GridBagLayout();
			gbl_panelM_1.columnWidths = new int[]{0, 0, 0, 0, 0};
			gbl_panelM_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panelM_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panelM_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panelM_1.setLayout(gbl_panelM_1);
			GridBagConstraints gbc_btn_limpiarMemoria_1 = new GridBagConstraints();
			gbc_btn_limpiarMemoria_1.fill = GridBagConstraints.BOTH;
			gbc_btn_limpiarMemoria_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_limpiarMemoria_1.gridx = 0;
			gbc_btn_limpiarMemoria_1.gridy = 0;
			panelM_1.add(getBtn_limpiarMemoria_1(), gbc_btn_limpiarMemoria_1);
			GridBagConstraints gbc_btn_sumarMemoria_1 = new GridBagConstraints();
			gbc_btn_sumarMemoria_1.fill = GridBagConstraints.BOTH;
			gbc_btn_sumarMemoria_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_sumarMemoria_1.gridx = 1;
			gbc_btn_sumarMemoria_1.gridy = 0;
			panelM_1.add(getBtn_sumarMemoria_1(), gbc_btn_sumarMemoria_1);
			GridBagConstraints gbc_btn_restarMemoria_1 = new GridBagConstraints();
			gbc_btn_restarMemoria_1.fill = GridBagConstraints.BOTH;
			gbc_btn_restarMemoria_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_restarMemoria_1.gridx = 2;
			gbc_btn_restarMemoria_1.gridy = 0;
			panelM_1.add(getBtn_restarMemoria_1(), gbc_btn_restarMemoria_1);
			GridBagConstraints gbc_btn_recuperarMemoria_1 = new GridBagConstraints();
			gbc_btn_recuperarMemoria_1.fill = GridBagConstraints.BOTH;
			gbc_btn_recuperarMemoria_1.insets = new Insets(4, 4, 5, 4);
			gbc_btn_recuperarMemoria_1.gridx = 3;
			gbc_btn_recuperarMemoria_1.gridy = 0;
			panelM_1.add(getBtn_recuperarMemoria_1(), gbc_btn_recuperarMemoria_1);
			GridBagConstraints gbc_btn_limpiar_1 = new GridBagConstraints();
			gbc_btn_limpiar_1.fill = GridBagConstraints.BOTH;
			gbc_btn_limpiar_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_limpiar_1.gridx = 0;
			gbc_btn_limpiar_1.gridy = 1;
			panelM_1.add(getBtn_limpiar_1(), gbc_btn_limpiar_1);
			GridBagConstraints gbc_btn_simbolo_1 = new GridBagConstraints();
			gbc_btn_simbolo_1.fill = GridBagConstraints.BOTH;
			gbc_btn_simbolo_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_simbolo_1.gridx = 1;
			gbc_btn_simbolo_1.gridy = 1;
			panelM_1.add(getBtn_simbolo_1(), gbc_btn_simbolo_1);
			GridBagConstraints gbc_btn_dividir_1 = new GridBagConstraints();
			gbc_btn_dividir_1.fill = GridBagConstraints.BOTH;
			gbc_btn_dividir_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_dividir_1.gridx = 2;
			gbc_btn_dividir_1.gridy = 1;
			panelM_1.add(getBtn_dividir_1(), gbc_btn_dividir_1);
			GridBagConstraints gbc_btn_multiplicar_1 = new GridBagConstraints();
			gbc_btn_multiplicar_1.fill = GridBagConstraints.BOTH;
			gbc_btn_multiplicar_1.insets = new Insets(4, 4, 5, 4);
			gbc_btn_multiplicar_1.gridx = 3;
			gbc_btn_multiplicar_1.gridy = 1;
			panelM_1.add(getBtn_multiplicar_1(), gbc_btn_multiplicar_1);
			GridBagConstraints gbc_btn_7_1 = new GridBagConstraints();
			gbc_btn_7_1.fill = GridBagConstraints.BOTH;
			gbc_btn_7_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_7_1.gridx = 0;
			gbc_btn_7_1.gridy = 2;
			panelM_1.add(getBtn_7_1(), gbc_btn_7_1);
			GridBagConstraints gbc_btn_8_1 = new GridBagConstraints();
			gbc_btn_8_1.fill = GridBagConstraints.BOTH;
			gbc_btn_8_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_8_1.gridx = 1;
			gbc_btn_8_1.gridy = 2;
			panelM_1.add(getBtn_8_1(), gbc_btn_8_1);
			GridBagConstraints gbc_btn_9_1 = new GridBagConstraints();
			gbc_btn_9_1.fill = GridBagConstraints.BOTH;
			gbc_btn_9_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_9_1.gridx = 2;
			gbc_btn_9_1.gridy = 2;
			panelM_1.add(getBtn_9_1(), gbc_btn_9_1);
			GridBagConstraints gbc_btn_resta_1 = new GridBagConstraints();
			gbc_btn_resta_1.fill = GridBagConstraints.BOTH;
			gbc_btn_resta_1.insets = new Insets(4, 4, 5, 4);
			gbc_btn_resta_1.gridx = 3;
			gbc_btn_resta_1.gridy = 2;
			panelM_1.add(getBtn_resta_1(), gbc_btn_resta_1);
			GridBagConstraints gbc_btn_4_1 = new GridBagConstraints();
			gbc_btn_4_1.fill = GridBagConstraints.BOTH;
			gbc_btn_4_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_4_1.gridx = 0;
			gbc_btn_4_1.gridy = 3;
			panelM_1.add(getBtn_4_1(), gbc_btn_4_1);
			GridBagConstraints gbc_btn_5_1 = new GridBagConstraints();
			gbc_btn_5_1.fill = GridBagConstraints.BOTH;
			gbc_btn_5_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_5_1.gridx = 1;
			gbc_btn_5_1.gridy = 3;
			panelM_1.add(getBtn_5_1(), gbc_btn_5_1);
			GridBagConstraints gbc_btn_6_1 = new GridBagConstraints();
			gbc_btn_6_1.fill = GridBagConstraints.BOTH;
			gbc_btn_6_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_6_1.gridx = 2;
			gbc_btn_6_1.gridy = 3;
			panelM_1.add(getBtn_6_1(), gbc_btn_6_1);
			GridBagConstraints gbc_btn_suma_1 = new GridBagConstraints();
			gbc_btn_suma_1.fill = GridBagConstraints.BOTH;
			gbc_btn_suma_1.insets = new Insets(4, 4, 5, 4);
			gbc_btn_suma_1.gridx = 3;
			gbc_btn_suma_1.gridy = 3;
			panelM_1.add(getBtn_suma_1(), gbc_btn_suma_1);
			GridBagConstraints gbc_btn_1_1 = new GridBagConstraints();
			gbc_btn_1_1.fill = GridBagConstraints.BOTH;
			gbc_btn_1_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_1_1.gridx = 0;
			gbc_btn_1_1.gridy = 4;
			panelM_1.add(getBtn_1_1(), gbc_btn_1_1);
			GridBagConstraints gbc_btn_2_1 = new GridBagConstraints();
			gbc_btn_2_1.fill = GridBagConstraints.BOTH;
			gbc_btn_2_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_2_1.gridx = 1;
			gbc_btn_2_1.gridy = 4;
			panelM_1.add(getBtn_2_1(), gbc_btn_2_1);
			GridBagConstraints gbc_btn_3_1 = new GridBagConstraints();
			gbc_btn_3_1.fill = GridBagConstraints.BOTH;
			gbc_btn_3_1.insets = new Insets(4, 4, 5, 5);
			gbc_btn_3_1.gridx = 2;
			gbc_btn_3_1.gridy = 4;
			panelM_1.add(getBtn_3_1(), gbc_btn_3_1);
			GridBagConstraints gbc_btn_igual_1 = new GridBagConstraints();
			gbc_btn_igual_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_igual_1.fill = GridBagConstraints.BOTH;
			gbc_btn_igual_1.gridheight = 2;
			gbc_btn_igual_1.gridx = 3;
			gbc_btn_igual_1.gridy = 4;
			panelM_1.add(getBtn_igual_1(), gbc_btn_igual_1);
			GridBagConstraints gbc_btn_0_1 = new GridBagConstraints();
			gbc_btn_0_1.fill = GridBagConstraints.BOTH;
			gbc_btn_0_1.gridwidth = 2;
			gbc_btn_0_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_0_1.gridx = 0;
			gbc_btn_0_1.gridy = 5;
			panelM_1.add(getBtn_0_1(), gbc_btn_0_1);
			GridBagConstraints gbc_btn_punto_1 = new GridBagConstraints();
			gbc_btn_punto_1.fill = GridBagConstraints.BOTH;
			gbc_btn_punto_1.insets = new Insets(4, 4, 4, 4);
			gbc_btn_punto_1.gridx = 2;
			gbc_btn_punto_1.gridy = 5;
			panelM_1.add(getBtn_punto_1(), gbc_btn_punto_1);
		}
		return panelM_1;
	}
	private JButton getBtn_limpiarMemoria_1() {
		if (btn_limpiarMemoria_1 == null) {
			btn_limpiarMemoria_1 = new JButton("MC");
			btn_limpiarMemoria_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_limpiarMemoria_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_limpiarMemoria_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_limpiarMemoria_1;
	}
	private JButton getBtn_sumarMemoria_1() {
		if (btn_sumarMemoria_1 == null) {
			btn_sumarMemoria_1 = new JButton("M+");
			btn_sumarMemoria_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_sumarMemoria_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_sumarMemoria_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_sumarMemoria_1;
	}
	private JButton getBtn_restarMemoria_1() {
		if (btn_restarMemoria_1 == null) {
			btn_restarMemoria_1 = new JButton("M-");
			btn_restarMemoria_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_restarMemoria_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_restarMemoria_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_restarMemoria_1;
	}
	private JButton getBtn_recuperarMemoria_1() {
		if (btn_recuperarMemoria_1 == null) {
			btn_recuperarMemoria_1 = new JButton("MR");
			btn_recuperarMemoria_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_recuperarMemoria_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_recuperarMemoria_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_recuperarMemoria_1;
	}
	private JButton getBtn_limpiar_1() {
		if (btn_limpiar_1 == null) {
			btn_limpiar_1 = new JButton("C");
			btn_limpiar_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_limpiar_1.setBackground(SystemColor.controlHighlight);
			btn_limpiar_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		}
		return btn_limpiar_1;
	}
	private JButton getBtn_simbolo_1() {
		if (btn_simbolo_1 == null) {
			btn_simbolo_1 = new JButton("±");
			btn_simbolo_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_simbolo_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_simbolo_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_simbolo_1;
	}
	private JButton getBtn_dividir_1() {
		if (btn_dividir_1 == null) {
			btn_dividir_1 = new JButton("÷");
			btn_dividir_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_dividir_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_dividir_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_dividir_1;
	}
	private JButton getBtn_multiplicar_1() {
		if (btn_multiplicar_1 == null) {
			btn_multiplicar_1 = new JButton("x");
			btn_multiplicar_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_multiplicar_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_multiplicar_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_multiplicar_1;
	}
	private JButton getBtn_7_1() {
		if (btn_7_1 == null) {
			btn_7_1 = new JButton("7");
			btn_7_1.setHorizontalTextPosition(SwingConstants.CENTER);
			btn_7_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_7_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_7_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_7_1;
	}
	private JButton getBtn_8_1() {
		if (btn_8_1 == null) {
			btn_8_1 = new JButton("8");
			btn_8_1.setHorizontalTextPosition(SwingConstants.CENTER);
			btn_8_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_8_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_8_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_8_1;
	}
	private JButton getBtn_9_1() {
		if (btn_9_1 == null) {
			btn_9_1 = new JButton("9");
			btn_9_1.setHorizontalTextPosition(SwingConstants.CENTER);
			btn_9_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_9_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_9_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_9_1;
	}
	private JButton getBtn_resta_1() {
		if (btn_resta_1 == null) {
			btn_resta_1 = new JButton("-");
			btn_resta_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_resta_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_resta_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_resta_1;
	}
	private JButton getBtn_4_1() {
		if (btn_4_1 == null) {
			btn_4_1 = new JButton("4");
			btn_4_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_4_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_4_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_4_1;
	}
	private JButton getBtn_5_1() {
		if (btn_5_1 == null) {
			btn_5_1 = new JButton("5");
			btn_5_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_5_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_5_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_5_1;
	}
	private JButton getBtn_6_1() {
		if (btn_6_1 == null) {
			btn_6_1 = new JButton("6");
			btn_6_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_6_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_6_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_6_1;
	}
	private JButton getBtn_suma_1() {
		if (btn_suma_1 == null) {
			btn_suma_1 = new JButton("+");
			btn_suma_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_suma_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_suma_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_suma_1;
	}
	private JButton getBtn_1_1() {
		if (btn_1_1 == null) {
			btn_1_1 = new JButton("1");
			btn_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_1_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_1_1;
	}
	private JButton getBtn_2_1() {
		if (btn_2_1 == null) {
			btn_2_1 = new JButton("2");
			btn_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_2_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_2_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_2_1;
	}
	private JButton getBtn_3_1() {
		if (btn_3_1 == null) {
			btn_3_1 = new JButton("3");
			btn_3_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_3_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_3_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_3_1;
	}
	private JButton getBtn_igual_1() {
		if (btn_igual_1 == null) {
			btn_igual_1 = new JButton("=");
			btn_igual_1.setVerticalAlignment(SwingConstants.BOTTOM);
			btn_igual_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_igual_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_igual_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_igual_1;
	}
	private JButton getBtn_0_1() {
		if (btn_0_1 == null) {
			btn_0_1 = new JButton("      0");
			btn_0_1.setHorizontalAlignment(SwingConstants.LEFT);
			btn_0_1.setHorizontalTextPosition(SwingConstants.CENTER);
			btn_0_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_0_1.setBackground(SystemColor.controlHighlight);
			btn_0_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		}
		return btn_0_1;
	}
	private JButton getBtn_punto_1() {
		if (btn_punto_1 == null) {
			btn_punto_1 = new JButton(".");
			btn_punto_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
			btn_punto_1.setFont(new Font("Arial", Font.PLAIN, 16));
			btn_punto_1.setBackground(SystemColor.controlHighlight);
		}
		return btn_punto_1;
	}
}

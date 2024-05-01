package tp_obligatorio_03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Component;

public class ej_04_AlquilerBicis extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnIngreso;
	private JMenu mnEgreso;
	private JMenu mnFacturacion;
	private JMenuItem mntmDNI;
	private JMenuItem mntmNombres;
	private JMenuItem mntmApellidos;
	private JMenuItem mntmFechaIngreso;
	private JMenuItem mntmIngresoHora;
	private JMenuItem mntmIngresoNroRodado;
	private JMenuItem mntmEgresoNroRodado;
	private JMenuItem mntmEgresoFecha;
	private JMenuItem mntmEgresoHora;
	private JMenuItem mntmMontoHora;
	private JMenuItem mntmCantHoras;
	private JMenuItem mntmMontoTotal;
	private JLabel lbl_imagen_01;
	private JLabel lbl_imagen_02;
	private JTextArea txtrFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej_04_AlquilerBicis frame = new ej_04_AlquilerBicis();
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
	public ej_04_AlquilerBicis() {
		setTitle("A L Q U I L E R   D E   B I C I C L E T A S");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMenuBar_1());
		contentPane.add(getLbl_imagen_01());
		contentPane.add(getLbl_imagen_02());
		contentPane.add(getTxtrFrase());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
			menuBar.setForeground(new Color(255, 255, 255));
			menuBar.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
			menuBar.setBackground(new Color(255, 153, 0));
			menuBar.setBounds(0, 0, 691, 22);
			menuBar.add(getMnInicio());
			menuBar.add(getMnIngreso());
			menuBar.add(getMnEgreso());
			menuBar.add(getMnFacturacion());
		}
		return menuBar;
	}
	private JMenu getMnInicio() {
		if (mnInicio == null) {
			mnInicio = new JMenu("Inicio");
			mnInicio.setBackground(new Color(255, 153, 0));
		}
		return mnInicio;
	}
	private JMenu getMnIngreso() {
		if (mnIngreso == null) {
			mnIngreso = new JMenu("Ingreso de Alquiler");
			mnIngreso.setBackground(new Color(255, 153, 0));
			mnIngreso.add(getMntmDNI());
			mnIngreso.add(getMntmNombres());
			mnIngreso.add(getMntmApellidos());
			mnIngreso.add(getMntmFechaIngreso());
			mnIngreso.add(getMntmIngresoHora());
			mnIngreso.add(getMntmIngresoNroRodado());
		}
		return mnIngreso;
	}
	private JMenu getMnEgreso() {
		if (mnEgreso == null) {
			mnEgreso = new JMenu("Egreso de Alquiler");
			mnEgreso.setBackground(new Color(255, 153, 0));
			mnEgreso.add(getMntmEgresoNroRodado());
			mnEgreso.add(getMntmEgresoFecha());
			mnEgreso.add(getMntmEgresoHora());
		}
		return mnEgreso;
	}
	private JMenu getMnFacturacion() {
		if (mnFacturacion == null) {
			mnFacturacion = new JMenu("Facturacion");
			mnFacturacion.setBackground(new Color(255, 153, 0));
			mnFacturacion.add(getMntmMontoHora());
			mnFacturacion.add(getMntmCantHoras());
			mnFacturacion.add(getMntmMontoTotal());
		}
		return mnFacturacion;
	}
	private JMenuItem getMntmDNI() {
		if (mntmDNI == null) {
			mntmDNI = new JMenuItem("DNI");
			mntmDNI.setForeground(new Color(255, 153, 0));
			mntmDNI.setBackground(new Color(255, 255, 255));
		}
		return mntmDNI;
	}
	private JMenuItem getMntmNombres() {
		if (mntmNombres == null) {
			mntmNombres = new JMenuItem("Nombres");
			mntmNombres.setForeground(new Color(255, 153, 0));
			mntmNombres.setBackground(new Color(255, 255, 255));
		}
		return mntmNombres;
	}
	private JMenuItem getMntmApellidos() {
		if (mntmApellidos == null) {
			mntmApellidos = new JMenuItem("Apellidos");
			mntmApellidos.setForeground(new Color(255, 153, 0));
			mntmApellidos.setBackground(new Color(255, 255, 255));
		}
		return mntmApellidos;
	}
	private JMenuItem getMntmFechaIngreso() {
		if (mntmFechaIngreso == null) {
			mntmFechaIngreso = new JMenuItem("Ingreso fecha");
			mntmFechaIngreso.setForeground(new Color(255, 153, 0));
			mntmFechaIngreso.setBackground(new Color(255, 255, 255));
		}
		return mntmFechaIngreso;
	}
	private JMenuItem getMntmIngresoHora() {
		if (mntmIngresoHora == null) {
			mntmIngresoHora = new JMenuItem("Ingreso hora");
			mntmIngresoHora.setForeground(new Color(255, 153, 0));
			mntmIngresoHora.setBackground(new Color(255, 255, 255));
		}
		return mntmIngresoHora;
	}
	private JMenuItem getMntmIngresoNroRodado() {
		if (mntmIngresoNroRodado == null) {
			mntmIngresoNroRodado = new JMenuItem("Numero de rodado");
			mntmIngresoNroRodado.setForeground(new Color(255, 153, 0));
			mntmIngresoNroRodado.setBackground(new Color(255, 255, 255));
		}
		return mntmIngresoNroRodado;
	}
	private JMenuItem getMntmEgresoNroRodado() {
		if (mntmEgresoNroRodado == null) {
			mntmEgresoNroRodado = new JMenuItem("Numero de rodado");
			mntmEgresoNroRodado.setForeground(new Color(255, 153, 0));
			mntmEgresoNroRodado.setBackground(new Color(255, 255, 255));
		}
		return mntmEgresoNroRodado;
	}
	private JMenuItem getMntmEgresoFecha() {
		if (mntmEgresoFecha == null) {
			mntmEgresoFecha = new JMenuItem("Egreso fecha");
			mntmEgresoFecha.setForeground(new Color(255, 153, 0));
			mntmEgresoFecha.setBackground(new Color(255, 255, 255));
		}
		return mntmEgresoFecha;
	}
	private JMenuItem getMntmEgresoHora() {
		if (mntmEgresoHora == null) {
			mntmEgresoHora = new JMenuItem("Egreso hora");
			mntmEgresoHora.setForeground(new Color(255, 153, 0));
			mntmEgresoHora.setBackground(new Color(255, 255, 255));
		}
		return mntmEgresoHora;
	}
	private JMenuItem getMntmMontoHora() {
		if (mntmMontoHora == null) {
			mntmMontoHora = new JMenuItem("Monto por hora");
			mntmMontoHora.setForeground(new Color(255, 153, 0));
			mntmMontoHora.setBackground(new Color(255, 255, 255));
		}
		return mntmMontoHora;
	}
	private JMenuItem getMntmCantHoras() {
		if (mntmCantHoras == null) {
			mntmCantHoras = new JMenuItem("Sumatoria de horas");
			mntmCantHoras.setForeground(new Color(255, 153, 0));
			mntmCantHoras.setBackground(new Color(255, 255, 255));
		}
		return mntmCantHoras;
	}
	private JMenuItem getMntmMontoTotal() {
		if (mntmMontoTotal == null) {
			mntmMontoTotal = new JMenuItem("Monto total a facturar");
			mntmMontoTotal.setForeground(new Color(255, 153, 0));
			mntmMontoTotal.setBackground(new Color(255, 255, 255));
		}
		return mntmMontoTotal;
	}
	private JLabel getLbl_imagen_01() {
		if (lbl_imagen_01 == null) {
			lbl_imagen_01 = new JLabel("");
			lbl_imagen_01.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Archivos JAVA\\Ejercicios clase JAVA\\TP_03\\Imagenes\\imagen01.jpg"));
			lbl_imagen_01.setBounds(0, 23, 250, 400);
		}
		return lbl_imagen_01;
	}
	private JLabel getLbl_imagen_02() {
		if (lbl_imagen_02 == null) {
			lbl_imagen_02 = new JLabel("");
			lbl_imagen_02.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Archivos JAVA\\Ejercicios clase JAVA\\TP_03\\Imagenes\\imagen02.jpg"));
			lbl_imagen_02.setBounds(152, 33, 539, 305);
		}
		return lbl_imagen_02;
	}
	private JTextArea getTxtrFrase() {
		if (txtrFrase == null) {
			txtrFrase = new JTextArea();
			txtrFrase.setSelectedTextColor(Color.WHITE);
			txtrFrase.setLineWrap(true);
			txtrFrase.setBackground(new Color(0, 0, 0));
			txtrFrase.setForeground(new Color(255, 153, 0));
			txtrFrase.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 17));
			txtrFrase.setWrapStyleWord(true);
			txtrFrase.setText("Descubre la libertad de moverte por la ciudad de una manera saludable, ecológica y divertida. Con nuestra amplia flota de bicicletas disponibles en puntos convenientes en toda la ciudad, el alquiler de bicicletas nunca ha sido tan sencillo.");
			txtrFrase.setBounds(250, 346, 441, 99);
		}
		return txtrFrase;
	}
}

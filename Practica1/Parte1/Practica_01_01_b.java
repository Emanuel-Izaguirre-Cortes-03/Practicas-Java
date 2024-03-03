package Parte1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class Practica_01_01_b extends JFrame {
	private JTabbedPane contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica_01_01_b frame = new Practica_01_01_b();
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
	public Practica_01_01_b() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Frame Practica01_01_b");
		contentPane = new JTabbedPane();
		contentPane.add("Pestaña 1",new JPanel());
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add("Pestaña 2",new JPanel());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JDesktopPane deskopPane = new JDesktopPane();
		contentPane.addTab("Pestaña 3",null, deskopPane,null);
		JInternalFrame internalFrame = new JInternalFrame("new JInternalFrame");
		contentPane.addTab("Pestaña 4",null, internalFrame,null);
		internalFrame.setVisible(true);
	}

	

}

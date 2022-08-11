package exercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JCheckBox chCarregador = new JCheckBox("Carregador - R$ 290,00");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 150,00");
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 230,00");
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 150,00");
	JComboBox cbPlacaVideo = new JComboBox();
	JCheckBox chPlacaVideo = new JCheckBox("Placa video off-board");

	
	Notebook no = new Notebook();
	Desktop de = new Desktop();
	

	
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        } 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Configure seu computador");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel.setBounds(142, 11, 208, 26);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbNotebok = new JRadioButton("Notebook");
		rbNotebok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chCarregador.setEnabled(true);
				chPasta.setEnabled(true);
				
				chEstabilizador.setEnabled(false);
				chTeclado.setEnabled(false);
				chEstabilizador.setSelected(false);
				chTeclado.setSelected(false);
			}
		});
		rbNotebok.setFont(new Font("Verdana", Font.PLAIN, 12));
		rbNotebok.setSelected(true);
		buttonGroup.add(rbNotebok);
		rbNotebok.setBounds(60, 65, 109, 23);
		contentPane.add(rbNotebok);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chEstabilizador.setEnabled(true);
				chTeclado.setEnabled(true);
				
				chCarregador.setEnabled(false);
				chPasta.setEnabled(false);
				chCarregador.setSelected(false);
				chPasta.setSelected(false);
			}
		});
		rbDesktop.setFont(new Font("Verdana", Font.PLAIN, 12));
		buttonGroup.add(rbDesktop);
		rbDesktop.setBounds(334, 65, 109, 23);
		contentPane.add(rbDesktop);
		
		JLabel lblNewLabel_1 = new JLabel("Placa-M\u00E3e");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(127, 95, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 500,00", "Modelo 2 - R$ 300,00", "Modelo 3 - R$ 600,00", "Modelo 4 - R$ 900,00"}));
		cbPlacaMae.setFont(new Font("Verdana", Font.PLAIN, 11));
		cbPlacaMae.setBounds(217, 95, 167, 22);
		contentPane.add(cbPlacaMae);
		
		JLabel lblNewLabel_1_1 = new JLabel("HD");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(127, 128, 73, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cbHD = new JComboBox();
		cbHD.setModel(new DefaultComboBoxModel(new String[] {"500 GB - R$ 300,00", "240 GB - R$ 200,00", "1 TB - R$ 500,00", "2 TB - R$ 1600,00"}));
		cbHD.setFont(new Font("Verdana", Font.PLAIN, 11));
		cbHD.setBounds(217, 128, 167, 22);
		contentPane.add(cbHD);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"1 GB - R$ 50,00", "2 GB - R$ 70,00", "4 GB - R$ 200,00", "8 GB - R$ 300,00", "16 GB - R$ 600,00", "32 GB - R$ 900,00"}));
		cbMemoria.setFont(new Font("Verdana", Font.PLAIN, 11));
		cbMemoria.setBounds(217, 161, 167, 22);
		contentPane.add(cbMemoria);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mem\u00F3ria");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(127, 161, 73, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Core i3 - R$ 200,00", "Core i5 - R$ 800,00", "Core i7 - R$ 700,00"}));
		cbProcessador.setFont(new Font("Verdana", Font.PLAIN, 11));
		cbProcessador.setBounds(217, 194, 167, 22);
		contentPane.add(cbProcessador);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Processador");
		lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(127, 198, 93, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(8, 278, 474, 2);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 48, 472, 2);
		contentPane.add(separator_2);
		
		chCarregador.setFont(new Font("Verdana", Font.PLAIN, 11));
		chCarregador.setBounds(18, 293, 180, 23);
		contentPane.add(chCarregador);
		
		chPasta.setFont(new Font("Verdana", Font.PLAIN, 11));
		chPasta.setBounds(18, 327, 180, 23);
		contentPane.add(chPasta);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(238, 278, 2, 107);
		contentPane.add(separator_1);
		chEstabilizador.setEnabled(false);
		
		chEstabilizador.setFont(new Font("Verdana", Font.PLAIN, 12));
		chEstabilizador.setBounds(261, 293, 219, 23);
		contentPane.add(chEstabilizador);
		chTeclado.setEnabled(false);
		
		chTeclado.setFont(new Font("Verdana", Font.PLAIN, 12));
		chTeclado.setBounds(261, 327, 180, 23);
		contentPane.add(chTeclado);
		
		JCheckBox chGarantia = new JCheckBox("Garantia estendida");
		chGarantia.setFont(new Font("Verdana", Font.PLAIN, 12));
		chGarantia.setBounds(168, 393, 147, 23);
		contentPane.add(chGarantia);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(8, 384, 474, 2);
		contentPane.add(separator_3);
		
		JButton btFinalizar = new JButton("Finalizar pedido");
		btFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbNotebok.isSelected()) {
					// Notebook
					
					// Placa mãe
					if(cbPlacaMae.getSelectedIndex() == 0) {
						no.setPlacaMae(500);						
					} else if (cbPlacaMae.getSelectedIndex() == 1) {
						no.setPlacaMae(300);
					} else if (cbPlacaMae.getSelectedIndex() == 2) {
						no.setPlacaMae(600);
					}else {
						no.setPlacaMae(900);

					}
					
					no.setConfiguracao("Placa mãe: " + cbPlacaMae.getSelectedItem() + "\n");
					
					// HD
					if(cbHD.getSelectedIndex() == 0) {
						no.setHd(300);						
					} else if (cbHD.getSelectedIndex() == 1) {
						no.setHd(200);
					} else if (cbHD.getSelectedIndex() == 2) {
						no.setHd(500);
					}else {
						no.setHd(1600);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "HD: " + cbHD.getSelectedItem() + "\n");
					
					// Memória
					if(cbMemoria.getSelectedIndex() == 0) {
						no.setMemoria(50);						
					} else if (cbMemoria.getSelectedIndex() == 1) {
						no.setMemoria(70);
					} else if (cbMemoria.getSelectedIndex() == 2) {
						no.setMemoria(200);
					}else if (cbMemoria.getSelectedIndex() == 3) {
						no.setMemoria(300);
					}else if (cbMemoria.getSelectedIndex() == 4) {
						no.setMemoria(600);
					}else{
						no.setMemoria(900);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "Memória: " + cbMemoria.getSelectedItem() + "\n");
					
					// Processador
					if(cbProcessador.getSelectedIndex() == 0) {
						no.setProcessador(200);						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						no.setProcessador(800);
					} else {
						no.setProcessador(700);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "Processador: " + cbProcessador.getSelectedItem() + "\n");
					
					// placa de vídeo
					
					if(cbPlacaVideo.getSelectedIndex() == 0) {
						no.setPlacaVideo(0);						
					} else if (cbPlacaVideo.getSelectedIndex() == 1) {
						no.setPlacaVideo(600);
					} else if (cbPlacaVideo.getSelectedIndex() == 2) {
						no.setPlacaVideo(2200);
					}else {
						no.setPlacaVideo(2400);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "Placa de vídeo: " + cbPlacaVideo.getSelectedItem() + "\n");
								
					// Carregador
					if(chCarregador.isSelected()) {
						no.setCarregador(290);
						no.setConfiguracao(no.getConfiguracao() + "Carregador: R$ 290,00 \n");
					} else {
						no.setCarregador(0);
					}
					
					// pasta
					if(chPasta.isSelected()) {
						no.setPasta(150);
						no.setConfiguracao(no.getConfiguracao() + "Pasta: R$ 150,00 \n");
					} else {
						no.setPasta(0);
					}
					
					// Volumes
					no.setVolumes(1);
					no.setConfiguracao(no.getConfiguracao() + "Volume: " + no.getVolumes() + " caixa \n");
					
					// Garantia
					if(chGarantia.isSelected()) {
						no.setGarantia(1);
						no.setConfiguracao(no.getConfiguracao() + "Garantia extendida: " + no.getGarantia() + " ano \n");
					} else {
						no.setConfiguracao(no.getConfiguracao() + "Garantia extendida: Não selecionada! \n");
					}
					
					// Impressão
					if(chGarantia.isSelected()) {
						no.impressaoGarantia();
					} else {
						no.impressao();
					}
				
				
				
				}else {
					//desktop
					
					
					// Placa mãe
					if(cbPlacaMae.getSelectedIndex() == 0) {
						de.setPlacaMae(500);						
					} else if (cbPlacaMae.getSelectedIndex() == 1) {
						de.setPlacaMae(300);
					} else if (cbPlacaMae.getSelectedIndex() == 2) {
						de.setPlacaMae(600);
					}else {
						de.setPlacaMae(900);

					}
					
					de.setConfiguracao("Placa mãe: " + cbPlacaMae.getSelectedItem() + "\n");
					
					// HD
					if(cbHD.getSelectedIndex() == 0) {
						de.setHd(300);						
					} else if (cbHD.getSelectedIndex() == 1) {
						de.setHd(200);
					} else if (cbHD.getSelectedIndex() == 2) {
						de.setHd(500);
					}else {
						de.setHd(1600);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "HD: " + cbHD.getSelectedItem() + "\n");
					
					// Memória
					if(cbMemoria.getSelectedIndex() == 0) {
						de.setMemoria(50);						
					} else if (cbMemoria.getSelectedIndex() == 1) {
						de.setMemoria(70);
					} else if (cbMemoria.getSelectedIndex() == 2) {
						de.setMemoria(200);
					}else if (cbMemoria.getSelectedIndex() == 3) {
						de.setMemoria(300);
					}else if (cbMemoria.getSelectedIndex() == 4) {
						de.setMemoria(600);
					}else{
						de.setMemoria(900);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "Memória: " + cbMemoria.getSelectedItem() + "\n");
					
					// Processador
					if(cbProcessador.getSelectedIndex() == 0) {
						de.setProcessador(200);						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						de.setProcessador(800);
					} else {
						de.setProcessador(700);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "Processador: " + cbProcessador.getSelectedItem() + "\n");
					
					// placa de vídeo
					
					if(cbPlacaVideo.getSelectedIndex() == 0) {
						de.setPlacaVideo(0);						
					} else if (cbPlacaVideo.getSelectedIndex() == 1) {
						de.setPlacaVideo(600);
					} else if (cbPlacaVideo.getSelectedIndex() == 2) {
						de.setPlacaVideo(2200);
					}else {
						de.setPlacaVideo(2400);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "Placa de vídeo: " + cbPlacaVideo.getSelectedItem() + "\n");
								
					// estabilizador
					if(chCarregador.isSelected()) {
						de.setEstabilizador(230);
						de.setConfiguracao(de.getConfiguracao() + "Estabilizador: R$ 290,00 \n");
					} else {
						de.setEstabilizador(0);
					}
					
					// teclado
					if(chPasta.isSelected()) {
						de.setTeclado(150);
						de.setConfiguracao(de.getConfiguracao() + "Teclado: R$ 150,00 \n");
					} else {
						de.setTeclado(0);
					}
					
					// Volumes
					de.setVolumes(1);
					de.setConfiguracao(de.getConfiguracao() + "Volume: " + de.getVolumes() + " caixa \n");
					
					// Garantia
					if(chGarantia.isSelected()) {
						de.setGarantia(1);
						de.setConfiguracao(de.getConfiguracao() + "Garantia extendida: " + de.getGarantia() + " anos\n");
					} else {
						de.setConfiguracao(de.getConfiguracao() + "Garantia extendida: Não selecionada! \n");
					}
					
					// Impressão
					if(chGarantia.isSelected()) {
						de.impressaoGarantia();
					} else {
						de.impressao();
					}
				}
				
				
			}
		});
		btFinalizar.setBounds(183, 435, 117, 23);
		contentPane.add(btFinalizar);
		
		
		cbPlacaVideo.setModel(new DefaultComboBoxModel(new String[] {"Nenhuma", "Radeons - R$ 600,00", "GeForce GTX - R$ 2200,00", "RTX - R$ 2400,00"}));
		cbPlacaVideo.setFont(new Font("Verdana", Font.PLAIN, 11));
		cbPlacaVideo.setBounds(217, 227, 167, 22);
		contentPane.add(cbPlacaVideo);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Placa de video");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1.setBounds(127, 232, 93, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
	}
}

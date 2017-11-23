package GUI;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import Negocio.Cinegrafista;
import Negocio.Cliente;
import Negocio.Evento;
import Negocio.Fotografo;
import Negocio.Funcionario;
import Negocio.Negocio;

public class Juiapp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_5;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juiapp frame = new Juiapp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Juiapp() {
		setTitle("Sistema de Gerencia de Eventos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 491);
		Negocio negocio = new Negocio();
		//habilitar a UI do sistema
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch(Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}
		//botão de maximizar
		this.setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 774, 432);
		contentPane.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Cadastro", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(277, 13, 480, 375);
		panel_2.add(panel_1);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		
		JLabel lblCadastros = new JLabel("Cadastros");
		lblCadastros.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCadastros.setBounds(12, 15, 88, 16);
		panel_1.add(lblCadastros);
		JTable table_1 = new JTable(modelo);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "Endere\u00E7o", "Categoria", "Data/Hora"
			}
		));
		table_1.setBounds(12, 44, 456, 318);
		panel_1.add(table_1);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table_1, popupMenu);
		
		JMenuItem lblEditar = new JMenuItem("Editar              ");
		popupMenu.add(lblEditar);
		
		JMenuItem lblDeletar = new JMenuItem("Deletar            ");
		popupMenu.add(lblDeletar);
		
		JMenuItem lblInfo = new JMenuItem("Mais Informações      ");
		popupMenu.add(lblInfo);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 254, 375);
		panel_2.add(panel);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(12, 51, 56, 16);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(12, 68, 109, 22);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("CPF:");
		label_1.setBounds(133, 51, 56, 16);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 68, 109, 22);
		panel.add(textField_1);
		
		JLabel label_2 = new JLabel("Endere\u00E7o:");
		label_2.setBounds(12, 103, 79, 16);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 123, 109, 22);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("Telefone:");
		label_3.setBounds(133, 103, 56, 16);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 123, 109, 22);
		panel.add(textField_3);
		
		JLabel lblPainelDeCadastro = new JLabel("Painel de Cadastro");
		lblPainelDeCadastro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPainelDeCadastro.setBounds(12, 13, 178, 16);
		panel.add(lblPainelDeCadastro);
		
		JButton btnSubmeter = new JButton("Submeter");
		
		btnSubmeter.setBounds(145, 341, 97, 25);
		panel.add(btnSubmeter);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(12, 215, 79, 16);
		panel.add(lblCategoria);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(12, 329, 224, 3);
		panel.add(panel_3);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(12, 159, 56, 16);
		panel.add(lblData);
		
		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(133, 159, 56, 16);
		panel.add(lblHora);
		
		textField_5 = new JTextField();
		textField_5.setBounds(133, 179, 109, 22);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(12, 179, 109, 22);
		panel.add(dateChooser);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Casamento", "Anivers\u00E1rio", "Batizado"}));
		comboBox.setBounds(12, 236, 109, 22);
		panel.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Cliente", "Funcion\u00E1rio"}));
		comboBox_1.setBounds(133, 236, 109, 22);
		panel.add(comboBox_1);
		
		JLabel lblPessoa = new JLabel("Pessoa:");
		lblPessoa.setBounds(133, 215, 56, 16);
		panel.add(lblPessoa);
		
		JCheckBox chckbxFilmagem = new JCheckBox("Filmagem");
		chckbxFilmagem.setBounds(8, 295, 113, 25);
		panel.add(chckbxFilmagem);
		
		JCheckBox chckbxFotografia = new JCheckBox("Fotografia");
		chckbxFotografia.setBounds(129, 295, 113, 25);
		panel.add(chckbxFotografia);
		
		JLabel lblServios = new JLabel("Servi\u00E7o(s):");
		lblServios.setBounds(12, 275, 109, 16);
		panel.add(lblServios);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Calendário", null, panel_4, null);
		panel_4.setLayout(null);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(12, 13, 745, 331);
		panel_4.add(calendar);
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selectedBook = (String) comboBox_1.getSelectedItem ();
				
				if (selectedBook == "Cliente") {
					textField.setEnabled(true);
					textField_3.setEnabled(true);
					textField_2.setEnabled(true);
					textField_5.setEnabled(true);
					dateChooser.setEnabled(true);
					comboBox.setEnabled(true);
				}
				else {
					textField_5.setEnabled(false);
					dateChooser.setEnabled(false);
					comboBox.setEnabled(false);
				}
				
			}
		});
		
		/*Calendar cal = Calendar.getInstance();
		cal.setTime(calendar.getDate());
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		JPanel jpanel = calendar.getDayChooser().getDayPanel();
		Component component[] = jpanel.getComponents();

        //this value will differ from each month due to first days of each month
        component[ 30 ].setBackground(Color.blue);
		
		//cal.add(Calendar.DATE, 5);
		
		calendar.setDate(cal.getTime());
		
		//calendar.setDecorationBordersVisible(true);*/
		
		//simpleDateFormat ft = simpleDateFormat("formatodata");
		//time = formater1.parser(timestring);
		
		btnSubmeter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String selectedBook = (String) comboBox_1.getSelectedItem();
				String nome = textField.getText();
				String cpf = textField_1.getText();
				String numTelefone = textField_3.getText();
				String endereco = textField_2.getText();
				String textData = null;
				String textHorario = textField_5.getText();
				int numColunas = table_1.getColumnCount();
				int idFunc = negocio.getCountFuncionarios();
				int idEvent = negocio.getCountEvents();
				int idClient = negocio.getCountClients();
				Object [] fila = new Object[numColunas];
				//System.out.println(selectedBook);
				if (selectedBook.equals("Cliente")) {
					if (textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || 
						textField_3.getText().equals("") || textField_5.equals("") || chckbxFilmagem.isSelected() == false && 
						chckbxFotografia.isSelected() == false) {
							Object[] message = {"Verifique se todos os campos foram preenchidos"}; 
							JOptionPane.showMessageDialog(null, message);
							return;
					}
					textData = dateChooser.getDate().toString();
					if (negocio.getCountFuncionarios() == 0) {
						Object[] message = {"Nenhum Funcionário Disponível!"}; 
						JOptionPane.showMessageDialog(null, message);
						return;
					}
					else {
						Cliente cli = new Cliente(nome, cpf, numTelefone, endereco, idClient);
						Evento event = null;
						String tipoEvento =	comboBox.getSelectedItem().toString();
						for (int i = 0; i < negocio.getCountClients(); i++) {
							if (negocio.getCliente(i).getCpf().equals(cli.getCpf())) {
								Object[] message = {"Cliente já Registrado!"}; 
								JOptionPane.showMessageDialog(null, message);
								return;
							}
						}
						
						for (int i = 0; i < negocio.getCountClients(); i++) {
							Random temp = new Random();
							int numero = temp.nextInt();
							
							if (numero != negocio.getCliente(i).id) {
								idClient = numero;
								break;
							}
						}
						
						if (tipoEvento.equals("Casamento")) {
							event = new Evento(500, cli.getEndereco(), textData, tipoEvento, idClient);
						}
						else if (tipoEvento.equals("Aniversário")) {
							event = new Evento(500, cli.getEndereco(), textData, tipoEvento, idClient);
						}
						else if (tipoEvento.equals("Batizado")) {
							event = new Evento(500, cli.getEndereco(), textData, tipoEvento, idClient);
						}
						else {
							System.out.println("Algo errado na combobox!");
							return;
						}
						if(cli.validarCpf() == false) {
							Object[] message = {"CPF Inválido!"};
							JOptionPane.showMessageDialog(null, message);
							return;
						}
						for (int i = 0; i < negocio.getCountEvents(); i++) {
							if (negocio.getEvento(i).getHorario().equals(tipoEvento)) {
								Object[] message = {"Evento já Programado para este Dia!"}; 
								JOptionPane.showMessageDialog(null, message);
								return;
							}
						}
						
						negocio.AddCliente(cli);
						negocio.AddEvento(event);
						
						idClient++;
						idEvent++;
						
						negocio.ImprimeClients();
						
						System.out.println("-----------------");
						
						textData = dateChooser.getDateEditor().getDateFormatString();
						fila[0] = cli.getNome();
						fila[3] = dateChooser.getDate();
						fila[1] = cli.getEndereco();
						fila[2] = event.getTipoEvento();
						((DefaultTableModel) table_1.getModel()).addRow(fila);
					}
				}
				else {
					if (textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") || 
						textField_3.getText().equals("") || chckbxFilmagem.isSelected() == false && 
						chckbxFotografia.isSelected() == false) {
							Object[] message = {"Verifique se todos os campos foram preenchidos"}; 
							JOptionPane.showMessageDialog(null, message);
							return;
					}
					else {
						Funcionario func = null;
						for (int i = 0; i < negocio.getCountFuncionarios(); i++) {
							if (negocio.getFuncionario(i).getCpf().equals(cpf)) {
								Object[] message = {"Funcionário já Registrado!"}; 
								JOptionPane.showMessageDialog(null, message);
								return;
							}
						}
						
						if (chckbxFilmagem.isSelected()) {
							func = new Cinegrafista(nome, cpf, numTelefone, endereco, 150, idFunc);
						}
						else {
							func = new Fotografo(nome, cpf, numTelefone, endereco, 150, idFunc);
						}
						
						if(func.validarCpf() == false) {
							Object[] message = {"CPF Inválido!"};
							JOptionPane.showMessageDialog(null, message);
							return;
						}
						
						negocio.AddFunc(func);
						idFunc++;
						
						/*for (int i = 0; i < negocio.getCountFuncionarios(); i++) {
							if (negocio.getFuncionario(i) instanceof Cinegrafista) {
								System.out.println(negocio.getFuncionario(i).nome + " é um Cinegrafista");
							}
							else {
								System.out.println(negocio.getFuncionario(i).nome + " é um Fotógrafo");
							}
						}*/
					}
				}
			}
		});
		
		lblEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(lblEditar, "Editar");
			}
		});
		
		lblInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				String evento = negocio.getEvento(i).getTipoEvento();
				Object[] message = {evento + " às " + negocio.getEvento(i).getHorario() + " na " + negocio.getEvento(i).getLocal()}; 
				JOptionPane.showMessageDialog(null, message, "Info", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		lblEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				
				if (i >= 0) {
					
					Object[] message = {"Deseja Realmente Editar o Evento?"}; 
					Object[] options = { "Sim", "Não" }; 
					
					int n = JOptionPane.showOptionDialog(new JFrame(), message, "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]); 
					
					if(n == JOptionPane.OK_OPTION) { 
						
						
						
					}
					
					if(n == JOptionPane.NO_OPTION) {
						 
					}
					
					if(n == JOptionPane.CLOSED_OPTION) {
						
					}
					
				}
				
				else {
					System.out.println("Erro!");
				}
			}
			
		});
		
		lblDeletar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = table_1.getSelectedRow();
				
				if (i >= 0) {
					
					Object[] message = {"Deseja Realmente Remover o Evento?"}; 
					Object[] options = { "Sim", "Não" }; 
					
					int n = JOptionPane.showOptionDialog(new JFrame(), message, "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]); 
					
					if(n == JOptionPane.OK_OPTION) { 
						((DefaultTableModel) table_1.getModel()).removeRow(i);
						System.out.println(negocio.getCliente(i).getId());
						
						for (int g = 0; g < negocio.getCountClients(); g++) {
							if (negocio.getCliente(g).id == negocio.getCliente(i).getId()) {
								negocio.RemoveCliente(g);
							}
						}
						
						//JOptionPane.showMessageDialog(null, "Excluido!");
					}
					
					if(n == JOptionPane.NO_OPTION) {
						 
					}
					
					if(n == JOptionPane.CLOSED_OPTION) {
						
					}
					
				}
				
				else {
					System.out.println("Erro!");
				}
			}
			
		});
		
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

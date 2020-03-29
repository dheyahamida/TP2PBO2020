import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MainUI extends JFrame{
	
	ArrayList<Buku> bukuList;
	String header[] = new String[] {"Kode", "Nama", "Peminjam", "Tanggal Pinjam", "Tanggal Pengembalian"};
	DefaultTableModel dtm;
	int row, col;

	/**
	* Creates new form MainUI
	*
	*/
	public MainUI() {
		Initialize();
		bukuList = new ArrayList<>();
		dtm = new DefaultTableModel(header, 0);
		jTable.setModel(dtm);
		this.setLocationRelativeTo(null);
	}

	/**
	* This method is called from within the constructor to initialize the form.
	*
	*/
	@SuppressWarnings("unchecked")
	// <your-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:Initialize
	private void Initialize(){
		
		jTable = new JTable();
		jBtnAdd = new JButton();
		jIcon = new ImageIcon("assets/add.png"); //for sublime user, delete the "src/"
		jLblKode = new JLabel();
		jLblNama = new JLabel();
		jLblPeminjam = new JLabel();
		jTFKode = new JTextField();
		jTFNama = new JTextField();
		jTFPeminjam = new JTextField();
		jPanel = new JPanel();
		jScrollPane = new JScrollPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Peminjaman Buku List & Table");
		setResizable(false);

		jTable.setModel(new DefaultTableModel(
			new Object [][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null}
			},
			new String [] {
				"Title 1", "Title 2", "Title 3", "Title 4"
			}
		));

		jScrollPane.setViewportView(jTable);
		jLblKode.setText("Kode");
		jLblNama.setText("Nama");
		jLblPeminjam.setText("Peminjam");
		jBtnAdd.setText("Add");
		jBtnAdd.setIcon(resizeIcon(jIcon, 20, 20));
		jBtnAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				jBtnAddActionPerformed(evt);
			}
		});

		jPanel.setBorder(BorderFactory.createEtchedBorder());
		javax.swing.GroupLayout jPanelLayout = new GroupLayout(jPanel);
		jPanel.setLayout(jPanelLayout);

		// jPanel Layouting
		jPanelLayout.setHorizontalGroup(
			jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanelLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(jPanelLayout.createSequentialGroup()
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jLblKode)
							.addComponent(jLblNama)
							.addComponent(jLblPeminjam))
			
						.addGap(18, 18, 18)
			
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jTFKode)
							.addComponent(jTFNama)
							.addComponent(jTFPeminjam, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
			
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jBtnAdd, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					)
				)
			.addContainerGap()
			)
		);
		jPanelLayout.setVerticalGroup(
			jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanelLayout.createSequentialGroup()
				.addContainerGap()
			
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jLblKode)
					.addComponent(jTFKode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(jLblNama)
					.addComponent(jTFNama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jLblPeminjam)
					.addComponent(jTFPeminjam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(jBtnAdd))

				.addContainerGap()
			)
		);

		//Layouting
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(jPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(JScrollPane)
					)
				.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(JScrollPane, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
				.addGap(13, 13, 13)
				)
		);

		pack();
	}// </your-fold>//GEN-END:Initialize

	private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jBtnAddActionPerformed
		// TODO add your handling code here:
		String Kode = jTFKode.getText();
		String Nama = jTFNama.getText();
		int Peminjam = Integer.parseInt(jTFPeminjam.getText());
		bukuList.add(new Rider(Kode, Nama, Peminjam));
		dtm.setRowCount(0); //reset data model
		for (int i = 0; i < bukuList.size(); i++) {
			Object[] objs = {i+1, bukuList.get(i).Kode, 
							bukuList.get(i).Nama,
							bukuList.get(i).Peminjam};
			dtm.addRow(objs);
		}
		//reset
		clearField();

	}//GEN-LAST:event_jBtnAddActionPerformed

	private void clearField(){
		jTFKode.requestFocus();
		jTFKode.setText("");
		jTFNama.setText("");
		jTFPeminjam.setText("");
	}

	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
		Image img = icon.getImage();
		Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, java.awt.Image.SCALE_SMOOTH);
		return new ImageIcon(resizedImage);
	}

	/**
	* @param args the command line arguments
	*/
	public static void main(String arg[]) {
		/* Set the Nimbus look and feel */
		//<your-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		*/
		try{
			for (javax.swing.UIManager.LookandFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getKode())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassKode());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getKode()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getKode()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getKode()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getKode()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</your-fold>

		/* Create and display the form */
		java.awt.EventQueue.InvokeLater(new Runnable() {
			public void run() {
				new MainUI().setVisible(true);
			}
		});
	}

	//Object declaration//GEN-BEGIN:variables
	private JTable jTable;
	private JButton jBtnAdd;
	private JLabel jLblKode;
	private JLabel jLblNama;
	private JLabel jLblPeminjam;
	private JTextField jTFKode;
	private JTextField jTFNama;
	private JTextField jTFPeminjam;
	private JPanel jPanel;
	private JScrollPane jScrollPane;
	private ImageIcon jIcon;
	// End of variables declaration//GEN-END:variables


	/*Kode praktikum yang kemarin masih gabisa jalan juga di pc ini, jujur jadi bingung*/
}


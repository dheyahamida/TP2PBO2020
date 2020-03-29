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

//Challenge clue:
// import javax.swing.JComboBox;
// import javax.swing.DefaultComboBoxModel;

public class MainUI extends JFrame{
	
	ArrayList<Rider> riderList;
	String header[] = new String[] {"No", "Name", "Nationality", "Number", "Bike"};
	DefaultTableModel dtm;
	int row, col;

	/**
	* Creates new form MainUI
	*
	*/
	public MainUI() {
		Initialize();
		riderList = new ArrayList<>();
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
		jLblName = new JLabel();
		jLblNationality = new JLabel();
		jLblNumber = new JLabel();
		jTFName = new JTextField();
		jTFNationality = new JTextField();
		jTFNumber = new JTextField();
		jPanel = new JPanel();
		jScrollPane = new JScrollPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Rider List & Table");
		setResizable(false);

		/**
		*
		* Component Lay here
		* Challenge clue: it could be written here
		*/
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
		jLblName.setText("Name");
		jLblNationality.setText("Nationality");
		jLblNumber.setText("Number");
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
							.addComponent(jLblName)
							.addComponent(jLblNationality)
							.addComponent(jLblNumber))
			
						.addGap(18, 18, 18)
			
						.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(jTFName)
							.addComponent(jTFNationality)
							.addComponent(jTFNumber, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
			
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
					.addComponent(jLblName)
					.addComponent(jTFName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(jLblNationality)
					.addComponent(jTFNationality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			
				.addGroup(jPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(jLblNumber)
					.addComponent(jTFNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
		String name = jTFName.getText();
		String nationality = jTFNationality.getText();
		int number = Integer.parseInt(jTFNumber.getText());
		riderList.add(new Rider(name, nationality, number));
		dtm.setRowCount(0); //reset data model
		for (int i = 0; i < riderList.size(); i++) {
			Object[] objs = {i+1, riderList.get(i).name, 
							riderList.get(i).nationality,
							riderList.get(i).number};
			dtm.addRow(objs);
		}
		//reset
		clearField();

	}//GEN-LAST:event_jBtnAddActionPerformed

	private void clearField(){
		jTFName.requestFocus();
		jTFName.setText("");
		jTFNationality.setText("");
		jTFNumber.setText("");
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
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
	private JLabel jLblName;
	private JLabel jLblNationality;
	private JLabel jLblNumber;
	private JTextField jTFName;
	private JTextField jTFNationality;
	private JTextField jTFNumber;
	private JPanel jPanel;
	private JScrollPane jScrollPane;
	private ImageIcon jIcon;
	// End of variables declaration//GEN-END:variables
}


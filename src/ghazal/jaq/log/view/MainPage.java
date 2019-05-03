package ghazal.jaq.log.view;

import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import ghazal.jaq.log.model.Logiciel;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 2812895747915855261L;
	private static Logiciel log;

	private JButton buAct;
	private JButton buDem;
	private JButton buJG;
	private JButton buMark;
	private JButton buObj;
	private JButton buProd;
	private JButton buRessHu;
	private JButton buSeuil;
	private JButton buTDB;	

	public MainPage(Logiciel givenLog) {
		log = givenLog;
		initComponents();
	}

	private void initComponents() {
		buAct = new JButton();
		buDem = new JButton();
		buJG = new JButton();
		buMark = new JButton();
		buObj = new JButton();
		buProd = new JButton();
		buRessHu = new JButton();
		buSeuil = new JButton();
		buTDB = new JButton();

		buAct.setText("Actionnariat");
		buDem.setText("Demarrage");
		buJG.setText("Journal General");
		buMark.setText("Marketing");
		buObj.setText("Objectifs");
		buProd.setText("Production");
		buRessHu.setText("Ressources Humaines");
		buSeuil.setText("Seuil");
		buTDB.setText("Tableau de Bord");

		buAct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actButtonActionPerformed(evt);
			}
		});

		buDem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				demButtonActionPerformed(evt);
			}
		});

		buJG.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jgButtonActionPerformed(evt);
			}
		});

		buMark.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				markButtonActionPerformed(evt);
			}
		});

		buObj.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				objButtonActionPerformed(evt);
			}
		});

		buProd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				prodButtonActionPerformed(evt);
			}
		});

		buRessHu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ressButtonActionPerformed(evt);
			}
		});

		buSeuil.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				seuilButtonActionPerformed(evt);
			}
		});

		buTDB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tdbButtonActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(buAct)
						.addComponent(buMark)
						.addComponent(buRessHu))
				.addGroup(layout.createParallelGroup()
						.addComponent(buDem)
						.addComponent(buObj)
						.addComponent(buSeuil))
				.addGroup(layout.createParallelGroup()
						.addComponent(buJG)
						.addComponent(buProd)
						.addComponent(buTDB)));
		
		layout.linkSize(SwingConstants.VERTICAL, new java.awt.Component[] {buAct, buMark, buRessHu, buDem, buObj, buSeuil, buJG, buProd, buTDB});
		layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {buAct, buMark, buRessHu, buDem, buObj, buSeuil, buJG, buProd, buTDB});
		
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(buAct)
						.addComponent(buDem)
						.addComponent(buJG))
				.addGroup(layout.createParallelGroup()
						.addComponent(buMark)
						.addComponent(buObj)
						.addComponent(buProd))
				.addGroup(layout.createParallelGroup()
						.addComponent(buRessHu)
						.addComponent(buSeuil)
						.addComponent(buTDB)));
		
		pack();
		
	}

	private void tdbButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new TDBPage(log).setVisible(true);
	}

	private void seuilButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new SeuilPage(log).setVisible(true);
	}

	private void ressButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new RessPage(log).setVisible(true);
	}

	private void prodButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new ProdPage(log).setVisible(true);
	}

	private void objButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new ObjPage(log).setVisible(true);
	}

	private void markButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new MarkPage(log).setVisible(true);
	}

	private void jgButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new JGPage(log).setVisible(true);
	}

	private void demButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		DemPage dp = new DemPage(log);
		dp.setVisible(true);
		this.setVisible(true);
	}

	private void actButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new ActPage(log).setVisible(true);
	}
}

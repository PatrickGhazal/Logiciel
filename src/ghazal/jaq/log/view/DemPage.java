package ghazal.jaq.log.view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import ghazal.jaq.log.model.EntryBasic;
import ghazal.jaq.log.model.Logiciel;
import ghazal.jaq.log.model.PageDemarrage;

public class DemPage extends JFrame {

	private static final long serialVersionUID = 1594896359481920518L;
	private static Logiciel log;

	private JButton backButton, addDataButton;
	private JLabel companyInfo, rates, invoices, logInfo, dateInfo;
	private DemTextBlock companyInfoBlock, ratesBlock, invoicesBlock, logInfoBlock, dateInfoBlock;

	public DemPage(Logiciel givenLog) {
		log = givenLog;
		initComponents();
		refreshData();
	}

	private void initComponents() {
		initBlocks();
		
		backButton = new JButton();
		addDataButton = new JButton();
		
		companyInfo = new JLabel();
		rates = new JLabel();
		invoices = new JLabel();
		logInfo = new JLabel();
		dateInfo = new JLabel();
		
		setLabelText();
		
		backButton.setText("Retour");
		addDataButton.setText("Entree de donnees");
		
		backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonActionPerformed(evt);
			}
		});
		
		addDataButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addDataButtonActionPerformed(evt);
			}
		});
		
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(backButton)
						.addComponent(companyInfo)
						.addComponent(rates))
				.addGroup(layout.createParallelGroup()
						.addComponent(addDataButton)
						.addComponent(invoices)
						.addComponent(logInfo)
						.addComponent(dateInfo)));
		
//		layout.linkSize(SwingConstants.VERTICAL, new java.awt.Component[] {companyInfo, rates, invoices, logInfo, dateInfo});
//		layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {companyInfo, rates, invoices, logInfo, dateInfo});
//		
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(backButton)
						.addComponent(addDataButton))
				.addGroup(layout.createParallelGroup()
						.addComponent(companyInfo)
						.addComponent(invoices))
				.addGroup(layout.createParallelGroup()
						.addComponent(rates)
						.addComponent(logInfo))
				.addGroup(layout.createParallelGroup()
						.addComponent(dateInfo)));
		
		pack();
		
	}
	
	private void initBlocks() {
		companyInfoBlock = new DemTextBlock("Noms de l'entreprise et des produits");
		companyInfoBlock.addEntry(1, "Nom de l'Entreprise", ((PageDemarrage)(log.getPage(0))).getCompanyName(), 25, 20);
		companyInfoBlock.addEntry(2, "Produit 1", ((PageDemarrage)(log.getPage(0))).getProd1(), 25, 20);
		companyInfoBlock.addEntry(3, "Produit 2", ((PageDemarrage)(log.getPage(0))).getProd2(), 25, 20);
		companyInfoBlock.addEntry(4, "Produit 3", ((PageDemarrage)(log.getPage(0))).getProd3(), 25, 20);

		ratesBlock = new DemTextBlock("Taux/chiffres importants");
		ratesBlock.addEntry(5, "Taxes JA", "15.0%", 35, 10);
		ratesBlock.addEntry(6, "Redevances JA", "3.5%", 35, 10);
		ratesBlock.addEntry(7, "Taux d'imposition", "25.0%", 35, 10);
		ratesBlock.addEntry(8, "Taux de commission", "" + ((PageDemarrage)(log.getPage(0))).getCommRate(), 35, 10);
		ratesBlock.addEntry(9, "Salaire horaire", "" + ((PageDemarrage)(log.getPage(0))).getHrSalary(), 35, 10);

		invoicesBlock = new DemTextBlock("Factures     Montant  Reception  Paiement");
		invoicesBlock.addEntry(10, "Premiere facture", "309.00$  S07  S09", 25, 20);
		invoicesBlock.addEntry(11, "Deuxieme facture", "216.00$  S07  S09", 25, 20);
		invoicesBlock.addEntry(12, "Troisieme facture", "-$  -  -", 25, 20);

		logInfoBlock = new DemTextBlock("Information Logiciel");
		logInfoBlock.addEntry(13, "Version", "1.0.0", 30, 15);
		logInfoBlock.addEntry(14, "Date", "03-May-2019", 30, 15);
		
		dateInfoBlock = new DemTextBlock("Soirees JA");
		dateInfoBlock.addEntry(15, "Premiere rencontre", ((PageDemarrage)(log.getPage(0))).getFirstMeet().toString(), 25, 20);
		dateInfoBlock.addEntry(16, "Nombre de rencontres", "" + ((PageDemarrage)(log.getPage(0))).getMeetups(), 25, 20);
	}

	private void refreshData() {
		companyInfoBlock.updateVal(1, ((PageDemarrage)(log.getPage(0))).getCompanyName());
		companyInfoBlock.updateVal(2, ((PageDemarrage)(log.getPage(0))).getProd1());
		companyInfoBlock.updateVal(3, ((PageDemarrage)(log.getPage(0))).getProd2());
		companyInfoBlock.updateVal(4, ((PageDemarrage)(log.getPage(0))).getProd3());
		ratesBlock.updateVal(8, "" + ((PageDemarrage)(log.getPage(0))).getCommRate());
		ratesBlock.updateVal(9, "" + ((PageDemarrage)(log.getPage(0))).getHrSalary());
		dateInfoBlock.updateVal(15, ((PageDemarrage)(log.getPage(0))).getFirstMeet().toString());
		dateInfoBlock.updateVal(16, "" + ((PageDemarrage)(log.getPage(0))).getMeetups());
		
		setLabelText();
	}
	
	private void setLabelText() {
		companyInfo.setText(companyInfoBlock.toString());
		rates.setText(ratesBlock.toString());
		invoices.setText(invoicesBlock.toString());
		logInfo.setText(logInfoBlock.toString());
		dateInfo.setText(dateInfoBlock.toString());
	}
	
	private void backButtonActionPerformed(ActionEvent evt) {
		this.setVisible(false);
		new MainPage(log).setVisible(true);
	}
	
	private void addDataButtonActionPerformed(ActionEvent evt) {
		new DemAddDataPage(log).setVisible(true);
	}
}

class DemTextBlock {
	String title;
	List<EntryBasic> entries;

	public DemTextBlock(String givenTitle) {
		title = pad(givenTitle, 50, true);
		entries = new ArrayList<EntryBasic>();
	}

	public void addEntry(int num, String name, String val, int namePad, int valPad) {
		entries.add(new EntryBasic(num, pad(name, namePad, true), pad(val, valPad, false)));
	}

	public void updateVal(int entryNum, String newVal) {
		for (EntryBasic entry : entries) {
			if (entry.getEntryNum() == entryNum) {
				entry.setValue(newVal);
				break;
			}
		}
	}
	
	public String toString() {
		String returned = "<html>";
		returned += ("<b>" + this.getTitle() + "</b><br />");
		for (EntryBasic entry : this.getEntries()) {
			returned += (entry.toString() + "<br />");
		}
		returned += "<br /></html>";
		return returned;
	}
	
	private String getTitle() {
		return this.title;
	}
	
	private List<EntryBasic> getEntries() {
		return this.entries;
	}

	private static String pad(String str, int length, boolean after) {
		String returned = "";
		if (after) {
			returned = str;
			while (returned.length() < length) {
				returned += " ";
			}
		} else {
			int spaces = length - str.length();
			for (int i = 0; i < spaces; i++) {
				returned += " ";
			}
			returned += str;
		}
		return returned;
	}
}
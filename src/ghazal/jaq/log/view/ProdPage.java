package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class ProdPage extends JFrame {

	private static final long serialVersionUID = 287912780863615194L;
	private static Logiciel log;

	public ProdPage(Logiciel givenLog) {
		log = givenLog;
	}

}

package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class TDBPage extends JFrame {
	
	private static final long serialVersionUID = 3497232431788142323L;
	private static Logiciel log;

	public TDBPage(Logiciel givenLog) {
		log = givenLog;
	}

}

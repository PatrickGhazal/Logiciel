package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class SeuilPage extends JFrame {
	
	private static final long serialVersionUID = -8081359778452951977L;
	private static Logiciel log;

	public SeuilPage(Logiciel givenLog) {
		log = givenLog;
	}

}

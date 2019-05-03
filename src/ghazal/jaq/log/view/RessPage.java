package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class RessPage extends JFrame {

	private static final long serialVersionUID = 1572452199447822996L;
	private static Logiciel log;

	public RessPage(Logiciel givenLog) {
		log = givenLog;
	}

}

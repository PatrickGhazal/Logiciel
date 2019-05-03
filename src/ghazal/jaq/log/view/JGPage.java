package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class JGPage extends JFrame {
	
	private static final long serialVersionUID = -8037158519205051127L;
	private static Logiciel log;

	public JGPage(Logiciel givenLog) {
		log = givenLog;
	}

}

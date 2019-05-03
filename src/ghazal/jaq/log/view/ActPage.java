package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class ActPage extends JFrame {

	private static final long serialVersionUID = 8006021868189611510L;
	private static Logiciel log;
	
	public ActPage(Logiciel givenLog) {
		log = givenLog;
	}

}

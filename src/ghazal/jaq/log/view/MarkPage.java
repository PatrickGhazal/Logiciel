package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class MarkPage extends JFrame {

	private static final long serialVersionUID = -4653808205475087455L;
	private static Logiciel log;

	public MarkPage(Logiciel givenLog) {
		log = givenLog;
	}

}

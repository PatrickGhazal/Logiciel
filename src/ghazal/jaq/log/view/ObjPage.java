package ghazal.jaq.log.view;

import javax.swing.JFrame;

import ghazal.jaq.log.model.Logiciel;

public class ObjPage extends JFrame {
	
	private static final long serialVersionUID = 574055104444543538L;
	private static Logiciel log;

	public ObjPage(Logiciel givenLog) {
		log = givenLog;
	}

}

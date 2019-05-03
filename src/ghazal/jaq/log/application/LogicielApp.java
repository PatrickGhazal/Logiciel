package ghazal.jaq.log.application;

import ghazal.jaq.log.model.Logiciel;
import ghazal.jaq.log.persistence.PersistenceXStream;
import ghazal.jaq.log.view.MainPage;

public class LogicielApp {
	
	static String fileName = "logiciel.txt";
	
	public static void main(String[] args) {
	    Logiciel log = PersistenceXStream.initializeModelManager(fileName);
	    
	    if (log.getPages().size() == 0) {
	    	log = new Logiciel();
	    	PersistenceXStream.saveToXMLwithXStream(log);
	    }
	    
	    final Logiciel givenLog = log;

	    // start UI
	    java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            new MainPage(givenLog).setVisible(true);
	        }
	    });

	}

}

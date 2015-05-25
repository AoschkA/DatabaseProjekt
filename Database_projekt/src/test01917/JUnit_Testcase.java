package test01917;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import connector01917.Connector;
import daoimpl01917.MySQLOperatoerDAO;
import daoimpl01917.MySQLProduktBatchDAO;
import daoimpl01917.MySQLRaavareDAO;
import daoimpl01917.MySQLReceptDAO;
import daointerfaces01917.DALException;
import dto01917.OperatoerDTO;
import dto01917.ProduktBatchDTO;
import dto01917.RaavareDTO;
import dto01917.ReceptDTO;

public class JUnit_Testcase {

	@Test
	public void testOperatoer() {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		MySQLOperatoerDAO opr = null;
		try { opr = new MySQLOperatoerDAO();} 
		catch (DALException e2) { e2.printStackTrace();}
		// Creates the operators 
		OperatoerDTO oprDTO1 = new OperatoerDTO(1001,"Don Juan","DJ","000000-0220","iloveyou");
		OperatoerDTO oprDTO2 = new OperatoerDTO(1002,"Doctor Boon","DB","000000-2000","ilistentopop");
		OperatoerDTO oprDTO3 = new OperatoerDTO(1003,"Master Yoda","MY","020090-2000","forcebewithyou");
		OperatoerDTO oprDTO4 = new OperatoerDTO(1004,"Louis Van Gaal","LVG","000220-0000","nikepaysmyfun");
		OperatoerDTO oprDTO5 = new OperatoerDTO(1005,"Oberst Heinfelt","OH","000000-2090","forhonor");
		// Pretest deletion of Operatoers
		try { opr.deleteOperatoer(oprDTO1);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO2);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO3);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO4);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO5);} 
		catch (DALException e) { e.printStackTrace();}

		// Inserts the operators into the database
		try { opr.createOperatoer(oprDTO1);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.createOperatoer(oprDTO2);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.createOperatoer(oprDTO3);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.createOperatoer(oprDTO4);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.createOperatoer(oprDTO5);}
		catch (DALException e) { System.out.println(e.getMessage()); }


		// Test for insertion into database
		try {
			// Test for opr ID
			assertEquals(opr.getOperatoer(1001).getOprId(),oprDTO1.getOprId());
			assertEquals(opr.getOperatoer(1002).getOprId(),oprDTO2.getOprId());
			assertEquals(opr.getOperatoer(1003).getOprId(),oprDTO3.getOprId());
			assertEquals(opr.getOperatoer(1004).getOprId(),oprDTO4.getOprId());
			assertEquals(opr.getOperatoer(1005).getOprId(),oprDTO5.getOprId());

			// Test for name
			assertEquals(opr.getOperatoer(1001).getOprNavn(),oprDTO1.getOprNavn());
			assertEquals(opr.getOperatoer(1002).getOprNavn(),oprDTO2.getOprNavn());
			assertEquals(opr.getOperatoer(1003).getOprNavn(),oprDTO3.getOprNavn());
			assertEquals(opr.getOperatoer(1004).getOprNavn(),oprDTO4.getOprNavn());
			assertEquals(opr.getOperatoer(1005).getOprNavn(),oprDTO5.getOprNavn());

			// Test for CPR
			assertEquals(opr.getOperatoer(1001).getCpr(),oprDTO1.getCpr());
			assertEquals(opr.getOperatoer(1002).getCpr(),oprDTO2.getCpr());
			assertEquals(opr.getOperatoer(1003).getCpr(),oprDTO3.getCpr());
			assertEquals(opr.getOperatoer(1004).getCpr(),oprDTO4.getCpr());
			assertEquals(opr.getOperatoer(1005).getCpr(),oprDTO5.getCpr());

			// Test for password
			assertEquals(opr.getOperatoer(1001).getPassword(),oprDTO1.getPassword());
			assertEquals(opr.getOperatoer(1002).getPassword(),oprDTO2.getPassword());
			assertEquals(opr.getOperatoer(1003).getPassword(),oprDTO3.getPassword());
			assertEquals(opr.getOperatoer(1004).getPassword(),oprDTO4.getPassword());
			assertEquals(opr.getOperatoer(1005).getPassword(),oprDTO5.getPassword());


		} catch (DALException e) {
			e.printStackTrace();
		}

		// Test for updating an Operatoer
		OperatoerDTO oprDTO1updated = new OperatoerDTO(1001,"Don Bon","DJ","088800-0220","ihateyou");
		OperatoerDTO oprDTO2updated = new OperatoerDTO(1002,"Doctor Pinata","DB","012300-2000","ilistentorock");
		OperatoerDTO oprDTO3updated = new OperatoerDTO(1003,"Master Windu","MY","020999-2000","forcebewithyoumore");

		try { opr.updateOperatoer(oprDTO1updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO2updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO3updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try {
			// Test for opr ID
			assertEquals(opr.getOperatoer(1001).getOprId(),oprDTO1updated.getOprId());
			assertEquals(opr.getOperatoer(1002).getOprId(),oprDTO2updated.getOprId());
			assertEquals(opr.getOperatoer(1003).getOprId(),oprDTO3updated.getOprId());

			// Test for name
			assertEquals(opr.getOperatoer(1001).getOprNavn(),oprDTO1updated.getOprNavn());
			assertEquals(opr.getOperatoer(1002).getOprNavn(),oprDTO2updated.getOprNavn());
			assertEquals(opr.getOperatoer(1003).getOprNavn(),oprDTO3updated.getOprNavn());

			// Test for CPR
			assertEquals(opr.getOperatoer(1001).getCpr(),oprDTO1updated.getCpr());
			assertEquals(opr.getOperatoer(1002).getCpr(),oprDTO2updated.getCpr());
			assertEquals(opr.getOperatoer(1003).getCpr(),oprDTO3updated.getCpr());

			// Test for password
			assertEquals(opr.getOperatoer(1001).getPassword(),oprDTO1updated.getPassword());
			assertEquals(opr.getOperatoer(1002).getPassword(),oprDTO2updated.getPassword());
			assertEquals(opr.getOperatoer(1003).getPassword(),oprDTO3updated.getPassword());

		} catch (DALException e) {
			e.printStackTrace();
		}
		
		// Deletes the Operatoers
		try { opr.deleteOperatoer(oprDTO1);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO2);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO3);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO4);} 
		catch (DALException e) { e.printStackTrace();}
		try { opr.deleteOperatoer(oprDTO5);} 
		catch (DALException e) { e.printStackTrace();}
		
		
		// Test for deletion
		int test = 0;
		try { assertEquals(opr.getOperatoer(1001), oprDTO1);}  
		catch (DALException e) { test++;}
		try { assertEquals(opr.getOperatoer(1002), oprDTO2);}  
		catch (DALException e) { test++;}
		try { assertEquals(opr.getOperatoer(1003), oprDTO3);}  
		catch (DALException e) { test++;}
		try { assertEquals(opr.getOperatoer(1004), oprDTO4);}  
		catch (DALException e) { test++;}
		try { assertEquals(opr.getOperatoer(1005), oprDTO5);}  
		catch (DALException e) { test++;}
		
		assertEquals(test, 5);
		
	}

}

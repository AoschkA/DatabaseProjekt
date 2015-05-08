package test01917;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import connector01917.Connector;
import daoimpl01917.MySQLOperatoerDAO;
import daoimpl01917.MySQLProduktBatchDAO;
import daoimpl01917.MySQLReceptDAO;
import daointerfaces01917.DALException;
import dto01917.OperatoerDTO;
import dto01917.ProduktBatchDTO;
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
		try {
			opr = new MySQLOperatoerDAO();
		} catch (DALException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		// Creates the operators 
		OperatoerDTO oprDTO1 = new OperatoerDTO(51,"Don Juan","DJ","000000-0220","iloveyou");
		OperatoerDTO oprDTO2 = new OperatoerDTO(52,"Doctor Boon","DB","000000-2000","ilistentopop");
		OperatoerDTO oprDTO3 = new OperatoerDTO(53,"Master Yoda","MY","020090-2000","forcebewithyou");
		OperatoerDTO oprDTO4 = new OperatoerDTO(54,"Louis Van Gaal","LVG","000220-0000","nikepaysmyfun");
		OperatoerDTO oprDTO5 = new OperatoerDTO(55,"Oberst Heinfelt","OH","000000-2090","forhonor");


		// Inserts the operators into the database
		try { opr.updateOperatoer(oprDTO1);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO2);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO3);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO4);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO5);}
		catch (DALException e) { System.out.println(e.getMessage()); }


		// Test for insertion into database
		try {
			// Test for opr ID
			assertEquals(opr.getOperatoer(51).getOprId(),oprDTO1.getOprId());
			assertEquals(opr.getOperatoer(52).getOprId(),oprDTO2.getOprId());
			assertEquals(opr.getOperatoer(53).getOprId(),oprDTO3.getOprId());
			assertEquals(opr.getOperatoer(54).getOprId(),oprDTO4.getOprId());
			assertEquals(opr.getOperatoer(55).getOprId(),oprDTO5.getOprId());

			// Test for name
			assertEquals(opr.getOperatoer(51).getOprNavn(),oprDTO1.getOprNavn());
			assertEquals(opr.getOperatoer(52).getOprNavn(),oprDTO2.getOprNavn());
			assertEquals(opr.getOperatoer(53).getOprNavn(),oprDTO3.getOprNavn());
			assertEquals(opr.getOperatoer(54).getOprNavn(),oprDTO4.getOprNavn());
			assertEquals(opr.getOperatoer(55).getOprNavn(),oprDTO5.getOprNavn());

			// Test for CPR
			assertEquals(opr.getOperatoer(51).getCpr(),oprDTO1.getCpr());
			assertEquals(opr.getOperatoer(52).getCpr(),oprDTO2.getCpr());
			assertEquals(opr.getOperatoer(53).getCpr(),oprDTO3.getCpr());
			assertEquals(opr.getOperatoer(54).getCpr(),oprDTO4.getCpr());
			assertEquals(opr.getOperatoer(55).getCpr(),oprDTO5.getCpr());

			// Test for password
			assertEquals(opr.getOperatoer(51).getPassword(),oprDTO1.getPassword());
			assertEquals(opr.getOperatoer(52).getPassword(),oprDTO2.getPassword());
			assertEquals(opr.getOperatoer(53).getPassword(),oprDTO3.getPassword());
			assertEquals(opr.getOperatoer(54).getPassword(),oprDTO4.getPassword());
			assertEquals(opr.getOperatoer(55).getPassword(),oprDTO5.getPassword());


		} catch (DALException e) {
			e.printStackTrace();
		}

		// Test for updating an Operatoer
		OperatoerDTO oprDTO1updated = new OperatoerDTO(51,"Don Bon","DJ","088800-0220","ihateyou");
		OperatoerDTO oprDTO2updated = new OperatoerDTO(52,"Doctor Pinata","DB","012300-2000","ilistentorock");
		OperatoerDTO oprDTO3updated = new OperatoerDTO(53,"Master Windu","MY","020999-2000","forcebewithyoumore");

		try { opr.updateOperatoer(oprDTO1updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO2updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { opr.updateOperatoer(oprDTO3updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try {
			// Test for opr ID
			assertEquals(opr.getOperatoer(51).getOprId(),oprDTO1updated.getOprId());
			assertEquals(opr.getOperatoer(52).getOprId(),oprDTO2updated.getOprId());
			assertEquals(opr.getOperatoer(53).getOprId(),oprDTO3updated.getOprId());

			// Test for name
			assertEquals(opr.getOperatoer(51).getOprNavn(),oprDTO1updated.getOprNavn());
			assertEquals(opr.getOperatoer(52).getOprNavn(),oprDTO2updated.getOprNavn());
			assertEquals(opr.getOperatoer(53).getOprNavn(),oprDTO3updated.getOprNavn());

			// Test for CPR
			assertEquals(opr.getOperatoer(51).getCpr(),oprDTO1updated.getCpr());
			assertEquals(opr.getOperatoer(52).getCpr(),oprDTO2updated.getCpr());
			assertEquals(opr.getOperatoer(53).getCpr(),oprDTO3updated.getCpr());

			// Test for password
			assertEquals(opr.getOperatoer(51).getPassword(),oprDTO1updated.getPassword());
			assertEquals(opr.getOperatoer(52).getPassword(),oprDTO2updated.getPassword());
			assertEquals(opr.getOperatoer(53).getPassword(),oprDTO3updated.getPassword());

		} catch (DALException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testProduktBatch() {
		try { new Connector(); } 
		catch (InstantiationException e) { e.printStackTrace(); }
		catch (IllegalAccessException e) { e.printStackTrace(); }
		catch (ClassNotFoundException e) { e.printStackTrace(); }
		catch (SQLException e) { e.printStackTrace(); }
		
		MySQLProduktBatchDAO batch = new MySQLProduktBatchDAO();
		
		// Creates a recept
		ReceptDTO recept1 = new ReceptDTO(70, "Skin");
		
		MySQLReceptDAO recepter = new MySQLReceptDAO();
		
		try { recepter.updateRecept(recept1);;}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		
		// Creates the ProduktBatches
		ProduktBatchDTO batch1 = new ProduktBatchDTO(21, recept1.getReceptId(), 1);
		ProduktBatchDTO batch2 = new ProduktBatchDTO(22, recept1.getReceptId(), 0);
		ProduktBatchDTO batch3 = new ProduktBatchDTO(23, recept1.getReceptId(), 0);
		
		// Inserts the batches into the database
		
		
		try { batch.updateProduktBatch(batch1);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { batch.updateProduktBatch(batch2);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { batch.updateProduktBatch(batch3);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		// Test for insertion into database
		try {
			// Test for PbID
			assertEquals(batch.getProduktBatch(21).getPbId(), batch1.getPbId());
			assertEquals(batch.getProduktBatch(22).getPbId(), batch2.getPbId());
			assertEquals(batch.getProduktBatch(23).getPbId(), batch3.getPbId());
			
			// Test for ReceptID
			assertEquals(batch.getProduktBatch(21).getReceptId(), batch1.getReceptId());
			assertEquals(batch.getProduktBatch(22).getReceptId(), batch2.getReceptId());
			assertEquals(batch.getProduktBatch(23).getReceptId(), batch3.getReceptId());
			
			// Test for Status
			assertEquals(batch.getProduktBatch(21).getStatus(), batch1.getStatus());
			assertEquals(batch.getProduktBatch(22).getStatus(), batch2.getStatus());
			assertEquals(batch.getProduktBatch(23).getStatus(), batch3.getStatus());
			
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ProduktBatchDTO batch1updated = new ProduktBatchDTO(21, recept1.getReceptId(), 56);
		ProduktBatchDTO batch2updated = new ProduktBatchDTO(22, recept1.getReceptId(), 2022);
		ProduktBatchDTO batch3updated = new ProduktBatchDTO(23, recept1.getReceptId(), 5020);
		
		try { batch.updateProduktBatch(batch1updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { batch.updateProduktBatch(batch2updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		try { batch.updateProduktBatch(batch3updated);}
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		try {
			// Test for PbID
			assertEquals(batch.getProduktBatch(21).getPbId(), batch1updated.getPbId());
			assertEquals(batch.getProduktBatch(22).getPbId(), batch2updated.getPbId());
			assertEquals(batch.getProduktBatch(23).getPbId(), batch3updated.getPbId());
			
			// Test for ReceptID
			assertEquals(batch.getProduktBatch(21).getReceptId(), batch1updated.getReceptId());
			assertEquals(batch.getProduktBatch(22).getReceptId(), batch2updated.getReceptId());
			assertEquals(batch.getProduktBatch(23).getReceptId(), batch3updated.getReceptId());
			
			// Test for Status
			assertEquals(batch.getProduktBatch(21).getStatus(), batch1updated.getStatus());
			assertEquals(batch.getProduktBatch(22).getStatus(), batch2updated.getStatus());
			assertEquals(batch.getProduktBatch(23).getStatus(), batch3updated.getStatus());
			
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

package test01917;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import connector01917.Connector;
import daoimpl01917.MySQLOperatoerDAO;
import daointerfaces01917.DALException;
import dto01917.OperatoerDTO;

public class JUnit_Testcase {

	@Test
	public void test() {
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
		
		OperatoerDTO oprDTO = new OperatoerDTO(4,"Don Juan","DJ","000000-0000","iloveyou");
		
		try { opr.createOperatoer(oprDTO); }
		catch (DALException e) { System.out.println(e.getMessage()); }
		
		try {
			assertEquals(opr.getOperatoer(4),oprDTO);
		} catch (DALException e) {
			e.printStackTrace();
		}
		
	}

}

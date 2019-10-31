package model;

import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
		
		DAOBase dao = new DAOBase();
		try {
			dao.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() { // macete para não precisar expor a implementação e deixar somente a interface
		return new SellerDaoJDBC(DB.getConnection());
	}
}

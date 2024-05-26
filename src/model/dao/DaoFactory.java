package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() { // macete para não precisar expor a implementação e deixar somente a interface
		return new SellerDaoJDBC();
	}
}

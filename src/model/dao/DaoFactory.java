package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() { // macete para n�o precisar expor a implementa��o e deixar somente a interface
		return new SellerDaoJDBC();
	}
}

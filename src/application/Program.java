package application;

import mode.dao.DaoFactory;
import mode.dao.SellerDao;
import mode.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
	}

}

package application;

import java.util.Date;
import java.util.List;

import mode.dao.DaoFactory;
import mode.dao.SellerDao;
import mode.entities.Department;
import mode.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("--------TEST 1-------------");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("--------TEST 2-------------");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department); 
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("--------TEST 3-------------");
		list = sellerDao.findAll(); 
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("--------TEST 4-------------");
		Seller newseller = new Seller(null, "Victor", "vitinhoBonitao@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newseller);
		System.out.println(newseller.getId());
		
	}

}

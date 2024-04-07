package application;

import java.util.Date;

import mode.entities.Department;
import mode.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		Seller seller = new Seller(21, "Welison", "wjoras1@gmail.com", new Date(), 1300.0, obj);
		
		System.out.println(seller);

	}

}

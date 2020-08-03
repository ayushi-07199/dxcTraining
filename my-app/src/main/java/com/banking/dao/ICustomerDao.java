package com.banking.dao;
import java.util.List;
import com.banking.entities.*;


public interface ICustomerDao {
	
	Customer findById(int id);
	
	List <Customer> findAll();
	
	Customer updateName(int id,String newName);
	
	void add(Customer customer);
	
	Customer Update(Customer customer);
	
	void delete(int id);
	

}

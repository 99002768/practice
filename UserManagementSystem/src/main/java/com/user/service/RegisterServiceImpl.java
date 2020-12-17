package com.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.registerRepo;
import com.user.model.User;

@Service
public class RegisterServiceImpl implements RegisterService{
//	 @Autowired(required=true)
//	  RegisterDAO registerDAO;
	  @Autowired(required=true)
	  registerRepo registerrepo;
	 
	@Transactional
    public void saveData(User user) {
    	System.out.println("reached");
    	registerrepo.save(user);
    }
	
	public void deleteData(User user) {
		registerrepo.delete(user);
	}
	
	public void search(User user) {
		String id=user.getEmailid();
		registerrepo.findById(id);
		
	}
}

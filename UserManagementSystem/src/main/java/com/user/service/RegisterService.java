package com.user.service;

import com.user.model.User;

public interface RegisterService {
	public void saveData(User user);
	public void deleteData(User user);
	public void search(User user);
}

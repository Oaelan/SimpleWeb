package org.hj.service;

import org.hj.mapper.LoginMapper;
import org.hj.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoginServicelmpl implements LoginService {
	@Autowired
	LoginMapper lm;
	
	public UserInfo isLogin(UserInfo user) {
		return lm.isLogin(user);
	}
	
	public UserInfo logOut(UserInfo user) {
		return lm.logOut(user);
	}
}

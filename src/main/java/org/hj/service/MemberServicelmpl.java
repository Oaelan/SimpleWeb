package org.hj.service;

import org.hj.mapper.UserMapper;
import org.hj.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServicelmpl implements MemberService {
	@Autowired
	UserMapper um;
	
	public void  insertUser(UserInfo user) {
		 um.insertUser(user);
	}
	

}

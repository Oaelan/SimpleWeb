package org.hj.service;

import org.hj.model.UserInfo;

public interface LoginService {
	public UserInfo isLogin(UserInfo user);
	public UserInfo logOut(UserInfo user);
}

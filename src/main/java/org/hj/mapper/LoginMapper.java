package org.hj.mapper;

import org.hj.model.UserInfo;

public interface LoginMapper {

	public UserInfo isLogin(UserInfo user);
	public UserInfo logOut(UserInfo user);
}

package main.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.service.UserService;
import main.service.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource(name="userDAO")
	public UserDAO userDAO;
	

	@Override
	public int selectUserCount(UserVO vo) throws Exception {
		return userDAO.selectUserCount(vo);
	}
}

package main.service.Impl;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.service.UserVO;

@Repository("userDAO")
public class UserDAO extends EgovAbstractDAO {

	public int selectUserCount(UserVO vo) {
		return (int) select("userDAO.selectUserCount",vo);
	}


}

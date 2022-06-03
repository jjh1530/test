package main.service;


public interface UserService {

	//로그인 데이터 확인
	public int selectUserCount(UserVO vo) throws Exception;
}

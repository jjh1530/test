package main.service;

import java.util.List;

public interface FranchiseService {

	//프렌차이즈 목록
		public List<?> selectFranchiseList(FranchiseVO vo) throws Exception;
		
		public int selectFranchiseTotal(FranchiseVO vo) throws Exception;
		
		public FranchiseVO selectFranchiseDetail(String shopname) throws Exception;
		
		// 각 지역 통계 
		public int selectFranchiseSeoulTotal(FranchiseVO vo) throws Exception;
		public int selectFranchiseIncheonTotal(FranchiseVO vo) throws Exception;
		public int selectFranchiseGyeongiTotal(FranchiseVO vo) throws Exception;
		public int selectFranchiseBusanTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseGwangjuTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseGangwonTotal(FranchiseVO vo) throws Exception;
		public int selectFranchiseDaejeonTotal(FranchiseVO vo) throws Exception;
		public int selectFranchiseSejongTotal(FranchiseVO vo) throws Exception;
		public int selectFranchiseUlsanTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseDaeguTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseGyeongbukTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseGyeongnamTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseChungbukTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseChungnamTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseJeonbukTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseJeonnamTotal(FranchiseVO vo) throws Exception; 
		public int selectFranchiseJejuTotal(FranchiseVO vo) throws Exception;
		
		//상세화면
		public FranchiseVO selectFranchiseDetail(int fnum) throws Exception;
		

}

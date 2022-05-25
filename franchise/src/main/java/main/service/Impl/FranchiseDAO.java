package main.service.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.service.FranchiseVO;

@Repository("franchiseDAO")
public class FranchiseDAO extends EgovAbstractDAO {

	public List<?> selectFranchiseList(FranchiseVO vo) {
		return list("franchiseDAO.selectFranchiseList",vo);
	}

	public int selectFranchiseTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseTotal",vo);
	}
	
	public FranchiseVO selectFranchiseDetail(int fnum) {
		return  (FranchiseVO) select("franchiseDAO.selectFranchiseDetail",fnum);
	}
	
	//서울부터
	public int selectFranchiseSeoulTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseSeoulTotal",vo);
	}
	
	public int selectFranchiseIncheonTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseIncheonTotal",vo);
	}
	public int selectFranchiseGyeongiTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseGyeongiTotal",vo);
	}
	public int selectFranchiseBusanTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseBusanTotal",vo);
	}
	public int selectFranchiseGwangjuTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseGwangjuTotal",vo);
	}
	public int selectFranchiseGangwonTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseGangwonTotal",vo);
	}


	public int selectFranchiseDaejeonTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseDaejeonTotal",vo);
	}
	public int selectFranchiseSejongTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseSejongTotal",vo);
	}
	

	public int selectFranchiseChungbukTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseChungbukTotal",vo);
	}

	public int selectFranchiseChungnamTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseChungnamTotal",vo);
	}

	public int selectFranchiseDaeguTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseDaeguTotal",vo);
	}


	public int selectFranchiseGyeongbukTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseGyeongbukTotal",vo);
	}

	

	public int selectFranchiseGyeongnamTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseGyeongnamTotal",vo);
	}
	

	public int selectFranchiseJejuTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseJejuTotal",vo);
	}

	public int selectFranchiseJeonbukTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseJeonbukTotal",vo);
	}

	public int selectFranchiseJeonnamTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseJeonnamTotal",vo);
	}


	public int selectFranchiseUlsanTotal(FranchiseVO vo) {
		return (int) select("franchiseDAO.selectFranchiseUlsanTotal",vo);
	}



	

}

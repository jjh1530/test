package main.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.service.FranchiseService;
import main.service.FranchiseVO;

@Service("franchiseService")
public class FranchiseServiceImpl implements FranchiseService {

	@Resource(name="franchiseDAO")
	public FranchiseDAO franchiseDAO;
	
	@Override
	public List<?> selectFranchiseList(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseList(vo);
	}
	
	@Override
	public int selectFranchiseTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseTotal(vo);
	}
	
	@Override
	public FranchiseVO selectFranchiseDetail(String shopname) throws Exception {
		return franchiseDAO.selectFranchiseDetail(shopname);
	}
	
	
	//서울
	@Override
	public int selectFranchiseSeoulTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseSeoulTotal(vo);
	}
	
	//인천
	@Override
	public int selectFranchiseIncheonTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseIncheonTotal(vo);
		
	}
	//경기도
		@Override
		public int selectFranchiseGyeongiTotal(FranchiseVO vo) throws Exception {
			return franchiseDAO.selectFranchiseGyeongiTotal(vo);
		}
		
	//부산
	@Override
	public int selectFranchiseBusanTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseBusanTotal(vo);
	}
	
	//광주
	@Override
	public int selectFranchiseGwangjuTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseGwangjuTotal(vo);
	}
	
	//강원도
	@Override
	public int selectFranchiseGangwonTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseGangwonTotal(vo);
	}
	
	//대전
	@Override
	public int selectFranchiseDaejeonTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseDaejeonTotal(vo);
	}
	
	//세종
	@Override
	public int selectFranchiseSejongTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseSejongTotal(vo);
	}
	//울산
	@Override
	public int selectFranchiseUlsanTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseUlsanTotal(vo);
	}
	
	//대구
	@Override
	public int selectFranchiseDaeguTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseDaeguTotal(vo);
	}
		
	//충북
	@Override
	public int selectFranchiseChungbukTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseChungbukTotal(vo);
	}
	//충남
	@Override
	public int selectFranchiseChungnamTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseChungnamTotal(vo);
	}

	

	//경북
	@Override
	public int selectFranchiseGyeongbukTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseGyeongbukTotal(vo);
	}
	
	//경남
	@Override
	public int selectFranchiseGyeongnamTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseGyeongnamTotal(vo);
	}
	
	//전북
	@Override
	public int selectFranchiseJeonbukTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseJeonbukTotal(vo);
	}
	//전남
	@Override
	public int selectFranchiseJeonnamTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseJeonnamTotal(vo);
	}
	
	//제주
	@Override
	public int selectFranchiseJejuTotal(FranchiseVO vo) throws Exception {
		return franchiseDAO.selectFranchiseJejuTotal(vo);
	}
	
	
	@Override
	public FranchiseVO selectFranchiseDetail(int fnum) throws Exception {
		return franchiseDAO.selectFranchiseDetail(fnum);
	}
}

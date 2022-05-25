package main.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import main.service.FranchiseService;
import main.service.FranchiseVO;

@Controller
public class FranchiseController {

	
	  @Resource(name="franchiseService") private FranchiseService franchiseService;
	  
	  
	  @RequestMapping("/franchiseList.do") public String
	  selectFranchiseList(FranchiseVO vo, ModelMap model) throws Exception {
	 
		  int unit = 2000;
		  
		  int total = franchiseService.selectFranchiseTotal(vo);
		  int totalPage = (int) Math.ceil((double)total/unit);
		  
		  int seoulTotal = franchiseService.selectFranchiseSeoulTotal(vo);
		  int incheonTotal = franchiseService.selectFranchiseIncheonTotal(vo);
		  int gyeonggiTotal = franchiseService.selectFranchiseGyeongiTotal(vo);
		  int busanTotal = franchiseService.selectFranchiseBusanTotal(vo);
		  int gwangjuTotal = franchiseService.selectFranchiseGwangjuTotal(vo);
		  int gangwonTotal = franchiseService.selectFranchiseGangwonTotal(vo);
		  int daejeonTotal = franchiseService.selectFranchiseDaejeonTotal(vo);
		  int sejongTotal = franchiseService.selectFranchiseSejongTotal(vo);
		  int daeguTotal =franchiseService.selectFranchiseDaeguTotal(vo);
		  int ulsanTotal = franchiseService.selectFranchiseUlsanTotal(vo);
		  int gyeongbukTotal = franchiseService.selectFranchiseGyeongbukTotal(vo);
		  int gyeongnamTotal = franchiseService.selectFranchiseGyeongnamTotal(vo);
		  int chungbukTotal = franchiseService.selectFranchiseChungbukTotal(vo);
		  int chungnamTotal = franchiseService.selectFranchiseChungnamTotal(vo);
		  int jeonbukTotal = franchiseService.selectFranchiseJeonbukTotal(vo);
		  int jeonnamTotal = franchiseService.selectFranchiseJeonnamTotal(vo);
		  int jejuTotal = franchiseService.selectFranchiseJejuTotal(vo); 
		  
		  
		  int viewPage = vo.getViewPage();
	
		  if(viewPage > totalPage || viewPage < 0) {
			  viewPage = 1;
		  }
		  
		  
		  int startIndex = (viewPage -1) * unit +1;
		  int endIndex =startIndex + (unit-1);
		  
		  //행처리기능
		  int startRowNo = total - (viewPage-1) * unit;
		  
		  
		  
		 
		  vo.setStartIndex(startIndex);
		  vo.setEndIndex(endIndex);
		  
		  List<?> list = franchiseService.selectFranchiseList(vo);
		  
		  model.addAttribute("seoulTotal" , seoulTotal);
		  model.addAttribute("incheonTotal" , incheonTotal);
		  model.addAttribute("gyeonggiTotal" , gyeonggiTotal);
		  model.addAttribute("busanTotal" , busanTotal);
		  model.addAttribute("gwangjuTotal" , gwangjuTotal);
		  model.addAttribute("gangwonTotal" , gangwonTotal);
		  model.addAttribute("daejeonTotal" , daejeonTotal);
		  model.addAttribute("sejongTotal" , sejongTotal);
		  model.addAttribute("ulsanTotal" , ulsanTotal);
		  model.addAttribute("daeguTotal" , daeguTotal);
		  model.addAttribute("gyeongbukTotal" , gyeongbukTotal);
		  model.addAttribute("gyeongnamTotal" , gyeongnamTotal);
		  model.addAttribute("chungbukTotal" , chungbukTotal);
		  model.addAttribute("chungnamTotal" , chungnamTotal);
		  model.addAttribute("jeonbukTotal" , jeonbukTotal);
		  model.addAttribute("jeonnamTotal" , jeonnamTotal);
		  model.addAttribute("jejuTotal" , jejuTotal);
	
			 
		  
		  
		  model.addAttribute("rowNumber",startRowNo);
		  model.addAttribute("total", total);
		  model.addAttribute("totalPage", totalPage);
		  model.addAttribute("franchiseList", list);
		  
		  return "franchise/franchiseList"; 
		  }
	  
		
		  @RequestMapping("/franchiseDetail.do") 
		  public String selectFranchiseDetail(FranchiseVO vo, ModelMap model) throws Exception {
		  
			  FranchiseVO franchiseVO =franchiseService.selectFranchiseDetail(vo.getFnum());
			  
			  
			  model.addAttribute("detailList",franchiseVO);
			 
			  return "franchise/franchiseDetail"; 
		  }
		 
}

package main.web;



import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import main.service.UserService;
import main.service.UserVO;

@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	
	
	@RequestMapping("/franchiseLogin.do")
	public String franchiseLogin() {

		return "franchise/franchiseLogin";
	}
	
	@RequestMapping("/franchiseLoginSub.do")
	@ResponseBody
	  public String loginProcecssing(UserVO vo, HttpSession session) throws Exception {
		  
		String message ="";
		int count = userService.selectUserCount(vo);

		if (count == 1) {
			// 세션 생성
			session.setMaxInactiveInterval(10);
			session.setAttribute("seesionUserID", vo.getUserid());
			// 메시지 처리
			message = "ok";
		}
	
	  return message;
	  }

}

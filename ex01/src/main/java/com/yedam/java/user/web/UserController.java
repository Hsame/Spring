package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {
	//뷰페이지를 호출할때 이 방법을 많이 씀
	@RequestMapping(value="inputForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String inputForm() {
		return "inputForm";
	}
	
	@RequestMapping("/users")
//	public String process(UserVO userVO) {
//		System.out.println(userVO.getName());
//		System.out.println(userVO.getAge());
//	public String process(@RequestParam String name, @RequestParam int age) {
//	System.out.println(name + ", " + age);
	public String process(@RequestParam Map<String, Object> map) {
		System.out.println(map.get("name") + "," + map.get("age"));
		return "";
	}
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for(String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName() +  "," + vo.getAge());
		}
		return "";
	}

	
}

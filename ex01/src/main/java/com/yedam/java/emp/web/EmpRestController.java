package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@RestController
@CrossOrigin(origins = "http://192.168.0.83")
public class EmpRestController {
	
	@Autowired
	EmpService service;
	
	//전체조회
	@GetMapping("/emp")
	public List<EmpVO> empSelect() {
		return service.getEmpList();
	}
	
	//사원조회
	@GetMapping("/emp/{employeeId}")
	public EmpVO empFind(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.getEmp(empVO);
	}
	
	//사원등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmp(empVO);
		return empVO;
	}
	
	//사원수정
	@PutMapping("/emp/{employeeId}") //경로에 접근하려는 사원정보, body에 수정하려는 정보 
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO) {
		empVO.setEmployeeId(employeeId);
		service.updateEmp(empVO);
		return empVO;
	}
	
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		return empVO;
	}
 }

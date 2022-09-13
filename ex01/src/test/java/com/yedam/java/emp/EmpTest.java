package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {

	@Autowired
	EmpMapper empMapper;
	
	
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}
	@Test
	public void empInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("114");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}
	
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("김수와두자");
		info.setLastName("와리슝슝");
		info.setEmail("durumi@tongsin.com");
		info.setJobId("IT_PROG");
		info.setSalary("100000");
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(), "207");
	}
	public void empUpdatesalaryTest() {
		int result = empMapper.updateEmp(149);
		assertEquals(result, 1);
	}
	
	public void empUpdateNameTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("이");
		info.setEmail("asdf@asdf.com");
		info.setEmployeeId("114");
		empMapper.updateName(info);
		assertEquals(info.getEmployeeId(), "114");
	}
	
	public void empUpdateInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("207");
		info.setFirstName("길동");
		info.setEmail("kedw@google.com");
		int result = empMapper.updateEmpInfo(info);
		assertEquals(result, 1);
		
	}
	
}

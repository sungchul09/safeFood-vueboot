package com.ssafy.edu.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.edu.vue.dao.SSAFyDaoImpl;
import com.ssafy.edu.vue.dto.CommentDto;
import com.ssafy.edu.vue.dto.DepCountDto;
import com.ssafy.edu.vue.dto.DepartmentDto;
import com.ssafy.edu.vue.dto.EmployeeDto;
import com.ssafy.edu.vue.dto.FlagDto;
import com.ssafy.edu.vue.dto.FoodDto;
import com.ssafy.edu.vue.dto.NoticeDto;
import com.ssafy.edu.vue.dto.QnADto;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
    @Autowired
	private SSAFyDaoImpl employeeDao;

    @Override
	@Transactional(readOnly=true)
	public List<EmployeeDto> findAllEmployees() throws Exception {
		return employeeDao.findAllEmployees();
	}
    
    @Override
	@Transactional(readOnly=true)
	public int getEmployeesTotal() throws Exception {
		return employeeDao.getEmployeesTotal();
	}

    @Override
	@Transactional(readOnly=true)
	public List<EmployeeDto> findLikeEmployees(String name) throws Exception {
    	return employeeDao.findLikeEmployees(name);
	}

	@Override
	@Transactional
	public int addEmployee(EmployeeDto emp) throws Exception {
		//나중에 auto로 바꾸기
		emp.setId(employeeDao.findAfterAdd()+1);
		employeeDao.addEmployee(emp);
		return employeeDao.findAfterAdd();
	}

	@Override
	@Transactional(readOnly=true)
	public List<DepartmentDto> findAllDepartments() throws Exception {
		return employeeDao.findAllDepartments();
	}

	@Override
	@Transactional(readOnly=true)
	public List<EmployeeDto> findAllTitles() throws Exception {
		return employeeDao.findAllTitles();
	}

	@Override
	@Transactional(readOnly=true)
	public EmployeeDto findEmployeeById(int id) throws Exception {
		return employeeDao.findEmployeeById(id);
	}

	@Override
	@Transactional
	public boolean updateEmployee(EmployeeDto emp) throws Exception {
		return employeeDao.updateEmployee(emp);
	}

	@Override
	@Transactional
	public boolean deleteEmployee(int id) throws Exception {
		return employeeDao.deleteEmployee(id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<DepCountDto> findAllDepCounts() throws Exception {
		return employeeDao.findAllDepCounts();
	}

	@Override
	@Transactional(readOnly=true)
	public List<EmployeeDto> findEmployeesByManagerId(int managerId) throws Exception {
		return employeeDao.findEmployeesByManagerId(managerId);
	}

	@Override
	@Transactional(readOnly=true)
	public List<EmployeeDto> findDepartmentsBydeptid(int dept_id) throws Exception {
		return employeeDao.findDepartmentsBydeptid(dept_id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<EmployeeDto> findDepartmentsByname(String name) throws Exception {
		return employeeDao.findDepartmentsByname(name);
	}

	@Override
	@Transactional(readOnly=true)
	public List<FlagDto> findAllFlags() throws Exception {
		return employeeDao.findAllFlags();
	}

	@Override
	@Transactional(readOnly=true)
	public FlagDto findFlagsByCode(int code) throws Exception {
		return employeeDao.findFlagsByCode(code);
	}

	@Override
	@Transactional(readOnly=true)
	public List<QnADto> getQnAByWriter(String writer) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getQnAByWriter(writer);
	}

	@Override
	@Transactional(readOnly=true)
	public List<QnADto> getQnATotal() throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getQnATotal();
	}

	@Override
	public boolean updateQnA(QnADto qna) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.updateQnA(qna);
	}

	@Override
	public boolean deleteQnA(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.deleteQnA(isbn);
	}

	@Override
	public void addQnA(QnADto qna) throws Exception {
		// TODO Auto-generated method stub
		employeeDao.addQnA(qna);
		
	}

	@Override
	public QnADto getQnADetail(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getQnADetail(isbn);
	}

	@Override
	public List<NoticeDto> getNoticeTotal() throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getNoticeTotal();
	}

	@Override
	public boolean updateNotice(NoticeDto qna) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.updateNotice(qna);
	}

	@Override
	public boolean deleteNotice(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.deleteNotice(isbn);
	}

	@Override
	public void addNotice(NoticeDto qna) throws Exception {
		// TODO Auto-generated method stub
		employeeDao.addNotice(qna);
	}

	@Override
	public NoticeDto getNoticeDetail(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getNoticeDetail(isbn);
	}

	@Override
	public boolean updateViews(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.updateViews(isbn);
	}

	@Override
	public boolean updateQnAViews(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.updateQnAViews(isbn);
	}

	@Override
	public List<CommentDto> getCommentDetail(int qnaisbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getCommentDetail(qnaisbn);
	}

	@Override
	public boolean deleteComment(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.deleteComment(isbn);
	}

	@Override
	public void addComment(CommentDto qna) throws Exception {
		// TODO Auto-generated method stub
		employeeDao.addComment(qna);
	}

	@Override
	public List<FoodDto> getFoodDetail(String name) throws Exception {
		// TODO Auto-generated method stub
		return employeeDao.getFoodDetail(name);
	}
	
}

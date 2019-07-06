package com.ssafy.edu.vue.service;

import java.util.List;

import com.ssafy.edu.vue.dto.CommentDto;
import com.ssafy.edu.vue.dto.DepCountDto;
import com.ssafy.edu.vue.dto.DepartmentDto;
import com.ssafy.edu.vue.dto.EmployeeDto;
import com.ssafy.edu.vue.dto.FlagDto;
import com.ssafy.edu.vue.dto.FoodDto;
import com.ssafy.edu.vue.dto.NoticeDto;
import com.ssafy.edu.vue.dto.QnADto;

public interface EmployeeService {
	
	public List<EmployeeDto> findAllEmployees() throws Exception;
	public EmployeeDto findEmployeeById(int id) throws Exception;
	public int getEmployeesTotal()throws Exception;
	public List<EmployeeDto> findLikeEmployees(String name) throws Exception;
	
	public int addEmployee(EmployeeDto emp) throws Exception;
	public List<DepartmentDto> findAllDepartments() throws Exception;
	public List<EmployeeDto> findAllTitles() throws Exception;
	
	public boolean updateEmployee(EmployeeDto emp) throws Exception;
	public boolean deleteEmployee(int id) throws Exception;
	
	public List<DepCountDto> findAllDepCounts()throws Exception;
	public List<EmployeeDto>  findEmployeesByManagerId(int managerId)throws Exception;
	
	public List<EmployeeDto> findDepartmentsBydeptid(int dept_id)throws Exception;
	public List<EmployeeDto> findDepartmentsByname(String name)throws Exception;
	
	public List<FlagDto> findAllFlags() throws Exception;
	public FlagDto findFlagsByCode(int code) throws Exception;
	
	public List<QnADto> getQnAByWriter(String writer)throws Exception;
	public List<QnADto> getQnATotal()throws Exception;
	public boolean updateQnA(QnADto qna) throws Exception;
	public boolean deleteQnA(int isbn) throws Exception;
	public void addQnA(QnADto qna) throws Exception;
	public QnADto getQnADetail(int isbn) throws Exception;
	public boolean updateQnAViews(int isbn) throws Exception;
	
	public List<NoticeDto> getNoticeTotal()throws Exception;
	public NoticeDto getNoticeDetail(int isbn) throws Exception;
	public boolean updateNotice(NoticeDto qna) throws Exception;
	public boolean deleteNotice(int isbn) throws Exception;
	public void addNotice(NoticeDto qna) throws Exception;
	public boolean updateViews(int isbn) throws Exception;
	
	public List<CommentDto> getCommentDetail(int qnaisbn)throws Exception;
	public boolean deleteComment(int isbn) throws Exception;
	public void addComment(CommentDto qna) throws Exception;
	
	public List<FoodDto> getFoodDetail(String name)throws Exception;

}

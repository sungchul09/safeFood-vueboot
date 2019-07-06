package com.ssafy.edu.vue.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.CommentDto;
import com.ssafy.edu.vue.dto.DepCountDto;
import com.ssafy.edu.vue.dto.DepartmentDto;
import com.ssafy.edu.vue.dto.EmployeeDto;
import com.ssafy.edu.vue.dto.FlagDto;
import com.ssafy.edu.vue.dto.FoodDto;
import com.ssafy.edu.vue.dto.NoticeDto;
import com.ssafy.edu.vue.dto.QnADto;
@Repository
public class SSAFyDaoImpl implements HrmMapper{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<EmployeeDto> findAllEmployees() throws Exception {
		return sqlSession.selectList(ns+"findAllEmployees");
	}
	
	@Override
	public int getEmployeesTotal() throws Exception{
		return sqlSession.selectOne(ns+"getEmployeesTotal");
	}

	@Override
	public List<EmployeeDto> findLikeEmployees(String name) throws Exception {
		return sqlSession.selectList(ns+"findLikeEmployees",name);
	}

	@Override
	public void addEmployee(EmployeeDto emp) throws Exception {
		sqlSession.insert(ns+"addEmployee",emp);
	}

	@Override
	public List<DepartmentDto> findAllDepartments() throws Exception {
		return sqlSession.selectList(ns+"findAllDepartments");
	}

	@Override
	public int findAfterAdd() throws Exception{
		return sqlSession.selectOne(ns+"findAfterAdd");
	}

	@Override
	public List<EmployeeDto> findAllTitles() throws Exception {
		return sqlSession.selectList(ns+"findAllTitles");
	}

	@Override
	public EmployeeDto findEmployeeById(int id) throws Exception {
		return sqlSession.selectOne(ns+"findEmployeeById",id);
	}

	@Override
	public boolean updateEmployee(EmployeeDto emp) throws Exception {
		 sqlSession.update(ns+"updateEmployee",emp);
		 return true;
	}

	@Override
	public boolean deleteEmployee(int id) throws Exception {
		sqlSession.delete(ns+"deleteEmployee",id);
		 return true;
	}

	@Override
	public List<DepCountDto> findAllDepCounts() throws Exception {
		return sqlSession.selectList(ns+"findAllDepCounts");
	}

	@Override
	public List<EmployeeDto> findEmployeesByManagerId(int managerId) throws Exception {
		return sqlSession.selectList(ns+"findEmployeesByManagerId",managerId);
	}

	@Override
	public List<EmployeeDto> findDepartmentsBydeptid(int dept_id) throws Exception {
		return sqlSession.selectList(ns+"findDepartmentsBydeptid",dept_id);
	}

	@Override
	public List<EmployeeDto> findDepartmentsByname(String name) throws Exception {
		return sqlSession.selectList(ns+"findDepartmentsByname",name);
	}

	@Override
	public List<FlagDto> findAllFlags() throws Exception {
		return sqlSession.selectList(ns+"findAllFlags");
	}

	@Override
	public FlagDto findFlagsByCode(int code) throws Exception {
		return sqlSession.selectOne(ns+"findFlagsByCode", code);
	}

	@Override
	public List<QnADto> getQnAByWriter(String writer) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getQnAByWriter", writer);
	}

	@Override
	public List<QnADto> getQnATotal() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getQnATotal");
	}

	@Override
	public boolean updateQnA(QnADto qna) throws Exception {
		sqlSession.update(ns+"updateQnA",qna);
		 return true;
	}

	@Override
	public boolean deleteQnA(int isbn) throws Exception {
		sqlSession.delete(ns+"deleteQnA",isbn);
		 return true;
	}

	@Override
	public void addQnA(QnADto qna) throws Exception {
		sqlSession.insert(ns+"addQnA",qna);
		
	}

	@Override
	public QnADto getQnADetail(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"getQnADetail", isbn);
	}

	@Override
	public NoticeDto getNoticeDetail(int isbn) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"getNoticeDetail", isbn);
	}

	@Override
	public List<NoticeDto> getNoticeTotal() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getNoticeTotal");
	}

	@Override
	public boolean updateNotice(NoticeDto qna) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(ns+"updateNotice",qna);
		 return true;
	}

	@Override
	public boolean deleteNotice(int isbn) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(ns+"deleteNotice",isbn);
		 return true;
	}

	@Override
	public void addNotice(NoticeDto qna) throws Exception {
		sqlSession.insert(ns+"addNotice",qna);
		
	}

	@Override
	public boolean updateViews(int isbn) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(ns+"updateViews",isbn);
		return true;
	}

	@Override
	public boolean updateQnAViews(int isbn) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(ns+"updateQnAViews",isbn);
		return true;
	}

	@Override
	public List<CommentDto> getCommentDetail(int qnaisbn) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getCommentDetail",qnaisbn);
	}

	@Override
	public boolean deleteComment(int isbn) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(ns+"deleteComment",isbn);
		 return true;
	}

	@Override
	public void addComment(CommentDto qna) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(ns+"addComment",qna);
		
	}

	@Override
	public List<FoodDto> getFoodDetail(String name) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"getFoodDetail", name);
	}
	
}

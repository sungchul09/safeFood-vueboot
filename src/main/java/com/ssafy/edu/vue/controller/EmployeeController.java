package com.ssafy.edu.vue.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.edu.vue.dto.CommentDto;
import com.ssafy.edu.vue.dto.DepCountDto;
import com.ssafy.edu.vue.dto.DepartmentDto;
import com.ssafy.edu.vue.dto.EmployeeDto;
import com.ssafy.edu.vue.dto.FlagDto;
import com.ssafy.edu.vue.dto.FoodDto;
import com.ssafy.edu.vue.dto.NoticeDto;
import com.ssafy.edu.vue.dto.QnADto;
import com.ssafy.edu.vue.help.BoolResult;
import com.ssafy.edu.vue.help.NumberResult;
import com.ssafy.edu.vue.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/humans/swagger-ui.html
@CrossOrigin(origins = {"*"}, maxAge = 6000)  // CrossOrigin이 없으면 화면단에서 jsonp로 받아야 된다.(브라우져에서 서버로 정보가 붙지않는다.)
@RestController
@RequestMapping("/api")
@Api(value="SSAFY", description="SSAFY Resouces Management 2019")
public class EmployeeController {
	
	public static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService  employeeService; 


   
    @ApiOperation(value = "모든 QnA의 정보를 반환한다.", response = List.class)
   	@RequestMapping(value = "/getQnATotal", method = RequestMethod.GET)
   	public ResponseEntity<List<QnADto>> getQnATotal() throws Exception {
   		logger.info("1-------------getQnATotal-----------------------------"+new Date());
   		List<QnADto> emps = employeeService.getQnATotal();
   		if (emps.isEmpty()) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<List<QnADto>>(emps, HttpStatus.OK);
   	}
    
    @ApiOperation(value = "모든 공지사항글의 정보를 반환한다.", response = List.class)
   	@RequestMapping(value = "/getNoticeTotal", method = RequestMethod.GET)
   	public ResponseEntity<List<NoticeDto>> getNoticeTotal() throws Exception {
   		logger.info("1-------------getNoticeTotal-----------------------------"+new Date());
   		List<NoticeDto> emps = employeeService.getNoticeTotal();
   		if (emps.isEmpty()) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<List<NoticeDto>>(emps, HttpStatus.OK);
   	}
    
   
    
    @ApiOperation(value = "해당 사용자가 쓴 QnA글을 반환한다.", response = List.class)
 	@RequestMapping(value = "/getQnAByWriter/{writer}", method = RequestMethod.GET)
 	public ResponseEntity<List<QnADto>> getQnAByWriter(@PathVariable String writer) throws Exception {
 		logger.info("3-------------getQnAByWriter-----------------------------"+new Date());
 		List<QnADto> emps = employeeService.getQnAByWriter(writer);
 		if (emps.isEmpty()) {
 			return new ResponseEntity(HttpStatus.NO_CONTENT);
 		}
 		return new ResponseEntity<List<QnADto>>(emps, HttpStatus.OK);
 	}
    
    @ApiOperation(value = "해당 QnA글 정보를 반환한다.", response = List.class)
 	@RequestMapping(value = "/getQnADetail/{isbn}", method = RequestMethod.GET)
 	public ResponseEntity<QnADto> getQnADetail(@PathVariable int isbn) throws Exception {
 		logger.info("3-------------getQnAByWriter-----------------------------"+new Date());
 		QnADto emps = employeeService.getQnADetail(isbn);
 		if (emps==null) {
 			return new ResponseEntity(HttpStatus.NO_CONTENT);
 		}
 		return new ResponseEntity<QnADto>(emps, HttpStatus.OK);
 	}
    
    @ApiOperation(value = "자동완성 정보를 반환한다.", response = List.class)
 	@RequestMapping(value = "/getFoodDetail/{food}", method = RequestMethod.GET)
 	public ResponseEntity<List<FoodDto>> getFoodDetail(@PathVariable String food) throws Exception {
 		logger.info("3-------------getFoodDetail-----------------------------"+new Date());
 		List<FoodDto> emps = employeeService.getFoodDetail(food);
 		if (emps==null) {
 			return new ResponseEntity(HttpStatus.NO_CONTENT);
 		}
 		return new ResponseEntity<List<FoodDto>>(emps, HttpStatus.OK);
 	}
    
    @ApiOperation(value = "해당 게시글 정보를 반환한다.", response = List.class)
   	@RequestMapping(value = "/getNoticeDetail/{isbn}", method = RequestMethod.GET)
   	public ResponseEntity<NoticeDto> getNoticeDetail(@PathVariable int isbn) throws Exception {
   		logger.info("3-------------getNoticeDetail-----------------------------"+new Date());
   		NoticeDto emps = employeeService.getNoticeDetail(isbn);
   		if (emps==null) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<NoticeDto>(emps, HttpStatus.OK);
   	}
    
    @ApiOperation(value = "해당 게시글 댓글 정보를 반환한다.", response = List.class)
   	@RequestMapping(value = "/getCommentDetail/{isbn}", method = RequestMethod.GET)
   	public ResponseEntity<List<CommentDto>> getCommentDetail(@PathVariable int isbn) throws Exception {
   		logger.info("3-------------getCommentDetail-----------------------------"+new Date());
   		List<CommentDto> emps = employeeService.getCommentDetail(isbn);
   		if (emps==null) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<List<CommentDto>>(emps, HttpStatus.OK);
   	}
  
    @ApiOperation(value = " 새로운 QnA 글을 입력한다.", response = NumberResult.class)
   	@RequestMapping(value = "/addQnA", method = RequestMethod.POST)
   	public ResponseEntity<QnADto> addQnA(@RequestBody QnADto dto) throws Exception {
   		logger.info("5-------------addQnA-----------------------------"+new Date());
   		logger.info("5-------------addQnA-----------------------------"+dto);
   		employeeService.addQnA(dto);

   		return new ResponseEntity(HttpStatus.NO_CONTENT);
   	}
    
    @ApiOperation(value = " 새로운 Notice 글을 입력한다.", response = NumberResult.class)
   	@RequestMapping(value = "/addNotice", method = RequestMethod.POST)
   	public ResponseEntity<NoticeDto> addNotice(@RequestBody NoticeDto dto) throws Exception {
   		logger.info("5-------------addNotice-----------------------------"+new Date());
   		logger.info("5-------------addNotice-----------------------------"+dto);
   		employeeService.addNotice(dto);

   		return new ResponseEntity(HttpStatus.NO_CONTENT);
   	}
    
    @ApiOperation(value = " 새로운 Comment 글을 입력한다.", response = NumberResult.class)
   	@RequestMapping(value = "/addComment", method = RequestMethod.POST)
   	public ResponseEntity<CommentDto> addComment(@RequestBody CommentDto dto) throws Exception {
   		logger.info("5-------------addComment-----------------------------"+new Date());
   		logger.info("5-------------addComment-----------------------------"+dto);
   		employeeService.addComment(dto);

   		return new ResponseEntity(HttpStatus.NO_CONTENT);
   	}


   
    @ApiOperation(value = " QnA 게시글을 수정한다.", response = BoolResult.class)
   	@RequestMapping(value = "/updateQnA", method = RequestMethod.POST)
   	public ResponseEntity<BoolResult> updateQnA(@RequestBody QnADto dto) throws Exception {
   		logger.info("1-------------updateQnA-----------------------------"+new Date());
   		logger.info("1-------------updateQnA-----------------------------"+dto);
   		boolean total = employeeService.updateQnA(dto);
   		BoolResult nr=new BoolResult();
   		nr.setCount(total);
   		nr.setName("updateQnA");
   		nr.setState("succ");
   		if (!total) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
   	}
    
    @ApiOperation(value = " Notice 게시글을 수정한다.", response = BoolResult.class)
   	@RequestMapping(value = "/updateNotice", method = RequestMethod.POST)
   	public ResponseEntity<BoolResult> updateNotice(@RequestBody NoticeDto dto) throws Exception {
   		logger.info("1-------------updateNotice-----------------------------"+new Date());
   		logger.info("1-------------updateNotice-----------------------------"+dto);
   		boolean total = employeeService.updateNotice(dto);
   		BoolResult nr=new BoolResult();
   		nr.setCount(total);
   		nr.setName("updateNotice");
   		nr.setState("succ");
   		if (!total) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
   	}
    
    @ApiOperation(value = " Notice 조회수를 증가시킨다.", response = BoolResult.class)
   	@RequestMapping(value = "/updateViews/{isbn}", method = RequestMethod.POST)
   	public ResponseEntity<BoolResult> updateViews(@PathVariable int isbn) throws Exception {
   		logger.info("1-------------updateViews-----------------------------"+new Date());
   		logger.info("1-------------updateViews-----------------------------"+isbn);
   		boolean total = employeeService.updateViews(isbn);
   		BoolResult nr=new BoolResult();
   		nr.setCount(total);
   		nr.setName("updateViews");
   		nr.setState("succ");
   		if (!total) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
   	}
    
    @ApiOperation(value = " QnA 조회수를 증가시킨다.", response = BoolResult.class)
   	@RequestMapping(value = "/updateQnAViews/{isbn}", method = RequestMethod.POST)
   	public ResponseEntity<BoolResult> updateQnAViews(@PathVariable int isbn) throws Exception {
   		logger.info("1------------- updateQnAViews-----------------------------"+new Date());
   		logger.info("1------------- updateQnAViews-----------------------------"+isbn);
   		boolean total = employeeService.updateQnAViews(isbn);
   		BoolResult nr=new BoolResult();
   		nr.setCount(total);
   		nr.setName("updateQnAViews");
   		nr.setState("succ");
   		if (!total) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
   	}
    
    
    
    
    @ApiOperation(value = " QnA를 삭제한다", response = BoolResult.class)
	@RequestMapping(value = "/deleteQnA/{isbn}", method = RequestMethod.POST)
	public ResponseEntity<BoolResult> deleteQnA(@PathVariable int isbn) throws Exception {
		logger.info("1-------------deleteQnA-----------------------------"+new Date());
		logger.info("1-------------deleteQnA-----------------------------"+isbn);
		
		boolean total = employeeService.deleteQnA(isbn);
		BoolResult nr=new BoolResult();
		nr.setCount(total);
		nr.setName("deleteEmployee");
		nr.setState("succ");
		if (!total) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}
    
    @ApiOperation(value = " Notice를 삭제한다", response = BoolResult.class)
   	@RequestMapping(value = "/deleteNotice/{isbn}", method = RequestMethod.POST)
   	public ResponseEntity<BoolResult> deleteNotice(@PathVariable int isbn) throws Exception {
   		logger.info("1-------------deleteNotice-----------------------------"+new Date());
   		logger.info("1-------------deleteNotice-----------------------------"+isbn);
   		
   		boolean total = employeeService.deleteNotice(isbn);
   		BoolResult nr=new BoolResult();
   		nr.setCount(total);
   		nr.setName("deleteNotice");
   		nr.setState("succ");
   		if (!total) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
   	}
    

    @ApiOperation(value = " Comment를 삭제한다", response = BoolResult.class)
   	@RequestMapping(value = "/deleteComment/{isbn}", method = RequestMethod.POST)
   	public ResponseEntity<BoolResult> deleteComment(@PathVariable int isbn) throws Exception {
   		logger.info("1-------------deleteComment-----------------------------"+new Date());
   		logger.info("1-------------deleteComment-----------------------------"+isbn);
   		
   		boolean total = employeeService.deleteComment(isbn);
   		BoolResult nr=new BoolResult();
   		nr.setCount(total);
   		nr.setName("deleteComment");
   		nr.setState("succ");
   		if (!total) {
   			return new ResponseEntity(HttpStatus.NO_CONTENT);
   		}
   		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
   	}
       
    
   
}

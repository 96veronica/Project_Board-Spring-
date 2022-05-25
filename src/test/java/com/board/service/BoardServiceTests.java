package com.board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardServiceTests {

	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	
    @Autowired
    private BoardService service;
    
    // 게시판 등록 테스트
    /*
    @Test
    public void testEnroll() {
        
        BoardVO vo = new BoardVO();
        
        vo.setTitle("service test");
        vo.setContent("service test");
        vo.setWriter("service test");
        
        service.enroll(vo);
        
    }
    */
    
    
    /* 게시판 목록 테스트 */
    /*
    @Test
    public void testGetList() {
        
        service.getList().forEach(board -> log.info("" + board));        
        
    }
    */
    
    
    //게시판 조회
    /*
    @Test
    public void testGETPage() {
        
        int bno = 2;
        
        log.info("" + service.getPage(bno));
        
    }
    */
    
    
    /* 게시판 수정 */
    @Test
    public void testModify() {
        
        BoardVO board = new BoardVO();
        board.setBno(2);
        board.setTitle("팔도 비빔면보다는 삼양 열무비빔면이지");
        board.setContent("수정 내용");
        
        int result = service.modify(board);
        log.info("result : " +result);
        
    }     
    
}

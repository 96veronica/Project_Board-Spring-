package com.board.mapper;

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
public class BoardMapperTests {

    private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
    
    @Autowired
    private BoardMapper mapper;

    /*
    @Test
    public void testEnroll() {
        
        BoardVO vo = new BoardVO();
        
        vo.setTitle("mapper test");
        vo.setContent("mapper test");
        vo.setWriter("mapper test");
        
        mapper.enroll(vo);
        
    }
    */
    
    
    /* 게시판 목록 테스트 */
    /*
    @Test
    public void testGetList() {
        
        
        List list = mapper.getList();
        
       // 향상된 for문
        for(Object a : list) {
            log.info("" + a);
     
    	}
    }
    */
    
    
    /* 게시판 조회 */
    /*
    @Test
   	public void testGetPage() {
       
       int bno = 2;
       
       log.info("" + mapper.getPage(bno));
       
   	}  
	*/

    
    /* 게시판 수정 */
    @Test
    public void testModify() {
        
    BoardVO board = new BoardVO();
    board.setBno(2);
    board.setTitle("팔도 비빔면");
    board.setContent("여름에는 팔도 비빔면이야");
    
    int result = mapper.modify(board);
    log.info("result : " +result);
    
    }
    
    
}
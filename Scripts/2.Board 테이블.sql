-- 게시판 테이블 생성
create table Project_Board(
	    bno 			int 				auto_increment,
	    title 			varchar(150),
	    content 		varchar(2000),
	    writer 			varchar(50),
	    regdate 		timestamp 			default now(),
   		updatedate 		timestamp 			default now(),
	   	constraint pk_board PRIMARY key(bno)
);


-- 테이블 제거
drop table Project_Board;

-- 테이블 조회
select * from Project_Board;
select * from Project_Board where bno = 2;
desc Project_Board;


-- insert문
insert into Project_Board(title, content, writer) values ('테스트 제목', '테스트 내용', '작가');
insert into Project_Board(title, content, writer) values ('테스트 제목', '테스트 내용', '작가');
insert into Project_Board(title, content, writer) values ('테스트 제목', '테스트 내용', '작가');
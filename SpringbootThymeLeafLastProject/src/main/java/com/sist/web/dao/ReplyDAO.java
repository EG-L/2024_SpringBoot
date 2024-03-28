package com.sist.web.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;
import com.sist.web.entity.Reply;

public interface ReplyDAO extends JpaRepository<Reply, Integer>{
	//데이터 읽기
	@Query(value = "SELECT * FROM reply "
			+ "WHERE fno=:fno "
			+ "ORDER BY fno DESC",nativeQuery = true)
	public List<Reply> replyListData(@Param("fno") int fno);
}

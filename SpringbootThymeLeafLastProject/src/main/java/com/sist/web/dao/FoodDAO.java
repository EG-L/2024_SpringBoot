package com.sist.web.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sist.web.entity.FoodEntity;
import com.sist.web.entity.FoodListVO;

import java.util.*;


public interface FoodDAO extends JpaRepository<FoodEntity,Integer>{
	@Query(value = "SELECT fno,name,poster "
			+ "FROM food_house ORDER BY fno "
			+ "LIMIT :start,20",nativeQuery = true)
	public List<FoodListVO> foodListData(@Param("start") int start);
	
	@Query(value = "SELECT CEIL(COUNT(*)/20.0) FROM food_house",nativeQuery = true)
	public int foodTotalPage();
	
	public FoodEntity findByfno(int fno);
}

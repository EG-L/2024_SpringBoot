package com.sist.web.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.sist.web.entity.FoodEntity;

import jakarta.persistence.Entity;

import java.util.*;

public interface FoodService extends JpaRepository<FoodEntity, Integer>{
	@Query(value = "SELECT * FROM food_house "
			+ "ORDER BY fno ASC LIMIT :start,12",nativeQuery = true)
	public List<FoodEntity> foodListData(@Param("start") int start);
	
	@Query(value = "SELECT CEIL(COUNT(*)/12.0) FROM food_house",nativeQuery = true)
	public int foodTotalPage();
	
	//상세보기 SELECT * FROM food_house
	//      SELECT * FROM food_house WHERE name=? AND address=?
	//                                findByNameANDAddress
	//      WHERE name LIKE => findByNameLike
	//객체지향 매핑 ==> ORM => 자바 표준 ORM 
	public FoodEntity findByFno(int fno);
}

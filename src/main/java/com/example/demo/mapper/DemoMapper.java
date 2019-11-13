package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.Match;
import com.example.demo.pojo.Result;

@Mapper
public interface DemoMapper {
	@Select("select name,id from t_match")
	List<Match> getMatch();
	
	@Select("select * from t_record where t_match =#{id}")
	List<Result> getResult(Integer id);
	
	
}

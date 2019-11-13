package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.pojo.Result;

@Service
public class DemoService {
	@Autowired
	DemoMapper demoMapper;

//	public List<Result> getResult(Integer id) {
//		if (demoMapper.getResult(id) == null) {
//			return "还没收录";
//		}
//		return null;
//	}
}
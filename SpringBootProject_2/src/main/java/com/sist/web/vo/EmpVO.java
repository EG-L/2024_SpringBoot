package com.sist.web.vo;

import lombok.Data;
import java.util.*;

@Data
public class EmpVO {
	private int empno,sal,comm,deptno,mgr;
	private String ename,job;
	private Date hiredate;
	
}

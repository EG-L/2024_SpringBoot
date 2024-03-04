package com.sist.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class Emp {
	@Id
	private int empno;
	private String ename,job,hiredate;
	private int mgr,sal;
	@Column(insertable=false,updatable = false)
	private int deptno;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="deptno",referencedColumnName = "deptno")
	private Dept dept;
}

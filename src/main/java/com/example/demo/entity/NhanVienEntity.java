package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity {

		@Id //primary key
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@Column
		private String hoten;
		
		@Column
		private Date ngaysinh;
}

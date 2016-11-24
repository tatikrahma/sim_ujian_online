package com.kvn.ujianonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Soal {
	@Id
	@GeneratedValue
	private Long idSoal;
	
	@Lob
	private String soal;
	
	@Column
	private int pilihanA;
	
	@Column
	private int pilihanB;
	
	@Column
	private int pilihanC;
	
	@Column
	private int pilihanD;
	
	@Column
	private int pilihanE;
	
	
	
//	public Soal(String soal, String pilihanA, String pilihanB, String pilihanC, 
//			String pilihanD, String pilihanE) {
//		this.soal = soal;
//		this.pilihanA = pilihanA;
//		this.pilihanB = pilihanB;
//		this.pilihanC = pilihanC;
//		this.pilihanD = pilihanD;
//		this.pilihanE = pilihanE;
//	}
//	public int getIdSoal() {
//		return idSoal;
//	}
//	public void setIdSoal(int idSoal) {
//		this.idSoal = idSoal;
//	}
//	public String getSoal() {
//		return soal;
//	}
//	public void setSoal(String soal) {
//		this.soal = soal;
//	}
//	public String getPilihanA() {
//		return pilihanA;
//	}
//	public void setPilihanA(String pilihanA) {
//		this.pilihanA = pilihanA;
//	}
//	public String getPilihanB() {
//		return pilihanB;
//	}
//	public void setPilihanB(String pilihanB) {
//		this.pilihanB = pilihanB;
//	}
//	public String getPilihanC() {
//		return pilihanC;
//	}
//	public void setPilihanC(String pilihanC) {
//		this.pilihanC = pilihanC;
//	}
//	public String getPilihanD() {
//		return pilihanD;
//	}
//	public void setPilihanD(String pilihanD) {
//		this.pilihanD = pilihanD;
//	}
//	public String getPilihanE() {
//		return pilihanE;
//	}
//	public void setPilihanE(String pilihanE) {
//		this.pilihanE = pilihanE;
//	}
}
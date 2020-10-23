package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_scheme")
public class Scheme {
	
	@Id
	@Column(name = "scheme_uid")
	long schemeUId;
	
	@Column(name = "scheme_name")
	String schemeName;
	
	@Column(name = "scheme_ministry")
	String schemeMinistry;
	
	@Column(name = "scheme_course_level")
	String schemeCourseLevel;
	
	@Column(name = "scheme_10ec")
	int scheme10EC;
	
	@Column(name = "scheme_12ec")
	int scheme12EC;
	
	@Column(name = "scheme_caste")
	String schemeCaste;
	
	@Column(name = "scheme_age")
	String schemeAge;
	
	@Column(name = "scheme_gender")
	String schemeGender;
	
	@Column(name = "scheme_family_income")
	double schemeFamilyIncome;
	
	@Column(name = "scheme_disabled")
	boolean schemeDisabled;
	
	@Column(name = "scheme_amount")
	long schemeAmount;
	
	@Column(name = "scheme_status")
	boolean schemeStatus;
	
	public long getSchemeUId() {
		return schemeUId;
	}
	public void setSchemeUId(long schemeUId) {
		this.schemeUId = schemeUId;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getSchemeMinistry() {
		return schemeMinistry;
	}
	public void setSchemeMinistry(String schemeMinistry) {
		this.schemeMinistry = schemeMinistry;
	}
	public String getSchemeCourseLevel() {
		return schemeCourseLevel;
	}
	public void setSchemeCourseLevel(String schemeCourseLevel) {
		this.schemeCourseLevel = schemeCourseLevel;
	}
	public int getScheme10EC() {
		return scheme10EC;
	}
	public void setScheme10EC(int scheme10ec) {
		scheme10EC = scheme10ec;
	}
	public int getScheme12EC() {
		return scheme12EC;
	}
	public void setScheme12EC(int scheme12ec) {
		scheme12EC = scheme12ec;
	}
	public String getSchemeCaste() {
		return schemeCaste;
	}
	public void setSchemeCaste(String schemeCaste) {
		this.schemeCaste = schemeCaste;
	}
	public String getSchemeAge() {
		return schemeAge;
	}
	public void setSchemeAge(String schemeAge) {
		this.schemeAge = schemeAge;
	}
	public String getSchemeGender() {
		return schemeGender;
	}
	public void setSchemeGender(String schemeGender) {
		this.schemeGender = schemeGender;
	}
	public double getSchemeFamilyIncome() {
		return schemeFamilyIncome;
	}
	public void setSchemeFamilyIncome(double schemeFamilyIncome) {
		this.schemeFamilyIncome = schemeFamilyIncome;
	}
	public boolean isSchemeDisabled() {
		return schemeDisabled;
	}
	public void setSchemeDisabled(boolean schemeDisabled) {
		this.schemeDisabled = schemeDisabled;
	}
	public long getSchemeAmount() {
		return schemeAmount;
	}
	public void setSchemeAmount(long schemeAmount) {
		this.schemeAmount = schemeAmount;
	}
	public boolean isSchemeStatus() {
		return schemeStatus;
	}
	public void setSchemeStatus(boolean schemeStatus) {
		this.schemeStatus = schemeStatus;
	}
	
	
}

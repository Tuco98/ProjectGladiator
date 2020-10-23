package com.lti.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_institutes")
public class Institute {
	
	@Id
	@SequenceGenerator(name = "insSeq", initialValue = 5001, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "insSeq")
	@Column(name="institute_id")
	long instituteId;
	
	@Column(name="institute_code")
	String instituteCode;
	
	@Column(name="institute_disecode")
	String instituteDiseCode;
	
	@Column(name="institute_name")
	String instituteName;
	
	@Column(name="institute_category")
	String instituteCategory;
	
	@Column(name="institute_state")
	String instituteState;
	
	@Column(name="institute_district")
	String instituteDistrict;
	
	@Column(name="institute_location")
	String instituteLocation;
	
	@Column(name="institute_type")
	String instituteType;
	
	@Column(name="institute_university_state")
	String instituteUniversityState;
	
	@Column(name="institute_university_name")
	String instituteUniversityName;
	
	@Column(name="institute_admission_year")
	String instituteAdmissionYear;
	
	@Column(name="institute_password")
	String institutePassword;
	
	@Column(name="institute_address")
	String instituteAddress;
	
	@Column(name="institute_principal_name")
	String institutePrincipalNmae;
	
	@Column(name="institute_phone_number")
	String institutePhoneNumber;
	
	@Column(name="institute_email")
	String instituteEmail;
	
	@Column(name = "institute_status")
	boolean instituteStatus=false;
	
	@OneToMany(mappedBy="institute")
	List<Student> students;
	
	public long getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(long instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteCode() {
		return instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}
	public String getInstituteDiseCode() {
		return instituteDiseCode;
	}
	public void setInstituteDiseCode(String instituteDiseCode) {
		this.instituteDiseCode = instituteDiseCode;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteCategory() {
		return instituteCategory;
	}
	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}
	public String getInstituteState() {
		return instituteState;
	}
	public void setInstituteState(String instituteState) {
		this.instituteState = instituteState;
	}
	public String getInstituteDistrict() {
		return instituteDistrict;
	}
	public void setInstituteDistrict(String instituteDistrict) {
		this.instituteDistrict = instituteDistrict;
	}
	public String getInstituteLocation() {
		return instituteLocation;
	}
	public void setInstituteLocation(String instituteLocation) {
		this.instituteLocation = instituteLocation;
	}
	public String getInstituteType() {
		return instituteType;
	}
	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
	}
	public String getInstituteUniversityState() {
		return instituteUniversityState;
	}
	public void setInstituteUniversityState(String instituteUniversityState) {
		this.instituteUniversityState = instituteUniversityState;
	}
	public String getInstituteUniversityName() {
		return instituteUniversityName;
	}
	public void setInstituteUniversityName(String instituteUniversityName) {
		this.instituteUniversityName = instituteUniversityName;
	}
	public String getInstituteAdmissionYear() {
		return instituteAdmissionYear;
	}
	public void setInstituteAdmissionYear(String instituteAdmissionYear) {
		this.instituteAdmissionYear = instituteAdmissionYear;
	}
	public String getInstitutePassword() {
		return institutePassword;
	}
	public void setInstitutePassword(String institutePassword) {
		this.institutePassword = institutePassword;
	}
	public String getInstituteAddress() {
		return instituteAddress;
	}
	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}
	public String getInstitutePrincipalNmae() {
		return institutePrincipalNmae;
	}
	public void setInstitutePrincipalNmae(String institutePrincipalNmae) {
		this.institutePrincipalNmae = institutePrincipalNmae;
	}
	
	public String getInstitutePhoneNumber() {
		return institutePhoneNumber;
	}
	public void setInstitutePhoneNumber(String institutePhoneNumber) {
		this.institutePhoneNumber = institutePhoneNumber;
	}
	public String getInstituteEmail() {
		return instituteEmail;
	}
	public void setInstituteEmail(String instituteEmail) {
		this.instituteEmail = instituteEmail;
	}
	public boolean isInstituteStatus() {
		return instituteStatus;
	}
	public void setInstituteStatus(boolean instituteStatus) {
		this.instituteStatus = instituteStatus;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
/*Institute_ID "PK", long
Institue_DISEcode,	String
Institute_Name,	String
Institute_category, String
Institute_State, String
Institute_District,	String
Institute_Location, String
Institute_type, String
Institute_AffUniState, String
Institue_AffUniName, String
Institute_AdmissionYear, String
Institute_Password, String
Institute_RegCerti<file>,
Institute_AffCerti<file>,
Institue_Address, String
Institute_principalName, String
Institute_Number, String
Institute_Email, String
Institute_Status boolean*/
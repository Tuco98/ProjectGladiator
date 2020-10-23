package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.junit.Test;

import com.lti.dao.NspDao;
import com.lti.model.Institute;
import com.lti.model.Scheme;
import com.lti.model.Student;

public class NspTest {

	NspDao nspDao = new NspDao();

	@Test
	public void addAScheme() {
		Scheme scheme = new Scheme();
		scheme.setSchemeName("Pragati Scholarship");
		scheme.setSchemeMinistry("MHRD");
		scheme.setSchemeCourseLevel("Graduation");
		scheme.setScheme10EC(60);
		scheme.setScheme12EC(65);
		scheme.setSchemeCaste("SC");
		scheme.setSchemeAge(18);
		scheme.setSchemeGender("Female");
		scheme.setSchemeFamilyIncome(500000);
		scheme.setSchemeForDisabled(false);
		scheme.setSchemeAmount(50000);
		scheme.setSchemeStatus(true);
		nspDao.addAScheme(scheme);

	}

	@Test
	public void addAnInstitute() {
		Institute institute = new Institute();
		institute.setInstituteCode("100");
		institute.setInstituteDiseCode("1");
		institute.setInstituteName("ABC Institute of Technology");
		institute.setInstituteCategory("A");
		institute.setInstituteState("Maharashtra");
		institute.setInstituteDistrict("Mumbai");
		institute.setInstituteLocation("Mumbai");
		institute.setInstituteType("Public");
		institute.setInstituteUniversityState("Delhi");
		institute.setInstituteUniversityName("AICTE");
		institute.setInstituteAdmissionYear("1970");
		institute.setInstitutePassword("abc@123");
		institute.setInstituteAddress("Mumbai, Maharashtra");
		institute.setInstitutePrincipalNmae("Dr. John Mathews");
		institute.setInstitutePhoneNumber("1234567895");
		institute.setInstituteEmail("abctech@gmail.com");

		nspDao.registerAnInstitute(institute);

	}

	@Test
	public void addAStudent() {
		Student student = new Student();
		student.setStudentAadharNumber(123456123);
		student.setStudentName("James");
		student.setStudentGender("Male");
		student.setStudentDateOfBirth(LocalDate.of(1998, 10, 15));
		student.setStudentMobileNumber("9456123780");
		student.setStudentEmail("james@gmail.com");
		student.setStudentStateOfDomicile("Goa");
		student.setStudentDistrict("Panaji");
		student.setStudentBankName("HDFC");
		student.setStudenBankAccountNumber("11111");
		student.setStudentIfcsCode("16005");
		student.setStudentPassword("james123");
		student.setStudentStatus("true");
		
		
		 

	}
}

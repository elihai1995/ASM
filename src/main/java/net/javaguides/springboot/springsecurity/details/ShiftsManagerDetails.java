package net.javaguides.springboot.springsecurity.details;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class ShiftsManagerDetails {
	private static String managerFullName = "Avraham Moshe";
	private static String managerEmail = "Avraham.Moshe@asm.com";
	private static String managerPhoneNumber = "0501110522";
	
	@ModelAttribute("shiftsManagerName")
	public static String getManagerFullName() {
		return managerFullName;
	}
	public static void setManagerFullName(String managerFullName) {
		ShiftsManagerDetails.managerFullName = managerFullName;
	}
	
	@ModelAttribute("shiftsManagerEmail")
	public static String getManagerEmail() {
		return managerEmail;
	}
	public static void setManagerEmail(String managerEmail) {
		ShiftsManagerDetails.managerEmail = managerEmail;
	}
	
	@ModelAttribute("shiftsManagerPhone")
	public static String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}
	public static void setManagerPhoneNumber(String managerPhoneNumber) {
		ShiftsManagerDetails.managerPhoneNumber = managerPhoneNumber;
	}
	
	
}

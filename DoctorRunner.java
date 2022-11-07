package com.xworkz.dharsh;

public class DoctorRunner {
public static void main(String[] args) {
	Doctor doctor=new Dentist(); // inheritance
	
	System.out.println("doctor dentist aythavne");
	System.out.println(doctor.doctorGF);
	System.out.println(doctor.name);
	System.out.println("doctor dentist agoda");
	
	
	Dentist doctor2=(Dentist)doctor; //casting
	
	System.out.println("dr  casting maadi surgery maadake ola banda");
	System.out.println(doctor2.dentistGF);
	System.out.println(doctor2.dentName);
	System.out.println(doctor2.doctorGF);
	System.out.println(doctor2.name);
	System.out.println("dr casting mugsi surgery successs dr hora hoda ");
	
	
	
Doctor doctor3=new ENT(); // inheritance
	
	System.out.println("doctor ENT course odake bartavne");
	System.out.println(doctor3.doctorGF);
	System.out.println(doctor3.name);
	System.out.println("doctor ENT exam copy odadu pass aagoda");
	
	
	ENT doctor4=(ENT)doctor3; //casting
	
	System.out.println("dr  kivi ,moogu check maadake ola banda");
	System.out.println(doctor4.entDocName);
	System.out.println(doctor4.ENTDocGF);
	System.out.println(doctor4.doctorGF);
	System.out.println(doctor4.name);
	System.out.println("dr casting mugsi check maadi honta ");
	
Doctor doctor5=new Cardiologist(); // inheritance
	
	System.out.println("doctor Cardiologist odake bartavne");
	System.out.println(doctor3.doctorGF);
	System.out.println(doctor3.name);
	System.out.println("doctor Cardiologist exam copy odadu pass aagoda");
	
	
	Cardiologist doctor6=(Cardiologist)doctor5; //casting
	
	System.out.println("dr  check maadake ola banda");
	System.out.println(doctor6.cardiologistName);
	System.out.println(doctor6.cardiologistGf);
	System.out.println(doctor6.doctorGF);
	System.out.println(doctor6.name);
	System.out.println("dr casting mugsi check maadi honta ");
	
	
	
	
	
	
	
}
}

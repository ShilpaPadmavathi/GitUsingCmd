package com.ntt.collectionpractice;

public class Patient {
	String patientName;
	String doctorName;
	double fee;
	public Patient( String patientName, String doctorName, double fee) {
		super();
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Patient  patientName=" + patientName + ", doctorName=" + doctorName
				+ ", fee=" + fee + "]";
	}
	
	

}

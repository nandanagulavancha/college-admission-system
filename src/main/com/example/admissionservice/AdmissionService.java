package com.example.admissionservice;

public class AdmissionService {

    private int requiredMinimumMarks;

    public AdmissionService(int requiredMinimumMarks) {
        this.requiredMinimumMarks = requiredMinimumMarks;
    }

    public boolean isEligible(String applicantName, int qualifyingMarks) {
        System.out.println("Checking eligibility for " + applicantName + " with marks: " + qualifyingMarks);
        return qualifyingMarks >= requiredMinimumMarks;
    }

    public String generateEligibilityStatus(String applicantName, int qualifyingMarks) {
        if (isEligible(applicantName, qualifyingMarks)) {
            return applicantName + " is eligible for admission.";
        } else {
            return applicantName + " is not eligible for admission as they scored below the required minimum marks.";
        }
    }
}
// src/test/java/com/example/admissionservice/AdmissionServiceTest.java
package com.example.admissionservice;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdmissionServiceTest {

    private AdmissionService admissionService = new AdmissionService(60); // Required minimum marks = 60

    @Test
    public void testEligibleApplicant() {
        assertTrue(admissionService.isEligible("Alice", 75));
    }

    @Test
    public void testIneligibleApplicantBelowMinimum() {
        assertFalse(admissionService.isEligible("Bob", 55));
    }

    @Test
    public void testEligibleApplicantAtMinimum() {
        assertTrue(admissionService.isEligible("Charlie", 60));
    }

    @Test
    public void testGenerateEligibilityStatusEligible() {
        assertEquals("Alice is eligible for admission.", admissionService.generateEligibilityStatus("Alice", 80));
    }

    @Test
    public void testGenerateEligibilityStatusIneligible() {
        assertEquals("Bob is not eligible for admission as they scored below the required minimum marks.",
                admissionService.generateEligibilityStatus("Bob", 45));
    }
}
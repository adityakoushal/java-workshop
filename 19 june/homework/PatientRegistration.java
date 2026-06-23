class PatientRegistration {
    String patient, disease;

    { System.out.println("Patient Registration Started"); }

    PatientRegistration() { this("Unknown", "General Checkup"); }
    PatientRegistration(String patient) { this(patient, "General Checkup"); }

    PatientRegistration(String patient, String disease) {
        this.patient = patient;
        this.disease = disease;
        System.out.println("Patient: " + patient);
        System.out.println("Disease: " + disease);
    }
}
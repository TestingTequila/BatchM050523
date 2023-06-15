package OOPS_Interface;

public class FortisHospital extends  HospitalOrganization implements USMedicalAssociation, UKMedicalAssociation, IndiaMedicalAssociation {


    @Override
    public void cardioService() {
        System.out.println("FH- cardioService");
    }

    @Override
    public void neuroService() {
        System.out.println("FH- neuroService");
    }

    @Override
    public void physioService() {
        System.out.println("FH- physioService");
    }

    //Common Service from all Medical Associations
    @Override
    public void emergencyService() {
        System.out.println("FH- emergencyService");
    }

    @Override
    public void entService() {
        System.out.println("FH-entService");
    }

    @Override
    public void dentalService() {
        System.out.println("FH-dentalService");
    }

    @Override
    public void oncologyService() {
        System.out.println("FH-oncologyService");
    }

    @Override
    public void orthoService() {
        System.out.println("FH-orthoService");
    }

    @Override
    public void gynicService() {
        System.out.println("FH-gynicService");
    }


    // Individual Services offered by Fortis Hospital
    public void medicalTrainingService()
    {
        System.out.println("FH-medicalTrainingService");
    }

    public void healthInsuranceService()
    {
        System.out.println("FH-healthInsuranceService");
    }

    @Override
    public void covidVaccinationService() {
        System.out.println("FH-covidVaccinationService");
    }
}

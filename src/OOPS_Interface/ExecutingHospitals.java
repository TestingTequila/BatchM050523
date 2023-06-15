package OOPS_Interface;

public class ExecutingHospitals {

    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.cardioService();
        fh.cardioService();
        fh.dentalService();
        fh.entService();
        fh.neuroService();
        fh.physioService();
        fh.orthoService();
        fh.oncologyService();

        System.out.println("================USMedicalAssociation===================");
        USMedicalAssociation usma = new FortisHospital();
        usma.cardioService();
        usma.neuroService();
        usma.physioService();

        System.out.println("================UKMedicalAssociation===================");
        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entService();
        ukma.dentalService();
        System.out.println("================IndiaMedicalAssociation===================");

        IndiaMedicalAssociation ima = new FortisHospital();
        ima.oncologyService();
        ima.gynicService();
        ima.orthoService();

        HospitalOrganization ho = new FortisHospital();
        ho.medicalRND();
        ho.medicalNews();

        WHO who = new FortisHospital();
        who.covidVaccinationService();
    }
}

package classconcepts;

public class ExecutingCompany {

    public static void main(String[] args) {

        // NameOfTheClassWhoseObjectYouWantTOCreate nameOfObject = new NameOfTheClassWhoseObjectYouWantTOCreate();
        Company obj1 = new Company();
        obj1.name = "IBM"; // 6 Byte
        obj1.empCount = 4500; //4 byte
        obj1.hq = "NY";//4 byte
        obj1.IsCompanyPublic = false;// 1 bit


        Company obj2 = new Company();
        obj2.name = "Google"; //12 Byte
        obj2.empCount = 6000; //4 Byte
        obj2.hq = "NJ";// 2 Byte
        obj2.IsCompanyPublic = true; //1 bit


        Company obj3 = new Company();
        obj3.name = "Twitter";
        obj3.empCount = 2500;
        obj3.hq = "Houston";
        obj3.IsCompanyPublic = false;

//        System.out.println(obj1.name + " | " + obj1.empCount + " | " + obj1.hq + " | " + obj1.IsCompanyPublic);
//        System.out.println(obj2.name + " | " + obj2.empCount + " | " + obj2.hq + " | " + obj2.IsCompanyPublic);
//        System.out.println(obj3.name + " | " + obj3.empCount + " | " + obj3.hq + " | " + obj3.IsCompanyPublic);

        obj1 = obj2;

//        System.out.println(obj1.name + " | " + obj1.empCount + " | " + obj1.hq + " | " + obj1.IsCompanyPublic);
//        System.out.println(obj2.name + " | " + obj2.empCount + " | " + obj2.hq + " | " + obj2.IsCompanyPublic);
//        System.out.println(obj3.name + " | " + obj3.empCount + " | " + obj3.hq + " | " + obj3.IsCompanyPublic);

        obj2 = obj3;

        System.out.println(obj1.name + " | " + obj1.empCount + " | " + obj1.hq + " | " + obj1.IsCompanyPublic);// Google
        System.out.println(obj2.name + " | " + obj2.empCount + " | " + obj2.hq + " | " + obj2.IsCompanyPublic); // Twitter
        System.out.println(obj3.name + " | " + obj3.empCount + " | " + obj3.hq + " | " + obj3.IsCompanyPublic); // Twitter


        //===============================================================

//
//        new Company().name = "Meta";
//        new Company().empCount = 10000;
//        new Company().hq = "NJ";
//        new Company().IsCompanyPublic = true;
//        System.gc();

    }
}

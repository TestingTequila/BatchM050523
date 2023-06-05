package classconcepts;

public class ExecutingResume {

    public static void main(String[] args) {
        // How to create object of any class
            // NameOfTheClassWhoseObjectYouWantTOCreate nameOfObject = new NameOfTheClassWhoseObjectYouWantTOCreate();
               Resume asadResume = new Resume(); // Entire RHS is your Object
               asadResume.firstName="Asad";
               asadResume.lastName="Shahid";
               asadResume.isMarried=false;
               asadResume.salary=12000;
               asadResume.emailId="asad.shahid@gmail.com";
               asadResume.ContactNumber=21312;

        System.out.println(asadResume.firstName + "|| " + asadResume.lastName + " || " + asadResume.isMarried + " ||" + asadResume.salary);


         Resume sanaResume = new Resume();
         sanaResume.firstName="Sanaa";
         sanaResume.lastName="Ali";
         sanaResume.isMarried=true;
         sanaResume.salary=14000;
         sanaResume.emailId="sana@gmailcom";
         sanaResume.ContactNumber=45345;


        // NameOfTheClassWhoseObjectYouWantTOCreate nameOfObject = new NameOfTheClassWhoseObjectYouWantTOCreate();



    }
}

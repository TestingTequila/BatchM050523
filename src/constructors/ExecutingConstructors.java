package constructors;

public class ExecutingConstructors {

    public static void main(String[] args) {

        //POST
        LearningConstructors jason = new LearningConstructors("jason.roger@janbask.com", "test@1234");
        LearningConstructors asad = new LearningConstructors("asad.asr@janbask.com", "test@12345");

        LearningConstructors lc = new LearningConstructors(12,4);
        lc.addition();
        LearningConstructors.myCompany="IBM";


        LearningConstructors lc1 = new LearningConstructors("ashish@janbask.com", "test@123456", 122, 8);

    }

}

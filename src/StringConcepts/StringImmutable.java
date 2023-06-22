package StringConcepts;

public class StringImmutable {

    public static void main(String[] args) {
        String s = "Selenium";

        System.out.println(s + "automation");

        System.out.println(s);

        s = "Cypress";

        System.out.println(s);

        String t1 = "Selenium";
        System.out.println(t1);

        String p = "Ashish";
        p = p + "Janbask Classes";

        System.out.println(p);

        String t2 = "Ashish";
        System.out.println(t2);

        String r = "   hello selenium  ";
        r = r.trim();
        System.out.println(r);
        r = r.replace(" ", "");
        System.out.println(r);

    }


}

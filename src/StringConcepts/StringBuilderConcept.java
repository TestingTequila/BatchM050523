package StringConcepts;

public class StringBuilderConcept {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Selenium");
        sb.append("testing");
        System.out.println(sb);

        String s1 = "Selenium";
        s1.concat("testing");
        System.out.println(s1);
    }
}

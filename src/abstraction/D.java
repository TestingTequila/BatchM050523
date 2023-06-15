package abstraction;

public class D extends A{
    @Override
    public void addition(int a, int b) {
        System.out.println(a*a + b*b*b);
    }
}

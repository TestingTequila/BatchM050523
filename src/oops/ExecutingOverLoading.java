package oops;

public class ExecutingOverLoading {

    public static void main(String[] args) {
        MethodOverloadingConcepts moc = new MethodOverloadingConcepts();
        moc.addition(12, 4);
        moc.addition(12, 4, 4);
        moc.addition(12.34, 45.67);
    }
}

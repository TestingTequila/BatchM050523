package Intrface;

public class Excel implements  Microsoft{


    @Override
    public void File() {
        System.out.println("Excel - File");
    }

    @Override
    public void Home() {
        System.out.println("Excel - Home");
    }

    @Override
    public void Insert() {
        System.out.println("Excel - Insert");
    }

    @Override
    public void Draw() {
        System.out.println("Excel - Draw");
    }
}

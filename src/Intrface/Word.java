package Intrface;

public class Word implements  Microsoft{
    @Override
    public void File() {
        System.out.println("Word - File");
    }

    @Override
    public void Home() {
        System.out.println("Word - Home");
    }

    @Override
    public void Insert() {
        System.out.println("Word - Insert");
    }

    @Override
    public void Draw() {
        System.out.println("Word - Draw");
    }
}

package abstractFactoryPattern;

public interface Color {
    void fill();
}

class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red color");
    }
}

class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with green color");
    }
}
package RUCafe;

public class Donut extends MenuItem implements Customizable{

    public double itemPrice(){
        return 0;
    }

    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }
}

public class cat extends animal {
    cat(String name){
        super(name,200,0,2);
    }
    @Override
    public boolean swim(double distance) {
        return false;
    }
}

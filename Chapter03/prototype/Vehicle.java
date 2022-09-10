abstract class Vehicle implements Cloneable{
    protected final String type;
    

    Vehicle(String t){
        this.type = t;
    }

    abstract void move();

    @Override
    protected Object clone() {
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            System.err.println("""
                    error: %s""".formatted(e));
        }
        return clone;
    } 
}

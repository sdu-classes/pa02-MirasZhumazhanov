public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return String.format("Square[%s]",super.toString());
    }

}

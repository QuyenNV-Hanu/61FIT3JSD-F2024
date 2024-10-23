package jsd.metaprogramming.exercises.tanks;

public class Point2D {
    private int x;
    private int y;
    public Point2D(int x, int y) throws Exception {

        // TODO: Catch exceptions (validations)
        if (!isValidValue(x) || !isValidValue(y)){
            throw new Exception("Invalid value x and y!");
        }
        this.x = x;
        this.y = y;
    }
    public boolean isValidValue(int value){
        return value >= 0;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(){
        this.y = y;
    }
    // TODO: Getters and Setters
}

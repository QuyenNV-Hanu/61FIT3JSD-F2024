package jsd.metaprogramming.exercises.tanks;

public class Main {
    public static void main(String[] args) {
        try {
            Tank basicTank01 = new BasicTank(new Point2D(3, 5));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.err.println("Error occurred while creating the tank: " +e.getMessage())
;            e.printStackTrace();
        }

    }
}

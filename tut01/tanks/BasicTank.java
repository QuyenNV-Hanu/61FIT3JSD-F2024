package tut01.tanks;

public class BasicTank extends EnemyTank {
	private Directions direction;
	public BasicTank(Point2D position) throws Exception {
		super("Basic Tank", position, 100, 1, 1, 1, "Desc");
		this.direction = Directions.DOWN;
	}
	// TODO: Getters, Setters, toString,...

}

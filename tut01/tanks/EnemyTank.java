package tut01.tanks;

public class EnemyTank extends Tank{
	private String name;
	private Point2D position;
	private Directions direction;
	private int point;
	private int health;
	private int movementSpeed;
	private int bulletSpeed;
	private String description;
	public EnemyTank(String name, Point2D position, int point, int health, int movementSpeed, int bulletSpeed,
			String description) throws Exception {
		super(name, position, point, health, movementSpeed, bulletSpeed, description);
	}
	// TODO Getters & Setters
	// TODO toString
}

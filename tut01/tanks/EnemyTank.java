package tut01.tanks;

public class EnemyTank extends Tank{
	public String name;
	public Point2D position;
	public Directions direction;
	public int point;
	public int health;
	public int movementSpeed;
	public int bulletSpeed;
	public String description;
	public EnemyTank(String name, Point2D position, int point, int health, int movementSpeed, int bulletSpeed,
			String description) throws Exception {
		super(name, position, point, health, movementSpeed, bulletSpeed, description);
	}
	// TODO Getters & Setters
	// TODO toString
}

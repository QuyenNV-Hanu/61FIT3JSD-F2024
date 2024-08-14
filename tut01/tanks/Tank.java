package tut01.tanks;

public abstract class Tank extends TankFunction {
	private String name;
	private Point2D position;
	private Directions direction;
	private int point;
	private int health;
	private int movementSpeed;
	private int bulletSpeed;
	private String description;
	public Tank(String name, Point2D position, int point, int health, int movementSpeed, int bulletSpeed,
			String description) throws Exception {
		if(!isValidName(name)) {
			throw new Exception("Invalid tank name!");
		}
		if(!isValidPosition(position)) {
			throw new Exception("Invalid tank position!");
		}
		// TODO: add validation
		this.name = name;
		this.position = position;
		this.direction = Directions.UP;
		this.point = point;
		this.health = health;
		this.movementSpeed = movementSpeed;
		this.bulletSpeed = bulletSpeed;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMovementSpeed() {
		return movementSpeed;
	}

	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	public int getBulletSpeed() {
		return bulletSpeed;
	}

	public void setBulletSpeed(int bulletSpeed) {
		this.bulletSpeed = bulletSpeed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private boolean isValidPosition(Point2D position2) {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean isValidName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Tank [name=" + name + ", position=" + position + ", point=" + point + ", health=" + health
				+ ", movementSpeed=" + movementSpeed + ", bulletSpeed=" + bulletSpeed + ", description=" + description
				+ "]";
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot(Tank tank) {
		// TODO Auto-generated method stub
		
	}
	
	
}

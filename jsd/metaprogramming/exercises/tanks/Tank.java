package jsd.metaprogramming.exercises.tanks;

public abstract class Tank extends TankFunction {
    public String name;
    public Point2D position;
    public Directions direction;
    public int point;
    public int health;
    public int movementSpeed;
    public int bulletSpeed;
    public int life;
    public String description;
    public int bullet;
    public Tank(String name, Point2D position, int point, int health, int movementSpeed, int bulletSpeed,
                String description) throws Exception {
        if(!isValidName(name)) {
            throw new Exception("Invalid tank name!");
        }
        if(!isValidPosition(position)) {
            throw new Exception("Invalid tank position!");
        }
        // TODO: add validation

        if(!isValidPoint(point)){
            throw new Exception("Invalid point value!");
        }
        if(!isValidHealth(health)){
            throw new Exception("Invalid health value!");
        }
        if (!isValidMovementSpeed(movementSpeed)) {
            throw new Exception("Invalid movement speed value!");
        }
        if(!isValidBulletSpeed(bulletSpeed)){
            throw new Exception("Invalid bullet speed value!");
        }

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

    public int getLife(){
        return life;
    }

    public void setLife(int life){
        this.life = life;
    }

    public int getBullet(){
        return bullet;
    }

    public void setBullet(int bullet){
        this.bullet = bullet;
    }

    public boolean isValidPosition(Point2D position2) {
        // TODO Auto-generated method stub
        int minX = 1;
        int maxX = 100;
        int minY = 1;
        int maxY = 100;

        if(position2 == null){
            return false;
        }
        if(position2.getX() < minX || position2.getX() > maxX || position2.getY() < minY || position2.getY() > maxY){
            return false;
        }
        return true;
    }
    public boolean isValidName(String name) {
        if(name == null){
            return false;
        }
        if(name.trim().isEmpty()){
            return false;
        }
        int minLength = 1;
        int maxLength = 30;
        if(name.length() < minLength || name.length() > maxLength){
            return false;
        }
        if(!name.matches("[a-zA-Z0-9]+")){
            return false;
        }
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isValidPoint(int point){
        return point >= 0;
    }
    public boolean isValidHealth(int health){
        if(health <= 0 || health > 4){
            return false;
        }
        return true;
    }
    public boolean isValidMovementSpeed(int movementSpeed){
        if(movementSpeed <= 0 || movementSpeed > 3){
            return false;
        }
        return true;
    }
    public boolean isValidBulletSpeed(int bulletSpeed){
        if(bulletSpeed <= 0 || bulletSpeed > 3){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tank [name=" + name + ", position=" + position + ", point=" + point + ", health=" + health
                + ", movementSpeed=" + movementSpeed + ", bulletSpeed=" + bulletSpeed + ", description=" + description
                + "]";
    }

    @Override
    public void move() throws Exception {
        // TODO Auto-generated method stub
        switch (direction){
            case UP:
                position = new Point2D(position.getX(), position.getY() - movementSpeed);
            case DOWN:
                position = new Point2D(position.getX(), position.getY() + movementSpeed);
            case LEFT:
                position = new Point2D(position.getX() - movementSpeed, position.getY());
            case RIGHT:
                position = new Point2D(position.getX() + movementSpeed, position.getY());
                break;
            default:
                throw new IllegalStateException("Unexpected direction: " + direction);
        }
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    @Override
    public void shoot(Tank tank) {
        // TODO Auto-generated method stub
        int damage = this.bulletSpeed;
        tank.takeDamage(damage);
    }
    public void takeDamage(int damage){
        this.health -= damage;
    }

    public void addPoints(int score){
        this.point += score;
    }

}

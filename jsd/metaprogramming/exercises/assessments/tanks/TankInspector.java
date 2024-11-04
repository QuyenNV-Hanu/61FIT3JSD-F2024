package jsd.metaprogramming.exercises.assessments.tanks;

public class TankInspector {
	@SuppressWarnings({ "rawtypes" })
	public Class tankClass;

	public TankInspector() throws ClassNotFoundException {
		this.tankClass = Class.forName("jsd.metaprogramming.exercises.tanks.Tank");
	}

	public boolean isValidClassName() {
		String className = this.tankClass.getName();
		// System.out.println("Class name: " + className);
		// Return jsd.metaprogramming.exercises.tanks.Tank
		// TODO: Check the naming conventions, the packages,...
		return false;
	}
}

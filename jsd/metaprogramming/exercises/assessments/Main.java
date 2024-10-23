package jsd.metaprogramming.exercises.assessments;

import jsd.metaprogramming.exercises.assessments.tanks.TankInspector;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		TankInspector ti = new TankInspector();
		System.out.println(ti.isValidClassName());
	}

}

package VisitorPattern;

import VisitorPattern.part.Body;
import VisitorPattern.part.Brake;
import VisitorPattern.part.Engine;
import VisitorPattern.part.Wheel;
import VisitorPattern.visitor.CarPartVisitor;

class Car {
	Wheel wheel = new Wheel("Unknown");
	Body body = new Body("Unknown");
	Engine engine = new Engine("Unknown");
	Brake brake = new Brake("Unknown");

	public void accept(CarPartVisitor visitor) {
		wheel.accept(visitor);
		engine.accept(visitor);
		body.accept(visitor);
		brake.accept(visitor);
	}
}
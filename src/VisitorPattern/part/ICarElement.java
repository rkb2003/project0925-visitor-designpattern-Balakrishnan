package VisitorPattern.part;

import VisitorPattern.visitor.CarPartVisitor;

public interface ICarElement {
	void accept(CarPartVisitor visitor);
}

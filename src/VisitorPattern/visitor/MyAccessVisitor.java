package VisitorPattern.visitor;

import VisitorPattern.part.Body;
import VisitorPattern.part.Brake;
import VisitorPattern.part.Engine;
import VisitorPattern.part.Wheel;

public class MyAccessVisitor extends CarPartVisitor {
	public void visit(Wheel part) {
		System.out.println("[DBG] Accessing the name property: " + part.getName());
	}

	public void visit(Engine part) {
		System.out.println("[DBG] Accessing the name property: " + part.getName());
	}

	public void visit(Body part) {
		System.out.println("[DBG] Accessing the name property: " + part.getName());
	}
	
	public void visit(Brake part) {
		System.out.println("[DBG] Accessing the name property: " + part.getName());
	}
}
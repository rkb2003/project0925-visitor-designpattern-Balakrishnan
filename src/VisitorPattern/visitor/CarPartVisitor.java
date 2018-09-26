package VisitorPattern.visitor;

import VisitorPattern.part.Body;
import VisitorPattern.part.Brake;
import VisitorPattern.part.Engine;
import VisitorPattern.part.Wheel;

public abstract class CarPartVisitor {
   public abstract void visit(Wheel wheel);
   public abstract void visit(Engine engine);
   public abstract void visit(Body body);
   public abstract void visit(Brake brake);
}
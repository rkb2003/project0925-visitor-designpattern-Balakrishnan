package VisitorPattern.visitor;

import java.util.ArrayList;
import java.util.List;

import VisitorPattern.part.Body;
import VisitorPattern.part.Brake;
import VisitorPattern.part.Engine;
import VisitorPattern.part.Wheel;
import util.UtilFile;

public class MyReverseVisitor extends CarPartVisitor {
   public void visit(Wheel part) {
	 /* List<String> list = new ArrayList();
	  list.add(part.getName());
      String newName = UtilFile.reverse(list);*/ // Suppose a new name is notified.
      System.out.println(UtilFile.reverseString(part.getName()) + "," + UtilFile.reverseString(part.getModelNumberWheel())
      + "," + UtilFile.reverseString(part.getModelYearWheel()));
      
   }

   public void visit(Engine part) {
	   System.out.println(UtilFile.reverseString(part.getName()) + "," + UtilFile.reverseString(part.getModelNumberEngine())
	      + "," + UtilFile.reverseString(part.getModelYearEngine()));
   }

   public void visit(Body part) {
	   System.out.println(UtilFile.reverseString(part.getName()) + "," + UtilFile.reverseString(part.getModelNumberBody())
	      + "," + UtilFile.reverseString(part.getModelYearBody()));
   }
   
   public void visit(Brake part) {
	   System.out.println(UtilFile.reverseString(part.getName()) + "," + UtilFile.reverseString(part.getModelNumberBrake())
	      + "," + UtilFile.reverseString(part.getModelYearBrake()));
	   }
   
  

}
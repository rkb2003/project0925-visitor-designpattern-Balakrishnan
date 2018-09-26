package VisitorPattern.visitor;

import java.io.File;
import java.util.List;

import VisitorPattern.part.Body;
import VisitorPattern.part.Brake;
import VisitorPattern.part.Engine;
import VisitorPattern.part.Wheel;
import util.UtilFile;

public class MyFileReadVisitor extends CarPartVisitor {

   private String workDir = System.getProperty("user.dir");
   private List<String> contents;

   public MyFileReadVisitor() {
      contents = UtilFile.readFile(workDir + File.separator + "inputdata.txt");
   }

   @Override
   public void visit(Wheel part) {
      final int LINE_NUM_WHEEL = 0;
      String[] tokens = contents.get(LINE_NUM_WHEEL).split(",");
      part.setName(tokens[0].trim());
      part.setModelNumberWheel(tokens[1].trim());
      part.setModelYearWheel(tokens[2].trim());
   }

   @Override
   public void visit(Engine part) {
      final int LINE_NUM_ENGINE = 1;
      String[] tokens = contents.get(LINE_NUM_ENGINE).split(",");
      part.setName(tokens[0].trim());
      part.setModelNumberEngine(tokens[1].trim());
      part.setModelYearEngine(tokens[2].trim());
   }

   @Override
   public void visit(Body part) {
      final int LINE_NUM_BODY = 2;
      String[] tokens = contents.get(LINE_NUM_BODY).split(",");
      part.setName(tokens[0].trim());
      part.setModelNumberBody(tokens[1].trim());
      part.setModelYearBody(tokens[2].trim());
   }
   @Override
   public void visit(Brake part) {
      final int LINE_NUM_BODY = 3;
      String[] tokens = contents.get(LINE_NUM_BODY).split(",");
      part.setName(tokens[0].trim());
      part.setModelNumberBrake(tokens[1].trim());
      part.setModelYearBrake(tokens[2].trim());
   }
}

package VisitorPattern.visitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import VisitorPattern.part.Body;
import VisitorPattern.part.Brake;
import VisitorPattern.part.Engine;
import VisitorPattern.part.Wheel;
import util.UtilFile;

public class MyFileSaveVisitor extends CarPartVisitor {

	List<String> partList = new ArrayList<String>();
	public void visit(Wheel part) {


		partList.add(UtilFile.reverseString(part.getName()) + "," +UtilFile.reverseString(part.getModelNumberWheel())
		+ "," + UtilFile.reverseString(part.getModelYearWheel()));


	}



	public void visit(Engine part) {
		

		partList.add(UtilFile.reverseString(part.getName()) + "," +UtilFile.reverseString(part.getModelNumberEngine())
		+ "," + UtilFile.reverseString(part.getModelYearEngine()));


	}

	public void visit(Body part) {
		

		partList.add(UtilFile.reverseString(part.getName()) + "," +UtilFile.reverseString(part.getModelNumberBody())
		+ "," + UtilFile.reverseString(part.getModelYearBody()));


	}

	public void visit(Brake part) {
		

		partList.add(UtilFile.reverseString(part.getName()) + "," +UtilFile.reverseString(part.getModelNumberBrake())
		+ "," + UtilFile.reverseString(part.getModelYearBrake()));
		createandSavefile(partList);

	}

	public static void createandSavefile(List<String> list) {
		System.out.println("creating file");
		try {
			UtilFile.saveFile(putFilePath(), list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String putFilePath() {
		return "C:/Users/Rajasree/eclipse-workspace/project0925-visitor-designpattern-Balakrishnan/src/outputdata.csv";
	}
}
package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;
import utilities.SortManager;

public class AppDriver
{	
	public static void main( String[] args )
	{
		ParseArgs.parseArgs(args);

		File shapesFile = ParseArgs.getFile();
		char sortType = ParseArgs.getSortType();
		char algorithm = ParseArgs.getAlgorithm();

		System.out.println("File: " + shapesFile);
		System.out.println("Sort type: " + sortType);
		System.out.println("Algorithm: " + algorithm);

		if (shapesFile == null) {return;}

		Scanner input = null;
		int arrayLength = 0;

		try 
		{
			input = new Scanner(shapesFile);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		if (input.hasNextLine()) {
			String firstLine = input.nextLine();
			arrayLength = Integer.parseInt(firstLine);
		}

		GeometricShape[] shapeArray = new GeometricShape[arrayLength];

		int index = 0;
		while (input.hasNext() && index < arrayLength)
		{
			String shapeType = input.next();
			Double height = Double.parseDouble(input.next());
			Double side = Double.parseDouble(input.next());

			switch (shapeType) {
				case "Cone":
					shapeArray[index] = new Cone(height, side);
					break;
				case "Cylinder":
					shapeArray[index] = new Cylinder(height, side);
					break;
				case "Pyramid":
					shapeArray[index] = new Pyramid(height, side);
					break;
				case "SquarePrism":
					shapeArray[index] = new SquarePrism(height, side);
					break;
				case "TriangularPrism":
					shapeArray[index] = new TriangularPrism(height, side);
					break;
				case "PentagonalPrism":
					shapeArray[index] = new PentagonalPrism(height, side);
					break;
				case "OctagonalPrism":
					shapeArray[index] = new OctagonalPrism(height, side);
					break;
				default:
					System.out.println("Unknown shape type: " + shapeType);
					break;
			}
			
			index += 1;
		}

		long startTime = System.nanoTime();
        GeometricShape[] sortedShapes = SortManager.SortArray(shapeArray, sortType, algorithm);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;

		System.out.println("The first sorted shape: " + sortedShapes[0] + " | Type: " + sortedShapes[0].getClass().getSimpleName() + " | Value: " + sortTypeCalculation(sortedShapes[0], sortType));

		for (int i = 0; i < sortedShapes.length; i++) {
			if (sortedShapes.length > 1000 && i % 1000 == 0) {
				System.out.println((i + 1) + "-th: " + sortedShapes[i] + " | Type: " + sortedShapes[i].getClass().getSimpleName() + " | Value: " + sortTypeCalculation(sortedShapes[i], sortType));
			}
		}

		System.out.println("The last sorted shape: " + sortedShapes[sortedShapes.length - 1] + " | Type: " + sortedShapes[sortedShapes.length - 1].getClass().getSimpleName() + " | Value: " + sortTypeCalculation(sortedShapes[sortedShapes.length - 1], sortType));
		System.out.println("Duration: " + duration + " milliseconds");
	} 

	private static double sortTypeCalculation (GeometricShape shape, char sortType)
	{
		switch (sortType) {
            case 'v':
                return shape.getCalcVolume();
            case 'h':
				return shape.getHeight();
            case 'a':
                return shape.getBaseArea();
            default:
                throw new IllegalArgumentException("Invalid sort option: " + sortType);
        }
	}
}

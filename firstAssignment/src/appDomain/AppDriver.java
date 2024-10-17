package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shapes.*;

public class AppDriver
{	
	public static void main( String[] args )
	{
		//File shapesFile = new File("firstAssignment/res/shapes1.txt");
		//System.out.println(shapesFile.getAbsolutePath());
		
		File shapesFile = parseArgs(args);

		if (shapesFile == null) 
		{
			return;
		}

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

			System.out.println(shapeType + " " + height + " "+ side);

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


		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)
	
	}

	private static File parseArgs(String[] args) 
	{
		if (args.length > 0) {
            String filename = args[0];
            File file = new File(filename);

            if (file.exists() && file.isFile()) 
			{
                System.out.println("File is valid: " + filename);
				return file;
            } 
			else 
			{
                System.out.println("The specified file does not exist or is not a valid file: " + filename);
				return null;
            }
        } 
		else 
		{
            System.out.println("Please provide the filename as a command-line argument.");
			return null;
        }
	}
 
}

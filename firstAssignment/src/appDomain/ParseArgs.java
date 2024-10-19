package appDomain;

import java.io.File;

public class ParseArgs {

    private static File file = null;
    private static char sortType = '0';
    private static char algorithm = '0';

    public static File getFile() {
        return file;
    }
    public static char getSortType() {
        return sortType;
    }
    public static char getAlgorithm() {
        return algorithm;
    }

    public static void parseArgs (String[] args) {
        for (String arg: args) {
            if (arg.startsWith("-f")) {
                String filename = arg.substring(2);
                file = new File(filename);
                if (!file.exists() || !file.isFile()) {
                    System.out.println("Invalid file: " + filename);
                    file = null; // Reset file if invalid
                }
            } else if (arg.startsWith("-t")) {
                if (arg.length() == 3) {  
                    sortType = arg.charAt(2);
                } else {
                    System.out.println("Invalid char after -t.");
                }
            } else if (arg.startsWith("-s")) {
                if (arg.length() == 3) {  
                    algorithm = arg.charAt(2);
                } else {
                    System.out.println("Invalid char after -s.");
                }
            } else {
                System.out.println("Unknown argument: " + arg);
            }
        }
    }
}

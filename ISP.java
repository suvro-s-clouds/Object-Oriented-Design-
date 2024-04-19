/**
 * Title: Java program demonstrating Interface Segregation Principle (ISP)
 * Author: [Name - Suvro Dev Mojumder , Student ID - 220237 , Discipline - CSE , Khulna University ]
 */

/**
 * Interface representing functionalities related to printing tasks.
 */
interface PrintTasks {
    /**
     * Prints the document.
     */
    void print();

    /**
     * Performs duplex printing.
     */
    void duplexPrint();
}

/**
 * Interface representing functionalities related to scanning tasks.
 */
interface ScanTasks {
    /**
     * Scans the document.
     */
    void scan();
}

/**
 * Class representing a Basic Printer that can print and perform duplex printing.
 */
class BasicPrinter implements PrintTasks {

    /**
     * Prints the document.
     */
    @Override
    public void print() {
        System.out.println("Basic Printer: Printing document...");
    }

    /**
     * Performs duplex printing. (Not supported)
     */
    @Override
    public void duplexPrint() {
        // Not supported for basic printers
        System.out.println("Basic Printer: Duplex printing not supported.");
    }
}

/**
 * Class representing a Multifunction Printer that can scan and perform duplex printing.
 */
class MultifunctionPrinter implements ScanTasks, PrintTasks {

    /**
     * Scans the document.
     */
    @Override
    public void scan() {
        System.out.println("Multifunction Printer: Scanning document...");
    }

    /**
     * Prints the document.
     */
    @Override
    public void print() {
        System.out.println("Multifunction Printer: Printing document...");
    }

    /**
     * Performs duplex printing.
     */
    @Override
    public void duplexPrint() {
        System.out.println("Multifunction Printer: Duplex printing...");
    }
}

/**
 * Main class to demonstrate the usage of different printers with ISP.
 */
public class PrinterDemo {
    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Using BasicPrinter
        BasicPrinter basicPrinter = new BasicPrinter();
        System.out.println("Using Basic Printer:");
        basicPrinter.print();
        basicPrinter.duplexPrint(); // This will show that duplex printing is not supported

        // Using MultifunctionPrinter
        MultifunctionPrinter multifunctionPrinter = new MultifunctionPrinter();
        System.out.println("\nUsing Multifunction Printer:");
        multifunctionPrinter.scan();
        multifunctionPrinter.print();
        multifunctionPrinter.duplexPrint();
    }
}

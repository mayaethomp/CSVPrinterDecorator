public abstract class CSVPrinterDecorator {
    protected CSVPrinter decoratedPrinter;

    public CSVPrinterDecorator(CSVPrinter decoratedPrinter) {
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public void print(String filePath, List<List<String>> rows) {
        decoratedPrinter.print(filePath, rows);
    }
}
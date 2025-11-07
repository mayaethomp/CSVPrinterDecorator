public class HeaderCSVPrinterDecorator extends CSVPrinterDecorator {
    private List<String> header;

    public HeaderCSVPrinterDecorator (CSVPrinter decoratedPrinter, List<String> header) {
        super(decoratedPrinter);
        this.header = header;
    }

    @Override
    public void print(String filePath, List<List<String>> rows) {
        List<List<String>> modifiedRows = new ArrayList<>();
        modifiedRows.add(header); // Add header as first row
        modifiedRows.addAll(rows); // append rest of data
        super.print(filePath, modifiedRows);
    }
}

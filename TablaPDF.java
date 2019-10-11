public class TablasPDF {

private static Font tituloFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLUE);

public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {

        
    try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("C:/UPTAP/objetos.pdf"));
            doc.open();
            
            
        PdfPTable table1 = new PdfPTable(3);

        PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table1.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 2"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table1.addCell(c1);

        c1 = new PdfPCell(new Phrase("Table Header 3"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table1.addCell(c1);
        table1.setHeaderRows(1);

        table1.addCell("1.0");
        table1.addCell("1.1");
        table1.addCell("1.2");
        table1.addCell("2.1");
        table1.addCell("2.2");
        table1.addCell("2.3");            
            
            
            doc.add(table1);
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
    }    
        
        
 

}
}

public class Posgrado {

private static Font tituloFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLUE);

public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {

        
    try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("C:/DIRECTORIO/objetos.pdf"));
            
            doc.open();
                Paragraph p1 = new Paragraph("REPORTE PDF EJEMPLO",tituloFont);
                doc.add(p1);
            doc.close();
            
        } catch (Exception e) {
            e.printStackTrace();
    }    
        
        

}
}

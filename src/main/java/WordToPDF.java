import com.spire.doc.Document;
import com.spire.doc.ToPdfParameterList;

public class WordToPDF {
    public static void main(String[] args) {
        //Create a Document instance
        Document doc = new Document();

        //Load a sample Word document
        doc.loadFromFile("/home/lucas/Documentos/alignparagraph.docx");

        //Create a ToPdfParameterList instance
        ToPdfParameterList ppl=new ToPdfParameterList();

        //Embed all fonts in the PDF document
        ppl.isEmbeddedAllFonts(true);

        //Remove the hyperlinks and keep the character formats
        ppl.setDisableLink(true);

        //Set the output image quality as 40% of the original image. 80% is the default setting.
        doc.setJPEGQuality(40);

        //Save the document as PDF
        doc.saveToFile("/home/lucas/Documentos/ToPDF.pdf", ppl);
    }
}

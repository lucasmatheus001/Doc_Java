import com.spire.doc.Document;

import java.io.FileWriter;
import java.io.IOException;

public class ExtractText {

    public static void main(String[] args) throws IOException {

        //load Word document
        Document document = new Document();
        document.loadFromFile("/home/lucas/Documentos/alignparagraph.docx");

        //get text from document as string
        String text=document.getText();

        //write string to a .txt file
        writeStringToTxt(text,"/home/lucas/Documentos/ExtractedText.txt");
    }

    public static void writeStringToTxt(String content, String txtFileName) throws IOException{

        FileWriter fWriter= new FileWriter(txtFileName,true);
        try {
            fWriter.write(content);
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                fWriter.flush();
                fWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

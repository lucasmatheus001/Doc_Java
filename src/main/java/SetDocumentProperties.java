import com.spire.doc.Document;
import com.spire.doc.FileFormat;


public class SetDocumentProperties {
    public static void main(String[] args){
        //Load Word document
        Document document = new Document("/home/lucas/Documentos/SetBuiltInProperties.docx");

        //Remove built-in properties by setting the value to null
        document.getBuiltinDocumentProperties().setTitle("");
        document.getBuiltinDocumentProperties().setSubject("");
        document.getBuiltinDocumentProperties().setAuthor("");
        document.getBuiltinDocumentProperties().setCompany("");
        document.getBuiltinDocumentProperties().setManager("");
        document.getBuiltinDocumentProperties().setCategory("");
        document.getBuiltinDocumentProperties().setKeywords("");
        document.getBuiltinDocumentProperties().setComments("");

        //Save the resultant document
        document.saveToFile("/home/lucas/Documentos/CloneBuiltInProperties.docx", FileFormat.Docx_2013);
    }
}
# APACHE POI e SPIRE.DOC - Para criação e manipulação de arquivos word (Doc e Docx).

### Pré-requisitos 

Certifique-se de ter instalado em seu projeto o Maven e o Spring Boot.

## Resumo

O Apache POI É uma API fornecida pela Fundação Apache sendo a mesma, uma coleção de diferentes bibliotecas Java. Esse recurso permite que a biblioteca leia, escreva e manipule diferentes arquivos da Microsoft, como planilhas do Excel, PowerPoint e arquivos do Word.

O Spire.Doc for Java é uma API profissional do Java Word que permite que os aplicativos Java criem, convertam, manipulem e imprimam documentos do Word sem usar o Microsoft Office.

Exemplo APACHE POI (https://www.tutorialspoint.com/apache_poi_word/apache_poi_word_quick_guide.htm)

Exemplo SPIRE.DOC (https://www.geeksforgeeks.org/java-program-to-create-a-word-document/)


## Para executar em seu projeto adicione as depências do APACHE POI
  dependencias:
  
  ```
  <dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.0</version>
  </dependency>
  ```
  ## Para executar em seu projeto adicione as depências do Spire.DOc
  
  ```
  <repositories>
    <repository>
        <id>com.e-iceblue</id>
        <name>e-iceblue</name>
        <url>https://repo.e-iceblue.com/nexus/content/groups/public/</url>
    </repository>
  </repositories>

  ```
  
  ```
  <dependencies>
    <dependency>
        <groupId> e-iceblue </groupId>
        <artifactId>spire.doc.free</artifactId>
        <version>5.2.0</version>
    </dependency>
  </dependencies>

  ```
  Após adicionadas as dependências em seu projeto atualize as dependências com o Maven.
  
## É possivel realizar com essas APIs
 - [x] Criar um documento word (doc e docx);
 - [x] Ler um documento word;
 - [x] Editar elementos do documento;
 - [x] Apagar elementos do documento;
 - [x] Converter o documento para PDF e outros formatos;


## Observações

Para criação de documentos word utilizei a API do APACHE POI e para copiar,extrair o conteúdo dos arquivos e converter para PDF utilizei  a API do SPIRE.Doc.


Ao se realizar o processor de criação de um arquivo word (doc e docx) e necessário informar o respectivo caminho onde esse arquivo será criado ou lido:

  fileName| loadFromFile | FileOutputStream
  
  No windows pode ser definido:
  
    "C:\\Users\\ssimo\\Documents\\hello.docx"
    
  No linux:
  
    "/home/lucas/Documentos/document.docx"
    




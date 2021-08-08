import java.io.*;
import java.util.List;

public class Files {
    private String fileNameRead;
    private String fileNameWrite;
    private String stringForDictionary;

    public String getFileNameRead() {
        return fileNameRead;
    }

    public void setFileNameRead(String fileNameRead) {
        this.fileNameRead = fileNameRead;
    }

    public String getFileNameWrite() {
        return fileNameWrite;
    }

    public void setFileNameWrite(String fileNameWrite) {
        this.fileNameWrite = fileNameWrite;
    }

    public String getStringDictionary() {
        return stringForDictionary;
    }

    public void readFile() {
        File readFile = new File(fileNameRead);
        StringBuilder sb = new StringBuilder();
        if (readFile.exists()) {
            System.out.println("File exist...");
        } else {
            System.out.println("File not found...");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(readFile))) {
            String textFromFile;
            System.out.println("Reading file with text...");
            while ((textFromFile = br.readLine()) != null) {
                sb.append(textFromFile);
                sb.append(" ");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        stringForDictionary = sb.toString();
           }

    public void writeFile(List<String> listDictionaryForWrite) {
        File writeFile = new File(fileNameWrite);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile))) {
            System.out.println("Writing dictionary file...");
            for (String list : listDictionaryForWrite) {
                bw.write(list);
                bw.append('\n');
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

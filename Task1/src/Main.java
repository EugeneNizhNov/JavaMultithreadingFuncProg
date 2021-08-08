import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String fileNameRead = "D://Eugene/Java/JavaMultithreading/FuncProg/Task1/src/Text.txt";
        final String fileNameWrite = "D://Eugene/Java/JavaMultithreading/FuncProg/Task1/src/Dictionary.txt";
        Files files = new Files();
        files.setFileNameRead(fileNameRead);
        files.setFileNameWrite(fileNameWrite);
        files.readFile();
        WordBook wordBook = new WordBook();
        files.writeFile(wordBook.buildDictionary(wordBook.textSplit(files)));
    }
}

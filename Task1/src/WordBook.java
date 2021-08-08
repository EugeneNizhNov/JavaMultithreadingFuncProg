import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordBook {
    public List<String> buildDictionary(String[] result) {
        System.out.println("Creating dictionary...");
        return Arrays.stream(result)
                .filter(x -> !x.equals(""))
                .map(x -> x.toLowerCase(Locale.ROOT))
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public String[] textSplit(Files files) {
        Pattern pattern = Pattern.compile("\\W");
        return pattern.split(files.getStringDictionary());
    }
}

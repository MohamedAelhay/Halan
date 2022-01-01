import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueValues {
    public Set<String> removeDuplicates(String[] words) {
        Set<String> uniqueValues = new HashSet<>();
        HashMap<String, Boolean> uniqueMap = new HashMap<>();

        for (String word : words) {
            if(uniqueValues.contains(word)){
                uniqueMap.put(word, true);
            } else {
                uniqueMap.put(word, false);
                uniqueValues.add(word);
            }
        }

        uniqueValues.removeIf(uniqueMap::get);

        return uniqueValues;
    }
}

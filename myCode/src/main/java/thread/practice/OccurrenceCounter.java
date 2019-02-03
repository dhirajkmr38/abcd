package thread.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class OccurrenceCounter {

     Map<Character, Integer> mapCountByLetter = new ConcurrentHashMap<>();
    public void addLetterOccurence(String word)
    {
        Character letter = retrieveCharacter( word );
        if ( letter == null ) {
            return;
        }
        Integer occurrence = mapCountByLetter.get( letter );
        synchronized ( this ) {
            if ( occurrence == null ) {
                occurrence = 0;
            }
            mapCountByLetter.put( letter, ++occurrence );
        }
   }
    private Character retrieveCharacter(String word) {

        Matcher matcher = Pattern.compile("([A-Za-z])")
            .matcher(word);
        if (matcher.find()) {
            String group = matcher.group(1);
            return group.charAt(0);
        }
        return null;
    }

}
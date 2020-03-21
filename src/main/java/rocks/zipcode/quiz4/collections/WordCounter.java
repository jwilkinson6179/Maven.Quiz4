package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter
{
    String[] sentence;

    public WordCounter(String... strings)
    {
        sentence = strings;
    }

    public Map<String, Integer> getWordCountMap()
    {
        Map<String, Integer> wordCounts = new HashMap<>();

        for(String word : sentence)
        {
            if(!wordCounts.containsKey(word))
            {
                wordCounts.put(word, 1);
            }
            else
            {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }

        return wordCounts;
    }
}

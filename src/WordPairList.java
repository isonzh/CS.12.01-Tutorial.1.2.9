import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;


    public WordPairList(String[] words)
    {
       allPairs = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                WordPair list = new WordPair(words[i],words[j]);
                allPairs.add(list);
            }

        }
    }

    public int numMatches()
    {
        int count=0;
        for(WordPair i:allPairs){
            if(i.getFirst().equals(i.getSecond())){
                count++;
            }
        }
        return count;
    }
    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
}

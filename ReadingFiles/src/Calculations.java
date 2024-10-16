import java.util.ArrayList;

public class Calculations {

    public static Object[] countWordFrequency(ArrayList<String> words){
        //passing in my cleaned list of words
        //getting ready to return an object of two arrays to be used easier for calculations

        //creating two arrays with corresponding indexes
        //one for words themselves and one for word counts
        ArrayList<String> uniqueWords = new ArrayList<>();
        ArrayList<Integer> wordCounts = new ArrayList<>();

        //figuring out if word is already in the array or not
        //if word is in the list i am getting its location (index value) and increasing its count in the
        //corresponding location in the other list
        for (String word :words){
            if (uniqueWords.contains(word)){
                int index = uniqueWords.indexOf(word);
                wordCounts.set(index, wordCounts.get(index) + 1);
            } else{
                uniqueWords.add(word);
                wordCounts.add(1);
            }
        }

        String[] wordsArray = uniqueWords.toArray(new String[0]);
        Integer[] countsArray = wordCounts.toArray(new Integer[0]);
        // returing the two specific arrays with corresponding indexes
        return new Object[] {wordsArray, countsArray};
    }
}

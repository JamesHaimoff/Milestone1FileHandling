import java.util.ArrayList;

public class Handler {
    private String filepath;
    private int articleNumber;
    public Handler(String filepath, int articleNumber){
        this.filepath = filepath;
        this.articleNumber = articleNumber;
    }
    public void processingNComputations(){
        filepath = this.filepath;
        System.out.println("Article " + this.articleNumber + " Information Display:");
        ArrayList<String> file1 = new ArrayList<>();
        ReadingFiles fileProcessor = new ReadingFiles();
        file1 = fileProcessor.completeClean(filepath);
        Object[] result = Calculations.countWordFrequency(file1);

        String[] words = (String[]) result[0]; //take the return at 0 assigning this to words
        Integer[] counts = (Integer[]) result[1]; //take the return at 1 assigning this to counts

//        for(int i = 0; i < words.length; i++){
//            System.out.println(words[i] + ":" + counts[i]);
//            //made it into array list because we are personally more comforatable with it
//            //just mapped a two array bubble sort

        Statistics statistics = new Statistics();
        statistics.bubbleSortArrays(words, counts);
//        for (int count: counts) {
//            System.out.println(count);
//        }
        statistics.displayStatistics(words, counts);
    }

}

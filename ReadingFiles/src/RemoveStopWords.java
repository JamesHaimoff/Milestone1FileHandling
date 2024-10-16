//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Iterator;
//
//public class RemoveStopWords {
////    public  ArrayList<String> removalMethod(String[] file) {
////        List<String> arrayList = new ArrayList<>(Arrays.asList(file));
////        Iterator<String> iterator = arrayList.iterator();
////        String[] stopWords = {"i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", "your",
////                "yours", "yourself", "yourselves", "he", "him", "his", "himself", "she",
////                "her", "hers", "herself", "it", "its", "itself", "they", "them", "their",
////                "theirs", "themselves", "what", "which", "who", "whom", "this", "that",
////                "these", "those", "am", "is", "are", "was", "were", "be", "been", "being",
////                "have", "has", "had", "having", "do", "does", "did", "doing", "a", "an",
////                "the", "and", "but", "if", "or", "because", "as", "until", "while", "of",
////                "at", "by", "for", "with", "about", "against", "between", "into", "through",
////                "during", "before", "after", "above", "below", "to", "from", "up", "down",
////                "in", "out", "on", "off", "over", "under", "again", "further", "then",
////                "once", "here", "there", "when", "where", "why", "how", "all", "any",
////                "both", "each", "few", "more", "most", "other", "some", "such", "no",
////                "nor", "not", "only", "own", "same", "so", "than", "too", "very", "s",
////                "t", "can", "will", "just", "don", "should", "now"};
////        while (iterator.hasNext()) {
////            String word = iterator.next();
////            for (int i = 0; i < stopWords.length; i++) {
////                if (word.equals(stopWords[i])) {
////                    iterator.remove();
////                }
////            }
////        }
////        return new ArrayList<>(arrayList);
//}
//public static void main(String[] args) {
//
////            ReadingFiles fileProcessor = new ReadingFiles();
////            String[] file1 = fileProcessor.completeClean("C:/CODE/WLAB/gta6news.txt");
//////            for(String f : file1){
//////                System.out.println(f);
//////            }
////            RemoveStopWords Remover = new RemoveStopWords();
////            ArrayList<String> file1new = new ArrayList<>();
////            file1new = Remover.removalMethod(file1);
////            for (String f : file1new){
////                System.out.println(f);
//        ArrayList<String> file1 = new ArrayList<>();
//        ReadingFiles fileProcessor = new ReadingFiles();
//        file1 = fileProcessor.completeClean("C:/CODE/WLAB/gta6news.txt");
//        for (String f : file1){
//            System.out.println(f);
//        }
//    }


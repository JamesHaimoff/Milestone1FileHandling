import java.io.*;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


public class ReadingFiles {
    public String textToString(String filepath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
//                System.out.println(data);
                fileContent.append(data).append("\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String stringedFile = fileContent.toString();
        return stringedFile;
    }

    public String removeExtraFromList(String sentence) {
        // Replace all non-alphabetic characters with a space
        sentence = sentence.replaceAll("[^a-zA-Z]", " ");
        // Return the modified sentence
        return sentence;
    }

    public String[] convertToArray(String sentence) {
        String[] array = sentence.split("\\s+");
        //the //s thing split by any whitespace
        return array;
    }
    public  ArrayList<String> removalMethod(String[] file) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(file));
        Iterator<String> iterator = arrayList.iterator();
        String[] stopWords = {"i", "me", "my", "myself", "we", "our", "ours", "ourselves", "you", "your",
                "yours", "yourself", "yourselves", "he", "him", "his", "himself", "she",
                "her", "hers", "herself", "it", "its", "itself", "they", "them", "their",
                "theirs", "themselves", "what", "which", "who", "whom", "this", "that",
                "these", "those", "am", "is", "are", "was", "were", "be", "been", "being",
                "have", "has", "had", "having", "do", "does", "did", "doing", "a", "an",
                "the", "and", "but", "if", "or", "because", "as", "until", "while", "of",
                "at", "by", "for", "with", "about", "against", "between", "into", "through",
                "during", "before", "after", "above", "below", "to", "from", "up", "down",
                "in", "out", "on", "off", "over", "under", "again", "further", "then",
                "once", "here", "there", "when", "where", "why", "how", "all", "any",
                "both", "each", "few", "more", "most", "other", "some", "such", "no",
                "nor", "not", "only", "own", "same", "so", "than", "too", "very", "s",
                "t", "can", "will", "just", "don", "should", "now"};
        while (iterator.hasNext()) {
            String word = iterator.next();
            for (int i = 0; i < stopWords.length; i++) {
                if (word.equals(stopWords[i])) {
                    iterator.remove();
                }
            }
        }
        return new ArrayList<>(arrayList);
    }

    //passing in file1
    public ArrayList<String> completeClean(String file) {
        String sentence = textToString(file);
        String cleanSentence = removeExtraFromList(sentence);
        String[] cleanArray = convertToArray(cleanSentence);
        for (int i = 0; i < cleanArray.length; i++){
            cleanArray[i] = cleanArray[i].toLowerCase();
        }
        ArrayList<String> file1new = new ArrayList<>();
        file1new = removalMethod(cleanArray);
        return file1new;
    }
}


//    public void main(){
//        //System.out.println("James");
//        //String sentence = "Hello my,,name^is-jame's";
//        String file1 = "C:/CODE/WLAB/gta6news.txt";
//        ReadingFiles cleaner = new ReadingFiles(file1);
//
//
//        String file = "C:/CODE/WLAB/gta6news.txt";
//
//        String sentence = textToString(file);
//        //returns the text file input back as the string you define
//
//
//        String cleanSentence = removeExtraFromList(sentence);
//        //cleans all not words and converts to spaces
//
//        String[] cleanArray = convertToArray(cleanSentence);
//        //converts your clean string to an array for use
//        //this uses each empty space to add an element to the array
//
//        System.out.println(cleanArray);
//        for(int i = 0; i < 100; i++) {
//            System.out.println(cleanArray[i]);
//        }
//    }
//}

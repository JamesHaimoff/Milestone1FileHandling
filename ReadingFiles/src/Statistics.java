public class Statistics {
        public void bubbleSortArrays(String[] uniqueWords, Integer[] wordCounts) {

            int n = wordCounts.length;
            boolean swapped;

            // Bubble sort + optimization techniques for edge cases
            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                for (int j = 0; j < n - i - 1; j++) {
                    //need to essentially bubble sort for both my list of words and frequences
                    //just diplicate the bubble sort list positioning
                    if (wordCounts[j] < wordCounts[j+1]) {

                        //swap counts
                        int tempCount = wordCounts[j];
                        wordCounts[j] = wordCounts[j+1];
                        wordCounts[j+1] = tempCount;

                        //swap word position
                        String tempWord = uniqueWords[j];
                        uniqueWords[j] = uniqueWords[j+1];
                        uniqueWords[j+1] = tempWord;
                        swapped = true;
//                        public static void bubbleSort(int[] numbers, String[] names) {
//                            int n = numbers.length;
//                            for (int i = 0; i < n - 1; i++) {
//                                for (int j = 0; j < n - i - 1; j++) {
//                                    if (numbers[j] > numbers[j + 1]) {
//                                        // Swap numbers
//                                        int tempNum = numbers[j];
//                                        numbers[j] = numbers[j + 1];
//                                        numbers[j + 1] = tempNum;
//
//                                        // Swap names
//                                        String tempName = names[j];
//                                        names[j] = names[j + 1];
//                                        names[j + 1] = tempName;
                    }
                }
                if (!swapped) {
                    break;
                }
            }
        }
        public void displayStatistics(String[] words, Integer[] counts){
            System.out.println("Display Statistics............");
            int total = 0;
            for (int r = 0; r < words.length; r++) {
                total += counts[r];
            }
            System.out.println("Article Total Word Count: " + total);
            System.out.println("Number of Unique Words:" + words.length);
            System.out.println("Top 5 Words with the highest Frequencies");
            for (int j = 0; j < 5; j++) {
                System.out.println(words[j] + ":" + counts[j]);

            }
            System.out.println("---------------------------------------");
        }
    }


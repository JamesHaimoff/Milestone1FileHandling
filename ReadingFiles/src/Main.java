import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //you may also need to implement a function for number of words in the calculations thing
        Handler file1 = new Handler("C:/CODE/WLAB/gta6news.txt",1);
        file1.processingNComputations();
        Handler file2 = new Handler("C:/CODE/WLAB/gta6news1.txt",1);
        file2.processingNComputations();
        Handler file3 = new Handler("C:/CODE/WLAB/gta6news2.txt",1);
        file3.processingNComputations();
        //didnt know how to use constructors until the end
        }
}

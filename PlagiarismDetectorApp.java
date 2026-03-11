import java.util.*;

class PlagiarismDetector {

    HashMap<String,Integer> map = new HashMap<>();

    public void addText(String text){

        String[] words = text.split(" ");

        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
    }

    public void printWords(){
        System.out.println(map);
    }
}

public class PlagiarismDetectorApp {

    public static void main(String[] args) {

        PlagiarismDetector detector = new PlagiarismDetector();

        detector.addText("java programming language");
        detector.addText("java language tutorial");

        detector.printWords();
    }
}

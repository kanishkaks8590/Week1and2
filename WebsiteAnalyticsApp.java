import java.util.*;

class Analytics {

    HashMap<String,Integer> pageViews = new HashMap<>();

    public void visit(String page){
        pageViews.put(page,pageViews.getOrDefault(page,0)+1);
    }

    public void showStats(){
        System.out.println(pageViews);
    }
}

public class WebsiteAnalyticsApp {

    public static void main(String[] args) {

        Analytics a = new Analytics();

        a.visit("/home");
        a.visit("/home");
        a.visit("/sports");

        a.showStats();
    }
}

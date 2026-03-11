import java.util.*;

class RateLimiter {

    HashMap<String,Integer> requests = new HashMap<>();
    int limit = 5;

    public boolean allow(String client){

        int count = requests.getOrDefault(client,0);

        if(count < limit){
            requests.put(client,count+1);
            return true;
        }

        return false;
    }
}

public class RateLimiterApp {

    public static void main(String[] args) {

        RateLimiter r = new RateLimiter();

        for(int i=0;i<7;i++)
            System.out.println(r.allow("client1"));
    }
}

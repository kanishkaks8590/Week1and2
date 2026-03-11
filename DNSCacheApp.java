import java.util.*;

class DNSCache {

    HashMap<String,String> cache = new HashMap<>();

    public String resolve(String domain){

        if(cache.containsKey(domain)){
            return "Cache HIT: "+cache.get(domain);
        }

        String ip = "192.168.1."+new Random().nextInt(255);

        cache.put(domain,ip);

        return "Cache MISS: "+ip;
    }
}

public class DNSCacheApp {

    public static void main(String[] args) {

        DNSCache dns = new DNSCache();

        System.out.println(dns.resolve("google.com"));
        System.out.println(dns.resolve("google.com"));
    }
}
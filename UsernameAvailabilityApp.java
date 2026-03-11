import java.util.*;

class UsernameChecker {

    HashMap<String, Integer> users = new HashMap<>();
    HashMap<String, Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username) {
        attempts.put(username, attempts.getOrDefault(username, 0) + 1);
        return !users.containsKey(username);
    }

    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        for(int i=1;i<=3;i++)
            suggestions.add(username + i);
        suggestions.add(username.replace("_","."));
        return suggestions;
    }

    public void register(String username, int id){
        users.put(username,id);
    }
}

public class UsernameAvailabilityApp {

    public static void main(String[] args) {

        UsernameChecker checker = new UsernameChecker();

        checker.register("john_doe",101);

        System.out.println(checker.checkAvailability("john_doe"));
        System.out.println(checker.checkAvailability("jane_smith"));

        System.out.println(checker.suggestAlternatives("john_doe"));
    }
}
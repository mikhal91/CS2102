import java.util.HashMap;
import java.util.Scanner;
import junit.runner.Version;





public class Main {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("JUnit version is: " + Version.id());


        ElectionData ED = new ElectionData();





        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(2, "Gompei");
        hash_map.put(1, "Willy");
        hash_map.put(0, "Tommy");
        System.out.println("Initial Mappings are: " + hash_map);
        hash_map.put(5, "Tommy");
        hash_map.put(0, "Howard");
        System.out.println( hash_map);
        System.out.println("ED without added candidate" + ED);

        System.out.println(hash_map.get(5));
        System.out.println(hash_map.get(4));

        try {
            ED.addCandidate("a");
            ED.addCandidate("b");
            ED.addCandidate("c");

        } catch (CandidateExistsException e) {
            System.out.println("Candidate exists");
        }

        System.out.println("ED with added candidate" + ED);


    }





}

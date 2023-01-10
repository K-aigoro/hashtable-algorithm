
import java.security.Key;
import java.util.*;
import java.util.Random;
import java.util.Hashtable;

public class HashTable {

  public static void main(String[] args) {
    Random num = new Random();
    Hashtable table = new Hashtable();

    for (int i = 1; i <= 20; i++) {
      // put method
      table.put(i, num.nextInt(50));
    }

    System.out.println("Hashtable => " + table);
    // getKey
    System.out.println("\nValue associated with key 3 => " + table.get(3));
    System.out.println("\nValue associated with with key 30 " + table.get(30));

    // keyset()
    System.out.println("\nKeys => " + table.keySet());
    // value()
    System.out.println("\nvalue => " + table.values());
    // EntrySet()
    System.out.println("\nKey, value pairs has a set => " + table.entrySet());
    // HashCode()
    System.out.println("\nHash Code => " + table.hashCode());
    // Size()
    System.out.println("\nTotal number of element => " + table.size());
    // isEmpty()
    System.out.println("\nEmpty status of Hashtable => " + table.isEmpty());

  }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


         ArrayList<Integer> sarasas = new ArrayList<>();
         System.out.println(sarasas.size());
         System.out.println(sarasas);
         sarasas.add(7);
         sarasas.add(12);
         System.out.println(sarasas);
         System.out.println( sarasas.get(0));

         sarasas.addAll(Arrays.asList(5, 7, 3)));
         System.out.println(sarasas);
         sarasas.remove(2);
         System.out.println(sarasas);
         System.out.println(Arrays.asList(sarasas.stream().filter(a -> a !=7).toArray()));

         Scanner sc = new Scanner(System.in);

         System.out.println("ivesk amziu");
         int input = sc.nextInt();
         System.out.println(input);
         System.out.println("ivesk ugi");
         input = sc.nextInt();
         System.out.println(input);
         System.out.println("ivesk varda");
         sc.nextLine();
         System.out.println(sc.nextLine());
         System.out.println("aciu kad suvedei info");


    }
}
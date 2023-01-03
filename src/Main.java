import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//         ArrayList<Integer> sarasas = new ArrayList<>();
//         System.out.println(sarasas.size());
//         System.out.println(sarasas);
//         sarasas.add(7);
//         sarasas.add(12);
//         System.out.println(sarasas);
//         System.out.println( sarasas.get(0));
//
//         sarasas.addAll(Arrays.asList(5, 7, 3));
//         System.out.println(sarasas);
//         sarasas.remove(2);
//         System.out.println(sarasas);
//         System.out.println(Arrays.asList(sarasas.stream().filter(a -> a !=7).toArray()));
//
//         Scanner sc = new Scanner(System.in);
//
//         System.out.println("ivesk amziu");
//         int input = sc.nextInt();
//         System.out.println(input);
//         System.out.println("ivesk ugi");
//         input = sc.nextInt();
//         System.out.println(input);
//         System.out.println("ivesk varda");
//         sc.nextLine();
//         System.out.println(sc.nextLine());
//         System.out.println("aciu kad suvedei info");

         ArrayList<String> popularnames = new ArrayList<>();// String, nes tekstas.
         popularnames.add("Karolis");
         popularnames.add("Botanas");

         System.out.println("Sveiki atvykę į populiariausių lietuviškų vardų sąrašą");

         boolean shouldgo = true;
         Scanner sc = new Scanner(System.in);
         while(shouldgo) {
              intro();

              int choice = 0;

              try {
                   choice = sc.nextInt();
              } catch (Exception e) {
                   System.out.println("Neteisingai įvedėte. Įveskite skaičių");
              }
              sc.nextLine();

              switch (choice) {
                   case 1:
                        show(popularnames);
                        break;
                   case 2:
                        add(sc, popularnames);
                        break;
                   case 3:
                        edit(sc, popularnames);
                        break;
                   case 4:
                        delete(sc, popularnames);
                        break;
                   case 5:
                        System.out.println("Ačiū, kad lankėtės. Iki");
                        shouldgo = false;
                        // System.exit(1);
                        break;
              }
         }
    }
    public static void intro(){
         System.out.println("Pasirinkite, ką norite daryti");
         System.out.println("1. Pamatyti vardus");
         System.out.println("2. Pridėti vardą");
         System.out.println("3. Redaguoti vardą");
         System.out.println("4. Ištrinti vardą");
         System.out.println("5. Išeiti iš programos");
    }
    public static void show(ArrayList<String> popularnames){
         for (int i = 0; i < popularnames.size(); i++) {
              System.out.println((i + 1) + ". " + popularnames.get(i));
         }
    }
    public static void add(Scanner sc, ArrayList<String> popularnames){
         System.out.println("Įveskite vardą");
         popularnames.add(sc.nextLine());
         System.out.println("ačiū, vardas pridėtas");
    }
    public static void delete(Scanner sc, ArrayList<String> popularnames){
         System.out.println("Kelintą vardą norite trinti?");
         int inp = 0;
         while(true){
              try {
                   inp = sc.nextInt();
                   break;
              } catch (Exception e) {
                   sc.nextLine();
                   System.out.println("Įveskite teisingą skaičių");
              }
         }
         sc.nextLine();
         popularnames.remove(inp - 1);
         System.out.println("Vardas sėkmingai pašalintas");
    }
    public static void edit(Scanner sc, ArrayList<String> popularnames) {
         System.out.println("Įveskite vardo numerį, kurį norite redaguoti");
         int pos = 0;
         while (true) {
              try {
                   pos = sc.nextInt();
              } catch (Exception e) {
                   sc.nextLine();
                   System.out.println("Įveskite sąraše esančio vardo skaičių");
                   continue;
              }
              if (pos <= popularnames.size() - 1 && pos > 0){
                   break;
              }
         }
         sc.nextLine();
         System.out.println("Jūs norite redaguoti vardą '" + popularnames.get(pos - 1) + "' pozicijoje " + pos);
         System.out.println("Įveskite vardą");
         popularnames.set(pos - 1, sc.nextLine());
         System.out.println("Ačiū, vardas pridėtas");
    }
}
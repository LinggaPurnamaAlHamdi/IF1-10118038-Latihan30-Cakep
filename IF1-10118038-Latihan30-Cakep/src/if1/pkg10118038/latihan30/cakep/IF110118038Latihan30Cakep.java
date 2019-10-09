/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan30.cakep;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Cakep
 */
public class IF110118038Latihan30Cakep {

    /**
     *@param args the command line arguments
     */
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(RED + "Kamu " + GREEN + "ngerjain sendiri " + YELLOW + "latihan 17 sampe " + BLUE + "latihan 30 ini? ");
        System.out.print(BLUE + "Jawab " + RED + "(Yoi/Enggak) : " + RESET);
        String yoi = sc.nextLine();
        yoi = yoi.toUpperCase();
        
        if(yoi.equals("YOI")) {
            System.out.println(RED + "\nCakep Bener. " + PURPLE + "Good Job");
        
        } else { 
        System.out.println("\n" + RED + "Tetep cakep sih.");
        System.out.println(CYAN + "Sing penting paham konsep nya yee."); 
        System.out.println(RESET + "Keep the code works dude");
       
       }
    }  
}
    

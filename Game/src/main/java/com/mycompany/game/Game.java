
package com.mycompany.game;
import java.util.Scanner;
import java.util.Random;
public class Game {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        Random random = new Random();
                
        //object
    Player hero = new Player();
    Player villain = new Player();
    
    
    hero.name = "Chandra";
    hero.speed = 100;
    hero.healthPoin = 200;
    hero.damage = 20;
    hero.armor = 100;
    
//    if(hero.isDead()){
//        System.out.println("");
//        System.out.println("Game Over Noob ;) ");
    
    
    villain.name = "Vigo";
    villain.speed = 150;
    villain.healthPoin = 200; villain.healthPoin2 = 140;
                              hero.healthPoin2 = 140;
                             villain.healthPoin3 = 60;
                              hero.healthPoin3 = 60;
    villain.damage = 20 ;
    villain.armor = 100;
    
    
    hero.run();
    hero.attack();
    hero.healthPoint();
    villain.run();
    villain.attack();
    villain.healthPoint();
    
    
        hero.defend();
    hero.healthPoint();  
        
        villain.defend(); 
    villain.healthPoint();
    
        villain.defend2(); 
    hero.healthPoint2();

                 
        hero.defend2();
    hero.healthPoint2();  
        
        villain.defend3(); 
    villain.healthPoint3();  
    
        hero.defend3();
    hero.healthPoint3(); 
    
        System.out.println("");
        System.out.println("==========");
        System.out.println("Pilih Salah Satu Untuk Menentukan Pemenangnya Dan Beri Pedang");
        System.out.println("- 1. Jika Chandra Menang Akan Mendamaikan Dunia");
        System.out.println("- 2. Jika Vigo Menang Akan Menguasai Dunia");
        System.out.println("==========");
        System.out.println("");
    
        System.out.println("");
        System.out.println("===========");
    System.out.print("Beri Pedang Kegelapan Antara Salah Satu Opsi Tersebut : ");


        System.out.println("Selamat datang di permainan pemilihan antara dua opsi!");
        System.out.println("Pilih opsi 1 atau 2:");

        int userChoice = scanner.nextInt();

        if (userChoice != 1 && userChoice != 2) {
            System.out.println("Pilihan tidak valid. Hanya pilih 1 atau 2.");
            } if (userChoice == 1 ) {
                System.out.println("Hero Winn! And Villan Has Die");
            } if (userChoice == 2 ) {
                System.out.println("Villain Winn! And Hero Has Die");

        
    }
    
    
        
    }
    }








         
    


    

    
    
    
    

    




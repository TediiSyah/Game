
package com.mycompany.game;

public class Player {
    
    //atribut
    String name, name1;
    int speed, healthPoin,healthPoin2,healthPoin3, damage, damage1, armor, maincharacter, ultimate,pilihan;
            
    
    //method
    void run(){
        System.out.println("_______");
        System.out.println(name+ " is Running ...");
        System.out.println("Speed "+speed);
    }
    void run2(){
        System.out.println("_______");
        System.out.println(name+ " is Running ...");
        System.out.println("Speed "+speed);
    }
    
    void attack(){
       healthPoin-=damage;
        System.out.println("damage "+damage);
//       System.out.println(name+" memberikan damage sebesar "+damage+"Kepada Vigo");
        
        
    }
    void attack1(){
       healthPoin-=damage;
        System.out.println("damage "+damage);
//       System.out.println(name1+" memberikan damage sebesar "+damage+" kepada Chandra");
        
        
    }
 
        
            
    
    void defend(){
        System.out.println("________");
        System.out.println(name+" Sedang Di serang oleh Chandra "+armor);
        System.out.println("armor -20");
//          System.out.println("");
    }

    void attack2(){
        System.out.println("________");
               System.out.println(name+" memberikan damage sebesar "+damage+" kepada Chandra");
               System.out.println();
    }
    
    void attack3(){
        System.out.println("________");
               System.out.println(name+" memberikan damage sebesar "+damage+" kepada Vigo");
    }

    void defend2(){
         System.out.println("_______");
       System.out.println(name+" Sedang Di serang oleh vigo "+armor);
        System.out.println("armor -40");
          }
    void defend3(){
         System.out.println("_______");
       System.out.println(name+" Sedang Di serang oleh vigo "+armor);
        System.out.println("armor -80");
          }
          
       
       void healthPoint(){
              System.out.println("sisa hp "+healthPoin);      
    }
       void healthPoint2(){
              System.out.println("sisa hp "+healthPoin2);  
       }
       void healthPoint3(){
              System.out.println("sisa hp "+healthPoin3);      
    }
//    
       boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
       }
}


            
    
        

        


    


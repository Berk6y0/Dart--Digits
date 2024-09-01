/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Berkay BADANOZ
 */
public class Dart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
           Scanner p= new Scanner(System.in);
        System.out.println("DART GAME");
        System.out.println("Enter the number of darts to be thrown:  ");
       int D=p.nextInt();
        System.out.println("total dart"+D);
        int count=0;
        int dart=1;
       double a =0;
      double b=0; 
        double c=0;
        double d=0;
        double e=0;
        double f=0;
        double u=0;
                
        while(D>count){
            
            System.out.println("Dart  "+dart+": ");  
       double x =(int)((Math.random()*(2)-1)*10);
       double y =(int)((Math.random()*(2)-1)*10);
            
        double sum =(x/10)+(y/10);
         count++;
         double x1 =x/10;
         double y1 =y/10;
                
        if((x1>0 && y1>0)&&sum<1){
            System.out.println("Cordinates: ("+(x/10)+", "+(y/10)+") \nRegion A");
            a++;
        }
         if((x1>0 && y1>0)&&sum>1){
            System.out.println("Cordinates: ("+(x/10)+", "+(y/10)+") \nRegion B");
            b++;
        }
         if((x1<0 && y1>0)){
            System.out.println("Cordinates: ("+(x/10)+", "+(y/10)+") \nRegion C");
            c++;
        }
         if((x1<0 && y1<0)&& x<y){
            System.out.println("Cordinates: ("+(x/10)+", "+(y/10)+") \nRegion D");
            d++;
            
        }
         if((x1<0 && y1<0)&& x>y){
            System.out.println("Cordinates: ("+(x/10)+", "+(y/10)+") \nRegion E");
            e++;
            
    }  
         if((x1>0 && y1<0)){
            System.out.println("Cordinates: ("+(x/10)+","+(y/10)+") \nRegion F");
            f++;
            
    } 
        if((x1<0 && y1<0) && x==y){
            System.out.println("Cordinates: ("+(x/10)+","+(y/10)+")\nRegion: Undecided The line equation x=y is the line between region D and region E. ");
            u++;
        }
          if((x1>0 && y1>0) && (sum==1) ){
            System.out.println("Cordinates: ("+(x/10)+", "+(y/10)+")\nRegion: Undecided The line equation x+y = 1 is the line between region A and region B. ");
             u++;
    }
           if(x1==0 || y1==0){
            System.out.println("Cordinates: ("+(x/10)+","+(y/10)+")\nRegion: Undecided ");
  u++;
   
}
        
              dart ++;
              
  
    }    double a0= ((((a/D)*100)*10));
          double b0=((((b/D)*100)*10));
           double c0=((((c/D)*100)*10));
            double d0=((((d/D)*100)*10));
             double e0=((((e/D)*100)*10));
              double f0=((((f/D)*100)*10));
              double u0= ((((u/D)*100)*10));
              double a1 =(int) a0;
              double b1 =(int) b0;
              double c1 =(int) c0;
              double d1 =(int) d0;
              double e1 =(int) e0;
              double f1 =(int) f0;
              double u1 =(int) u0;
             
             
        System.out.println("Reginion istatistic:");
        int ax=(int) a;
        int bx=(int) b;
        int cx=(int) c;
        int dx=(int) d;
        int ex=(int) e;
        int fx=(int) f;
        int ux=(int) u;
        
       switch(ax){           case 1:
           System.out.println("A: "+ax+" dart (%"+a1/10+")");
     break;
       default: System.out.println("A: "+ax+" darts (%"+a1/10+")");
       }
      switch(bx){           case 1:
           System.out.println("B: "+bx+" dart (%"+b1/10+")");
     break;
       default: System.out.println("B: "+bx+" darts (%"+b1/10+")");
       }  switch(cx){           case 1:
           System.out.println("C: "+c+" dart (%"+c1/10+")");
     break;
       default: System.out.println("C: "+cx+" darts (%"+c1/10+")");
       }  switch(dx){           case 1:
           System.out.println("D: "+dx+" dart (%"+d1/10+")");
     break;
       default: System.out.println("D: "+dx+" darts (%"+d1/10+")");
       }  switch(ex){           case 1:
           System.out.println("E: "+ex+" dart (%"+e1/10+")");
     break;
       default: System.out.println("E: "+ex+" darts (%"+e1/10+")");
       }  switch(fx){           case 1:
           System.out.println("F: "+fx+" dart (%"+f1/10+")");
     break;
       default: System.out.println("F: "+fx+" darts (%"+f1/10+")");
       }
          switch(ux){           case 1:
           System.out.println("Undecided: "+ux+" dart (%"+u1/10+")");
     break;
       default: System.out.println("Undecided: "+ux+" darts (%"+u1/10+")");
               
       }
        
        
        
        
}
}
    


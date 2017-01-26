import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
        System.out.println("Hi Guys! :)");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader p = new BufferedReader(r);
        System.out.println("Enter height of triangle:");
        int num =0;
        try{
            num=Integer.valueOf(p.readLine());
        }
        catch(Exception j){
            System.out.println("Invalid Number!");

        }
        for(int l=1; l<=num; l++){
            for( int j=1; j<num -(l-1); j++){
                System.out.print(" ");
            }
            for( int u=1; u<=l; u++){
                System.out.print("*");
                for( int u1=1; u1<l; u1+=l){
                System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
}
import java.util.Scanner;

public class Train{
    public static void main(String[] args){
        System.out.println("Hello Universe");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name here");
        int a = s.nextInt();

        if( a < 18){
            System.out.println("You are not yet of age to be an astronaut");
        }else if( a >= 18 && a < 27 ){
            System.out.println("You are almost there, continue the good work");
        }else if( a >= 27 && a < 65){
            System.out.println("Congratulations!!! You are an astronaut!!\nNow make a difference in the Universe");
            int t = 3;
            while(t>0){
                if(t==3){
                    System.out.println("You just went and orbited the earth for the first time");
                }else if(t==2){
                    System.err.println("You just went to the moon, and came back");
                }else{
                    System.out.println("Congratulations! you just came back from your mission to mars");
                }
                t = t - 1;
            }
        }else{
            System.out.println("Enjoy your retirement mate, get into farming or something like that, you deserve the rest");
        }

        

    }
}
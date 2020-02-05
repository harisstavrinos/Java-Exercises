package exercise26;

public class DiagonalStar {

    public static void printSquareStar(int number){

        if (number<5)
            System.out.println("Invalid Value");
        else{
            int temp;
            for(int i=1; i<=number;i++){
                if (i==1||i==number){
                    for(int j=1; j<=number;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    continue;
                }
                for(int j=1; j<=number;j++){
                   // temp=(number%2==0)?i:number-i+1;
                    if(j==i||j==number-i+1||j==1||j==number)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }

        }
    }
}
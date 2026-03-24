import java.util.Scanner;
    public class alistamento{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do(a) recruta:");
            String nome = scanner.nextLine ();
            System.out.println("Olá," + nome + "!");

            System.out.println("Digite o seu peso:");
            double peso = scanner.nextDouble();
            System.out.println("Seu peso é:" + peso + "kg");

            if(peso < 50){
                System.out.println("Você está abaixo do peso ideal para o alistamento!");
                }else if(peso >= 50 && peso <= 100){
                    System.out.println("Você está no peso ideal para o alistamento!");
                }else {
                    System.out.println("Você está acima do peso ideal para o alistamento");

                }   
            scanner.close();     
                } 


                
            }
            
            
        
        
    


import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("\nDigite a coordenada da abscissa do plano: ");
        int coorX = Integer.parseInt(input.nextLine());

        System.out.print("\nDigite a coordenada da ordenada do plano: ");
        int coorY = Integer.parseInt(input.nextLine());
        
        String quadrante = apresentaQuadrante(coorX, coorY);

        System.out.print("\nO par ordenado ("+coorX+","+coorY+") está no "+quadrante+"\n\n");

    }

    static String apresentaQuadrante(int x, int y){
        Scanner input = new Scanner(System.in);

          if(x >= 0 && y >= 0){
            return "primeiro quadrante.";

        } else if (x < 0 && y >= 0){
            return "segundo quadrante.";

        } else if (x < 0 && y < 0){
            return "terceiro quadrante.";

        } else {
            return "quarto quadrante.";
        }
    }
    
}


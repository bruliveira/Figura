import java.util.Scanner;

public class Testar {
    public static void main(String[] args) {
        /*Resposta letra C:
        - Tem polimorfismo por exemplo nas classes retangulo e triangulo
        que herdam o metodo calculaArea, mas em ambos terá um calculo diferente.
        - Encapsulamento temos por exemplo nossos metódos get e set em cada classe
         * 
        */
        
        System.out.println("--------> Figuras Geometricas");        
        Scanner teclado = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo();
        Retangulo retangulo1 = new Retangulo();
        
        

        /* --- Ler pelo teclado
        System.out.println("-------------- Triângulo ---------------");
        System.out.printf("Digite o valor da base:");
        triangulo1.setBase(teclado.nextDouble());
        System.out.printf("Digite o valor da altura:");
        triangulo1.setAltura(teclado.nextDouble());
        */
        //Triângulo
        triangulo1.setBase(4);
        triangulo1.setAltura(5);
        triangulo1.verifica(); //Verifica se os valores digitados são positivos

        //Retângulo
        retangulo1.setBase(4);
        retangulo1.setAltura(8);

        
        //Mostra a área de ambos
        System.out.println("Área do triângulo: " + triangulo1.calculaArea());
        System.out.println("Área do retângulo: " + retangulo1.calculaArea());
        
        GerenteDeFiguras gerente1 = new GerenteDeFiguras();
        GerenteDeFiguras gerente2 = new GerenteDeFiguras();
        gerente1.calculaAreaToral(triangulo1);

        //Gerente - Calcula retangulo e triangulo
        System.out.println("Area total - G1: " + gerente1.calculaAreaToral(triangulo1 ));
        //System.out.println("Area total - G2: " + gerente2.calculaAreaToral());
        

    }
}

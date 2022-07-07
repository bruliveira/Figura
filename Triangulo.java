import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {
    Scanner teclado = new Scanner(System.in);
    private double base;
    private double altura;

    
    @Override
    //Tem polimorfismo aqui, nesta classe e na de Retangulo, ambos herdam
    //o metodo calculaArea.
    public double calculaArea() {
        return (this.base * this.altura)/2;
    }
    //Verifica se os valores digitados são positvos
    public void verifica(){
        while( this.base < 0 || this.altura < 0){
            System.out.println("Por favor, digite apenas valores positivos");
            if(this.base< 0){
                System.out.printf("Base postiva, please:");
                this.base = teclado.nextDouble();
            }else{
                System.out.printf("Altura postiva, please:");
                this.altura = teclado.nextDouble();
            }
        }
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    

}

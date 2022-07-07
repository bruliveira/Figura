public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;


    

    @Override
    public double calculaArea() {
        // TODO Auto-generated method stub
        return this.base * this.altura;
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

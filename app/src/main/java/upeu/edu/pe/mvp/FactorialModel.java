package upeu.edu.pe.mvp;

public class FactorialModel implements Main.Model{
    private Main.Presentador presentador;

    public FactorialModel(Main.Presentador presentador){
        this.presentador= presentador;
    }
    @Override
    public void calcularFactorial(String n) {
        int fac = 1;
        if(!n.equals("")){
            //calculo del factorial
            int x = Integer.parseInt(n);
            for(int i=1;i<=x;i++){
                fac = fac*i;
            }
            presentador.mostrarResultado(String.valueOf(fac));
        }else{
            //mostrar mensaje
        }
    }
}

package upeu.edu.pe.mvp;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
    }
    public interface Presentador{
        public void mostrarResultado(String r);
        public void calcularFactorial(String n);
    }
    public interface Model{
        public void calcularFactorial(String n);
    }
}

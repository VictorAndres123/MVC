
package mvcjava;

public class Controlador {

    private Modelo modeloCalculadora;
    private Vista vistaCalculadora;
   
    public Controlador(Modelo modeloCalculadora, Vista vistaCalculadora) {
        this.modeloCalculadora = modeloCalculadora;
        this.vistaCalculadora = vistaCalculadora;
    }
    
    public void realizarSuma() {
        int num1 = vistaCalculadora.getNumero1();
        int num2 = vistaCalculadora.getNumero2();
        
        int resultado = modeloCalculadora.sumar(num1,num2);
        
        vistaCalculadora.setResultado(resultado);
        
    }
    
    public void realizarResta() {
        int num1 = vistaCalculadora.getNumero1();
        int num2 = vistaCalculadora.getNumero2();
        
        int resultado = modeloCalculadora.resta(num1,num2);
        
        vistaCalculadora.setResultado(resultado);
        
    }
    
    
    
}

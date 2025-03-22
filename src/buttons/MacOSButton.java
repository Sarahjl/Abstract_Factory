package buttons;

// Classe concreta (Produtos) 
// Classe onde é implementado a interface 'Button' para criar um botão específico 
// para o MacOS, ou seja, vai implementar o método 'paint()' à sua maneira.
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

package buttons;

// Classe concreta 
// Classe onde é implementado a interface 'Button' para criar um botão específico 
// para o Windows, ou seja, vai implementar o método 'paint()' à sua maneira.
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

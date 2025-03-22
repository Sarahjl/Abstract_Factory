package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

// Fábrica concreta, que implementa e cria objetos específicos para o MacOS
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton(); // Cria e retorna um botão específico para MacOS
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox(); // Cria e retorna um checkbox específico para MacOS
    }
}

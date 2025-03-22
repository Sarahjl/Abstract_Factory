package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;


public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton(); // Cria e retorna um botão específico para Windows
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox(); // Cria e retorna um checkbox específico para Windows
    }
}

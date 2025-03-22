package factories;

import buttons.Button;
import checkboxes.Checkbox;

// GUIFactory é uma fábrica abstrata, onde define quais produtos uma fábrica concreta tem que criar
// Essa interface é importante, pois permite que as fábricas criem diferentes tipos de botões 
// e checkbox sem especificar as classes concretas.

public interface GUIFactory {
    Button createButton(); // cria um botão 
    Checkbox createCheckbox(); // cria um checkbox
}

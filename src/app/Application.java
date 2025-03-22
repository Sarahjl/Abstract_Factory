package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

// A classe representa a aplicação que usa a fábrica para criar produtos
// Não sabe quais classes concretas está utilizando, trabalhando só com as interfaces

public class Application {
    private Button button;
    private Checkbox checkbox;

    // O construtor recebe uma fábrica como parâmetro e usa para criar objetos usando a fábrica passada
    public Application(GUIFactory factory) {
        button = factory.createButton(); // cria botão
        checkbox = factory.createCheckbox(); // cria checkbox
    }

    public void paint() {
        // Exibe criação
        button.paint();
        checkbox.paint();
    }
}

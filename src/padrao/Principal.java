package padrao;

import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

// Classe que configura a aplicação e decide qual fábrica será usada
// Identifica qual sistema operacional está sendo utilizado e seleciona a fábrica correta
public class Principal {

    // Método que configura a aplicação e decide qual fábrica deve ser usada com base no sistema operacional
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(); // Adquiri o sistema usado
        
        // Caso seja MacOS executa
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        // Se não, é Windows
        } else {
            factory = new WindowsFactory();
        }
        
        // Cria a aplicação com a fábrica escolhida
        app = new Application(factory);
        return app;
    }
    
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    } 
}
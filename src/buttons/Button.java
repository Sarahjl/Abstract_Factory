package buttons;

// Interface é como um contrato que define um conjunto de métodos que as classes devem implementar
// Criada uma interface 'Button', é definido um método chamado 'paint()', então
// qualquer classe que implementar essa interface precisa dar uma implementação 
// para 'paint()', porém cada qual à sua maneira
public interface Button {
    void paint(); // É dever de todas as classes concretas de botão implementar esse método
}
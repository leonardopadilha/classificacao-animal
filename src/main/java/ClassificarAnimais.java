import classificacao.Animais;

public class ClassificarAnimais {
    public static void main(String[] args) {
        Animais animais = new Animais();
        System.out.println(animais.tipoAnimais("vertebrado", "mamífero", "herbívoro"));
    }
}
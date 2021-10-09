package classificacao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimaisTest {

    @Test
    @DisplayName("Águia")
    public void testRetornoAnimalAguia() {
        String aguia = Animais.tipoAnimais("vertebrado", "ave", "carnívoro");
        assertEquals("Águia", aguia);
    }

    @Test
    @DisplayName("Pomba")
    public void testRetornoPomba() {
        String pomba = Animais.tipoAnimais("vertebrado", "ave", "onívoro");
        assertEquals("Pomba", pomba);
    }

    @Test
    @DisplayName("Homem")
    public void testRetornoHomem() {
        String homem = Animais.tipoAnimais("vertebrado", "mamífero", "onívoro");
        assertEquals("Homem", homem);
    }

    @Test
    @DisplayName("Vaca")
    public void testRetornoVaca() {
        String vaca = Animais.tipoAnimais("Vertebrado", "Mamífero", "herbívoro");
        assertEquals("Vaca", vaca);
    }

    @Test
    @DisplayName("Pulga")
    public void testRetornoPulga(){
        String pulga = Animais.tipoAnimais("invertebrado", "inseto", "hematófago");
        assertEquals("Pulga", pulga);
    }

    @Test
    @DisplayName("Lagarta")
    public void testRetornoLagarta() {
        String lagarta = Animais.tipoAnimais("invertebrado", "inseto", "herbívoro");
        assertEquals("Lagarta", lagarta);
    }

    @Test
    @DisplayName("Sanguessuga")
    public void testRetornoSanguessuga(){
        String sanguessuga = Animais.tipoAnimais("invertebrado", "anelídeo", "hematófago");
        assertEquals("Sanguessuga", sanguessuga);
    }

    @Test
    @DisplayName("Minhoca")
    public void testRetornoMinhoca() {
        String minhoca = Animais.tipoAnimais("invertebrado", "anelídeo", "onívoro");
        assertEquals("Minhoca", minhoca);
    }

    // Cenários baseados na Estratégia de Teste Array Ortogonal

    @Test
    @DisplayName("Classificação incorreta")
    public void testRetornoClassificacaoIncorreta() {
        String classificacaoIncorreta = Animais.tipoAnimais("invertebrado", "mamífero", "carnívoro");
        assertEquals("Informe uma classificação correta", classificacaoIncorreta);
    }
}
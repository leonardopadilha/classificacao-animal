package classificacao;

public class Animais {
    public static String tipoAnimais(String classificacao, String tipo, String especie) {
        if (classificacao.equalsIgnoreCase("vertebrado")) {
            if (tipo.equalsIgnoreCase("ave")) {
                if (especie.equalsIgnoreCase("carnívoro")) {
                    return "Águia";
                }else if(especie.equalsIgnoreCase("onívoro")) {
                    return "Pomba";
                }
                return "Informe uma espécie de animal correta";
            }else if (tipo.equalsIgnoreCase("mamífero")) {
                if(especie.equalsIgnoreCase("onívoro")) {
                    return "Homem";
                }else if(especie.equalsIgnoreCase("herbívoro")) {
                    return "Vaca";
                }
            }
            return "Informe um tipo de animal correto";
        } else if (classificacao.equalsIgnoreCase("invertebrado")) {
            if (tipo.equalsIgnoreCase("inseto")) {
                if (especie.equalsIgnoreCase("hematófago")) {
                    return "Pulga";
                }else if(especie.equalsIgnoreCase("herbívoro")) {
                    return "Lagarta";
                }
            }else if (tipo.equalsIgnoreCase("anelídeo")) {
                if (especie.equalsIgnoreCase("hematófago")) {
                    return "Sanguessuga";
                }else if(especie.equalsIgnoreCase("onívoro")) {
                    return "Minhoca";
                }

            }
        }
        return "Informe uma classificação correta";
    }
}

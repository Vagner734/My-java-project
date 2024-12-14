public class Notas {
    Double nota1;
    Double nota2;
    Double nota3;
    Double peso1;
    Double peso2;
    Double peso3;

public double calcularMedia() { // "calcular":
    if (nota1 == null) || (nota2 == null) || (nota3 == null) ) {
        return -1; //ou lança uma execeção, dependendo da logica desejada 
    }
    double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)
    return media;
    }

public String getSituacao() { // "Situação":
    double media = calcularMedia();
    if (media >= curso.getMediaAprovacao()) {
        return "APROVADO"; //"APROVADO"
    } else if (media >= curso.getMediaRecuperacao()) { //"curso";
         return "EM RECUPERACAO"; // "EM RECUPERACAO"
    } else {
        return "REPROVADO"; //"REPROVADO"
    }
}
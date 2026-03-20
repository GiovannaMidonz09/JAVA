package org.example.intemediario.dezX;

import org.example.intemediario.dezX.model.Ninja;
import org.example.intemediario.dezX.model.Uchiha;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.idade = 18;
        naruto.mostrarInformacoes();

        Uchiha sasuke = new Uchiha();
        sasuke.idade = 25;
        sasuke.nome = "Sasuke";
        sasuke.mostrarInformacoes();
        sasuke.mostrarHabilidadeEspecial();
    }
}

package com.desafiosstarcode.desafios_starcode.controllers;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.desafiosstarcode.desafios_starcode.models.DesafioDetalhe;


@Controller
public class DesafioController {

    @GetMapping("/desafio001")
    public String desafio(Model model) {
        List<String> descricao = new ArrayList<>();

        descricao.add("Criptografia é uma técnica de segurança que transforma dados em um código secreto, chamado de texto cifrado, para protegê-los de roubo, alteração ou comprometimento. A chave criptográfica, um conjunto de valores matemáticos, é a única forma de desbloquear os dados criptografados.");
        descricao.add("A criptografia pode ser usada para proteger dados em repouso, em trânsito ou em uso. Por exemplo, pode ser utilizada para proteger dados pessoais e de pagamento, senhas, comunicações online como e-mails e transações bancárias, backups contra acesso indevido etc.");

        DesafioDetalhe desafio = new DesafioDetalhe(
            1,
            "Sistema de Criptografia",
            descricao,
            "Basicamente o sistema deverá ser responsivo a qualquer tipo de escrita. Converta as 26 letras do alfabeto por números e forme um texto onde cada letra corresponda com o número de acordo com sua ordem / posição.",
            "/desafio001-criptografado"
        );

        model.addAttribute("desafio", desafio);
        
        return "desafio";
    }

    @PostMapping("/desafio001-criptografado")
    public String desafioCriptografado(@ModelAttribute DesafioDetalhe desafio, Model model) {
        
        List<String> descricao = new ArrayList<>();

        descricao.add("Criptografia é uma técnica de segurança que transforma dados em um código secreto, chamado de texto cifrado, para protegê-los de roubo, alteração ou comprometimento. A chave criptográfica, um conjunto de valores matemáticos, é a única forma de desbloquear os dados criptografados.");
        descricao.add("A criptografia pode ser usada para proteger dados em repouso, em trânsito ou em uso. Por exemplo, pode ser utilizada para proteger dados pessoais e de pagamento, senhas, comunicações online como e-mails e transações bancárias, backups contra acesso indevido etc.");

        desafio.setNumero(1);
        desafio.setTitulo("1 - Sistema de Criptografia");
        desafio.setDescricao(descricao);
        desafio.setObjetivo("Basicamente o sistema deverá ser responsivo a qualquer tipo de escrita. Converta as 26 letras do alfabeto por números e forme um texto onde cada letra corresponda com o número de acordo com sua ordem / posição.");
        desafio.setUrl("/desafio001-criptografado");
        
        var fraseCriptografada = criptografar(desafio.getFrase());

        desafio.setFraseCriptografada(fraseCriptografada);
        
        model.addAttribute("desafio", desafio);
        
        return "desafio";
    }

    public String criptografar(String frase) {

        frase = frase.toUpperCase();

        String fraseCriptografada = "";
        Dictionary<String, String> dEquiv = new Hashtable();

        dEquiv.put("A", "01");
        dEquiv.put("B", "02");
        dEquiv.put("C", "03");
        dEquiv.put("D", "04");
        dEquiv.put("E", "05");
        dEquiv.put("F", "06");
        dEquiv.put("G", "07");
        dEquiv.put("H", "08");
        dEquiv.put("I", "09");
        dEquiv.put("J", "10");
        dEquiv.put("K", "11");
        dEquiv.put("L", "12");
        dEquiv.put("M", "13");
        dEquiv.put("N", "14");
        dEquiv.put("O", "15");
        dEquiv.put("P", "16");
        dEquiv.put("Q", "17");
        dEquiv.put("R", "18");
        dEquiv.put("S", "19");
        dEquiv.put("T", "20");
        dEquiv.put("U", "21");
        dEquiv.put("V", "22");
        dEquiv.put("W", "23");
        dEquiv.put("X", "24");
        dEquiv.put("Y", "25");
        dEquiv.put("Z", "26");

        dEquiv.put("1", "27");
        dEquiv.put("2", "28");
        dEquiv.put("3", "29");
        dEquiv.put("4", "30");
        dEquiv.put("5", "31");
        dEquiv.put("6", "32");
        dEquiv.put("7", "33");
        dEquiv.put("8", "34");
        dEquiv.put("9", "35");
        dEquiv.put("0", "36");

        dEquiv.put(" ", "37");
        dEquiv.put("Â", "38");
        dEquiv.put("Ã", "39");
        dEquiv.put("Á", "40");
        dEquiv.put("À", "41");
        dEquiv.put("É", "42");
        dEquiv.put("Ê", "43");
        dEquiv.put("Í", "44");
        dEquiv.put("Ó", "45");
        dEquiv.put("Õ", "46");
        dEquiv.put("Ô", "47");
        dEquiv.put("Ú", "48");
        dEquiv.put("Ç", "49");

        for (int i=0; i<frase.length(); i++) {
            var c = frase.substring(i, i+1);
            if (((Hashtable) dEquiv).containsKey(c))
                fraseCriptografada += dEquiv.get(c);
        }

        return fraseCriptografada;
    }
}

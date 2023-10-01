package br.senac.tads.ado1.curriculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/curriculo")
public class CurriculoController {
    @GetMapping("/getCurriculo")
    public ModelAndView saudar2() {
        ModelAndView mv = new ModelAndView("Curriculo");
        mv.addObject("nome", "Nicolas da Cruz Marques");
        mv.addObject("skil", "HTML, CSS, Javascript, React");
        mv.addObject("email", "nicolasdacruzmarques@gmail.com");
        mv.addObject("telefone", "(11) 97050-9991");
        mv.addObject("idade", "30 Anos");
        mv.addObject("civil", "Casado");

        mv.addObject("objetivo", "Profissional com excelentes habilidades de comunicação e solida experiência na área de BackOffice. Capaz de executar\n" +
                "múltiplas tarefas simultâneas, garantindo a eficiência da rotina operacional.\n" +
                "Estudante de Análise e Desenvolvimento de Sistemas com interesse pela área de TI. Grande disposição para o\n" +
                "aprendizado e a aplicação de conhecimentos e habilidades interpessoais no âmbito profissional, buscando crescimento\n" +
                "constante.\n" +
                "\n");
        mv.addObject("qualificacao", "Habilidades excelentes no atendimento a clientes.\n" +
                "\n" +
                "Ponto forte: Adaptabilidade, Flexibilidade, Agilidade, Inovação, Planejamento e Organização.\n" +
                "\n" +
                "Profissional dinâmico, comunicativo, fácil relacionamento interpessoal, foco no cliente e trabalho em equipe.\n" +
                "\n" +
                "Domínio de informática - Windows, Office, Excel e Internet\n" +
                "\n" +
                "Facilidade para comunicação oral e escrita\n");
        mv.addObject("cursos", " Mecanica de Precisão - Senai " +
                "Análise e Desenvilvimento de Sistemas - Senac" + "\n Certificação em Database Design pela Oracle\n" +
                "Certificação em Foundations pela Oracle");

        mv.addObject("experiencia", "08/2018 \n" +
                "Supervisor de Operação, ATENTO S.A");

        mv.addObject("github", "https://github.com/Nimarques");




        return mv;
    }

}

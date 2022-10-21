import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        curso1.setTitulo ("Curso java");
        curso1.setDescricao ("Curso java muito bom");
        curso1.setCargaHoraria (40);

        mentoria1.setTitulo ("Mentoria de JAva");
        mentoria1.setDescricao ("Mentoria JavaScript");
        mentoria1.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(mentoria1);


    }
}
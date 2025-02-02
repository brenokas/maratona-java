package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        //Comentário para testar o GIT
        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 40;
        professor.sexo = 'F';

        System.out.printf("Nome: %s%nIdade: %d%nSexo: %c", professor.nome, professor.idade, professor.sexo);
    }
}

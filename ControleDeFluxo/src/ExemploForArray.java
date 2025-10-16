public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //length == Tamanho
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        //Imprime o numero do indice de cada aluno
        //O aluno no indice x=0 é FELIPE
        //O aluno no indice x=1 é JONAS
        //O aluno no indice x=2 é JULIA
        //O aluno no indice x=3 é MARCOS

        for (String aluno: alunos){
            System.err.println("Nome do aluno é:"+aluno);
        }
        //Nome do aluno é:FELIPE
        //Nome do aluno é:JONAS
        //Nome do aluno é:JULIA
        //Nome do aluno é:MARCOS
    }
}

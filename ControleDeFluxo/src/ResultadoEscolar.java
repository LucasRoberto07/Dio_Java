public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.9;

        /* 
        if (nota>=7 ){
            System.err.println("O aluno está Aprovado");
        }else if (nota>= 5 && nota< 7) {
            System.err.println("O aluno está em Recuperação");
        }else{
            System.err.println("O Aluno está Reprovado");
        }
        */
        
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação": "Reprovado";
        System.err.println(resultado);
            
    }
}

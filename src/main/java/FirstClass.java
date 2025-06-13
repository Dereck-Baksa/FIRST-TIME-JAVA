public class FirstClass {
    public static void main(String[] args) {
        System.out.println("hello java world");

// tipos que mais
        String nome = "Dereck";
        Integer idade = 19;
        Double altura = 1.84;
        Boolean bloqueado = false;



        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos de idade, minha altura e " + altura + " estou feliz por estar aqui." );

        exibirSoma(10.0,6.0);
        exibirSub(2.0,1.0);
        exibirDivisao(10.0,5.0);
        exibirMultiplicacao(10.0,5.0);
        exibirPotencia(2.0,3.0);
        // exibirSomaComNome(10.0,9.0,nome);
    }

static void exibirSoma(Double a, Double b){
        Double soma = a + b ;
    System.out.println(" A soma de " + a + " + " +  b  + " é igual a " + soma);

}

static void exibirSub(Double a, Double b){
        Double sub = a - b ;
System.out.println(" A sub de " + a + " - " +  b  + " é igual a " + sub);

}
static void exibirDivisao(Double a,Double b){
        Double divisao = a / b;
    System.out.println(" A divisão de " + a + " e " + b + " e igual a " + divisao);
}

static void exibirMultiplicacao(Double a,Double b){
        Double multiplicacao = (a * b);
    System.out.println(" A multiplicação de " + a + " e " + b + " é igual a " + multiplicacao) ;

}
static void exibirPotencia(Double a,Double b){
        Double potencia = Math.pow(a, b);
    System.out.println(" O número " + a + " potenciado a " + b + " é igual a " + potencia );
}

//    static void exibirSomaComNome(Double a, Double b, String nome){
//        Double soma = a + b ;
//        System.out.println("A soma é " + soma + " e quem solicitou foi o " + nome);
//
//    }






}
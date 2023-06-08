# Exercicio 1
Scanner sc = new Scanner(System.in);
int x;

System.out.println("Digite um número inteiro: ");
x = sc.nextInt();

if (x > 0) {
    System.out.println("O número é positivo!");
} else if (x < 0) {
    System.out.println("O número é negativo!");
} else {
    System.out.println("O número digitado é ZERO. Zero, é um número neutro.");
}
# Exercicio 2
Scanner sc = new Scanner(System.in);
int x;
System.out.println("Digite um número inteiro:");

x = sc.nextInt();

if (x % 2 == 0) {
    System.out.println("O número " + x + " é par.");
} else {
    System.out.println("O número " + x + " é ímpar.");
}
}

# Exercicio 3
Scanner sc = new Scanner(System.in);

int a, b;
System.out.println("Digite o primeiro número inteiro:");
a = sc.nextInt();
System.out.println("Digite o segundo número inteiro:");
b = sc.nextInt();

if (a % b == 0 || b % a == 0) {
    System.out.println("São Multiplos");
} else {
    System.out.println("Não Multiplos");
}

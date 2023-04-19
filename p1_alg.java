import java.util.Locale;
public class p1_alg {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int y = 32;
		String nome = "Star";
		int idade = 32;
		double renda = 4000.0;
		System.out.println(y);
		double x = 10.4536785;
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		System.out.println("Resultado= "+y+"M");
		System.out.printf("Resultado= %.2f %.4f\n M", x, x);
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais\n", nome, idade, renda); //%s - string %d - n.inteiro
	}
}

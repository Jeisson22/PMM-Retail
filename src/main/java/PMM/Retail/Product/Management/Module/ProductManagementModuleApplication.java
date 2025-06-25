package PMM.Retail.Product.Management.Module;

import Model.E1_FizzBuzz;
import Model.E2_Anagrama;
import Model.E3_SucesionFibonacci;
import Model.E4_NumeroPrimo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductManagementModuleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementModuleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Data");
		//E1_FizzBuzz e1FizzBuzz = new E1_FizzBuzz("fizz", "buzz");
		//boolean resultado = E2_Anagrama.sonAnagramas("Amor","Roma");
		//System.out.println(resultado);

		E3_SucesionFibonacci generator = new E3_SucesionFibonacci();
		List<Integer> sucesion = generator.generarSucesionHasta(50);

		System.out.println("Sucesión de Fibonacci hasta el límite: " + sucesion);


		E4_NumeroPrimo primos = new E4_NumeroPrimo();
		List<Integer> listaPrimos = primos.numeroPrimo(1,100);

		listaPrimos.forEach(primo -> System.out.println("Número primo: " + primo));
	}
}

package metaprogramacao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflexao {

	public static void refletirObjeto(Object objeto, Class<?> classe)
			throws IllegalArgumentException, IllegalAccessException {
		System.out.println("========================================");
		System.out.println("===============CLASSE================");
		System.out.println("Nome da Classe: " + classe.getName());
		System.out.println("Nome da classe (simples): " + classe.getSimpleName());
		System.out.println("Nome canonical: " + classe.getResource(classe.getName()));

		System.out.println("Tipo: " + classe.getTypeName());
		System.out.println("========================================");
		System.out.println("===============ATRIBUTOS================");

		Field[] atributos = classe.getDeclaredFields();
		for (Field f : atributos) {
			f.setAccessible(true);
			if (! f.getType().isPrimitive())
				f.set(objeto, "Alterado em tempo de execução");
			System.out.println(f.getName() + ": " + f.getType().getTypeName() + " Valor: " + f.get(objeto));
		}

		System.out.println("========================================");
		System.out.println("===============METODOS================");

		Method[] metodos = classe.getDeclaredMethods();
		for (Method m : metodos) {
			System.out.println(m.getName() + " - Parametros: " + Arrays.toString(m.getParameterTypes()) + " - Retorno: "
					+ m.getReturnType().getSimpleName());
		}

	}

}

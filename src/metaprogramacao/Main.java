package metaprogramacao;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		DividasParceladas divida = new DividasParceladas();

		divida.setNomeDivida("Dentista");
		divida.setDescricaoDivida("Facetas de resina");
		divida.setTotaldeParcelasDivida(11);
		divida.setQuantidadeParcelasPagasDivida(2);
		divida.setValorDivida(6750.00);
		divida.lerDividaParcelada();

		Reflexao.refletirObjeto(divida, DividasParceladas.class);

	}

}

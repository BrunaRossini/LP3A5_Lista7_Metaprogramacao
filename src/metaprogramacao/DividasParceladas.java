package metaprogramacao;

public class DividasParceladas {

	private String nomeDivida;
	private String descricaoDivida;
	private double valorDivida;
	private int totaldeParcelasDivida;
	private int quantidadeParcelasPagasDivida;

	public DividasParceladas(String nomeDivida, String descricaoDivida, double valorDivida, int totaldeParcelasDivida,
			int quantidadeParcelasPagasDivida) {

		this.nomeDivida = nomeDivida;
		this.descricaoDivida = descricaoDivida;
		this.valorDivida = valorDivida;
		this.totaldeParcelasDivida = totaldeParcelasDivida;
		this.quantidadeParcelasPagasDivida = quantidadeParcelasPagasDivida;
	}

	public DividasParceladas() {
	};

	public String getNomeDivida() {
		return nomeDivida;
	}

	public void setNomeDivida(String nomeDivida) {
		this.nomeDivida = nomeDivida;
	}

	public String getDescricaoDivida() {
		return descricaoDivida;
	}

	public void setDescricaoDivida(String descricaoDivida) {
		this.descricaoDivida = descricaoDivida;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getTotaldeParcelasDivida() {
		return totaldeParcelasDivida;
	}

	public void setTotaldeParcelasDivida(int totaldeParcelasDivida) {
		this.totaldeParcelasDivida = totaldeParcelasDivida;
	}

	public int getQuantidadeParcelasPagasDivida() {
		return quantidadeParcelasPagasDivida;
	}

	public void setQuantidadeParcelasPagasDivida(int quantidadeParcelasPagasDivida) {
		this.quantidadeParcelasPagasDivida = quantidadeParcelasPagasDivida;
	}

	public int parcelasRestantes() {
		int totalParcelasRestantes = 0;
		totalParcelasRestantes = totaldeParcelasDivida - quantidadeParcelasPagasDivida;
		return totalParcelasRestantes;

	}

	public double valorPorParcela() {
		double valorPorParcela;
		valorPorParcela = valorDivida / totaldeParcelasDivida;
		return valorPorParcela;
	}

	public double valorRestante() {
		double valorRestante;
		valorRestante = valorPorParcela() * parcelasRestantes();
		return valorRestante;
	}

	public void lerDividaParcelada() {
		System.out.println("Dados do objeto: ");
		System.out.println("Divida{" + "\n" + "Nome = " + nomeDivida + "\n" + "Descrição = " + descricaoDivida + "\n"
				+ "Valor = " + valorDivida + "\n" + "Total de Parcelas = " + totaldeParcelasDivida + "\n"
				+ "Parcelas Pagas = " + quantidadeParcelasPagasDivida + "\n" + "}");
		System.out.println("Parcelas Restantes: " + parcelasRestantes() + "\n" + "Valor por parcela: "
				+ valorPorParcela() + "\n" + "Valor Restante: " + valorRestante());
	}

}

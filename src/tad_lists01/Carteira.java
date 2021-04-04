/*1. Criem uma nova classe chamada Carteira (deve estar em um novo arquivo chamado Carteira.java).
    Essa classe deve conter como atributo no mínimo uma lista simplesmente encadeada
    da classe SinglyLinkedList.
    Também deve conter no mínimo os métodos abaixo que devem trabalhar na lista interna da
    classe Carteira:
         adicionarCartao (podem usar internamente os métodos addFirst ou addLast da 
         SinglyLinkedList, a sua escolha)
         removerCartao (podem usar internamente os métodos removeFirst,
         pois é o unico metodo implementado até o momento na SinglyLinkedList)
         ... entre outros a escolha de voces, por exemplo, para imprimir o conteúdo da carteira.

	2. Após criar cada cartão, realize algumas operações de compra e pelo menos um pagamento
	em cada um, imprimindo o seu conteúdo ao final.
 */
package tad_lists01;

import CreditCards.*;
import net.datastructures.*;

public class Carteira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardGratuito cartao01 = new CreditCardGratuito("Cartao01", "California Savings", "abcd 1234 5668 6666");
		S028_aula01_creditcard_v02.printSummary(cartao01);
		cartao01.charge(200.0);
		cartao01.charge(100.0);
		cartao01.charge(200.0);
		cartao01.makePayment(100.0);
		S028_aula01_creditcard_v02.printSummary(cartao01);
		System.out.println("");

		CreditCardPlatinum cartao02 = new CreditCardPlatinum("Cartao02", "Banco Inter", "1234 5678 9000 0000");
		S028_aula01_creditcard_v02.printSummary(cartao02);
		cartao02.charge(400.0);
		cartao02.charge(200.0);
		cartao02.charge(700.0);
		cartao02.makePayment(350.0);
		S028_aula01_creditcard_v02.printSummary(cartao02);
		System.out.println("");

		CreditCardRewards cartao03 = new CreditCardRewards("Cartao03", "Banco Nubank", "9876 5678 9000 9090");
		S028_aula01_creditcard_v02.printSummary(cartao03);
		cartao03.charge(500.0);
		cartao03.charge(600.0);
		cartao03.charge(900.0);
		cartao03.makePayment(390.0);
		S028_aula01_creditcard_v02.printSummary(cartao03);
		System.out.println("");

		CreditCardTop cartao04 = new CreditCardTop("Cartao04", "Banco do Brasil", "5678 5678 3456 0000");
		S028_aula01_creditcard_v02.printSummary(cartao04);
		cartao04.charge(1000.0);
		cartao04.charge(3900.0);
		cartao04.charge(2200.0);
		cartao04.makePayment(2190.0);
		S028_aula01_creditcard_v02.printSummary(cartao04);
		System.out.println("");

		SinglyLinkedList<S028_aula01_creditcard_v02> listA1T3 = new SinglyLinkedList<S028_aula01_creditcard_v02>();
		System.out.println("");
		System.out.println("Adicionando cartoes e impriminto lista listA1T3");
		listA1T3.addLast(cartao01); // cc gratuito
		listA1T3.addLast(cartao02); // cc platinum
		listA1T3.addFirst(cartao03); // cc rewards
		listA1T3.addLast(cartao04); // cc top
		System.out.println(listA1T3);
		System.out.println("");
		System.out.println("Aplicando metodo 'removeFirst' - apagado cartao03"); // remove cartao03, adicionado na
																					// posicao first
		listA1T3.removeFirst();
		System.out.println("");
		System.out.println("Imprimindo a lista novamente");
		System.out.println(listA1T3);
	}

}

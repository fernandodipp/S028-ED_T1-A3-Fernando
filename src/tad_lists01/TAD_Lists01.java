/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_lists01;

// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;
import CreditCards.*;

/**
 *
 * @author brandg
 */
public class TAD_Lists01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SinglyLinkedList<Integer> testsingle = new SinglyLinkedList<Integer>();
        testsingle.addLast(1);
        testsingle.addLast(2);
        testsingle.addLast(3);
        System.out.println(testsingle);
        
        DoublyLinkedList<Integer> testdouble = new DoublyLinkedList<Integer>();
        testdouble.addLast(1);
        testdouble.addLast(2);
        testdouble.addLast(3);
        System.out.println(testdouble);
        
        DoublyLinkedList<CreditCardGratuito> testCards;
        testCards = new DoublyLinkedList<CreditCardGratuito>();
        testCards.addLast(new CreditCardGratuito("Fernando", "Nubank", "99999"));
        testCards.addLast(new CreditCardGratuito("Luigi", "Inter", "888888"));
        testCards.addLast(new CreditCardGratuito("Dipp", "Banrisul", "777777"));
        System.out.println(testCards);
        
        
    }
    
}

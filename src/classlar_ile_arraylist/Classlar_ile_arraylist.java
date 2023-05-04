/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classlar_ile_arraylist;
import java.util.ArrayList;
/**
 *
 * @author melek
 */
public class Classlar_ile_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Customer> customers=new ArrayList<Customer>(); //new arraylist of customer
        //arraylistin türü olarak class adını verdik
        customers.add(new Customer(1, "Engin","Demiroğ"));//new dediğimiz için heap bellekte bir referans numarasıyla tutuldu
        customers.add(new Customer(2,"melek", "yilmaz"));//aynı şekilde

        customers.remove(new Customer(2,"melek", "yilmaz"));//tekrar new dediğimiz için farklı bir referans numarası tanımlayıp onu sildi

        Customer engin=new Customer(3," mert", "fırat");
        customers.remove(3); //listeden merti silecek

        for(Customer customer:customers){
            System.out.println(customer.firstName); //sonuçta engin ve melek isimlerini döndürecek
        }
        
        
    }
    
}

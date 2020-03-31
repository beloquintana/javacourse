package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    private String name;
    private String address;
    private List<Product> productsList;

    public Company(String name, String address){
        this.name = name;
        this.address = address;
        productsList = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public String getMostExpensiveProduct(){
        double priceAux = productsList.get(0).getPrice();
        int index= 0;
        for(int i=1;i<productsList.size();i++){
            if(productsList.get(i).getPrice() > priceAux){
                index = i;
                priceAux = productsList.get(i).getPrice();
            }
        }
        return productsList.get(index).getName();
    }

    public List<String> getProductByCostMoreThan(double price){
        List<String> auxList = new ArrayList<String>();
        for(int i=0;i<productsList.size();i++){
            if(productsList.get(i).getPrice() > price){
                auxList.add(productsList.get(i).getName());
            }
        }
        return auxList;
    }

    public static void main(String arg[]){
        double basePrice = 51;
        Product product1 = new Product("laptop", 500.0, 1);
        Product product2 = new Product("pc", 5000.0, 2);
        Product product3 = new Product("camara", 50.0, 3);
        Product product4 = new Product("monitor", 18.0, 4);
        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        Company company = new Company("Google", "EUA");
        company.setProductsList(productList);

        System.out.println("El producto mas caro de la empresa " + company.getName() + " es "
                + company.getMostExpensiveProduct());
        System.out.println("Los productos que cuestan mas de " + basePrice + " son "
                + company.getProductByCostMoreThan(basePrice));
    }

}

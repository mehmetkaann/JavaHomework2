
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus laptop",
				3000, 2, "siyah");
		//oduct.name = "Laptop";
		//oduct.setId(1);
		//oduct.description ="asus laptop";
		//prduct.stockAmount=3;
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		
System.out.println(product.getKod());		

	}

}
 
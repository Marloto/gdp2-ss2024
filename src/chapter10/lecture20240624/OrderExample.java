package chapter10.lecture20240624;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Article {
	TSHIRT1, TSHIRT2, SOCKS, WALLET
}

class Order {
	int quantity;
	double price;
	Article article;
	String currency;

	public Order(Article article, int quantity, double price, String currency) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.article = article;
		this.currency = currency;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}

public class OrderExample {
	public static void main(String[] args) {
		List<String> orders = Arrays.asList("TSHIRT1;3;10.00;EUR", "TSHIRT2;4;15,00;EUR", "SOCKS;1;7.00;EUR",
				"WALLET;4;5.0;EUR", "WALLET2;7;6.5;EUR", "SOCKS;x;6.00;EUR");

		
		
		List<String> articles = Arrays.asList(Article.values()).stream()
				.map(el -> el.toString())
				.toList();
		orders.stream()
		
			.map(el -> el.split(";"))
			.filter(el -> articles.contains(el[0]))
			.filter(el -> isInteger(el[1]))
			.filter(el -> isDouble(el[2]))
			.map(el -> {
			try {
				Article a = Article.valueOf(el[0]);
				int quantity = Integer.valueOf(el[1]);
				double price = Double.valueOf(el[2]);
				String currency = el[3];
				return new Order(a, quantity, price, currency);
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		});
	}
    
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
        
    }
    
    public static boolean isDouble(String s) {
        
        try { 
            Double.parseDouble(s); 
        } catch(NumberFormatException e) { 
            return false; 
        }
        return true;
        
    }
}

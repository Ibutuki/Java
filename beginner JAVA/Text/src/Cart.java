
public class Cart {
	String num;
	int price;
	int amount;
	public Cart(String num, int amount) {
		super();
		this.num = num;
		this.amount = amount;
	}
	public Cart() {
		super();
	}
	public void setNum(String num){
		this.num = num;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
}

package steam.demo.entites;

public class Software {
	private Long id;
	private String name;
	private double price;
	private String creator;
	
	public Software(Long id) {
		
	}
	
	public Software(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void callMe(String neshto) {
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Software [id=" + id + ", name=" + name + ", price=" + price + ", creator=" + creator + "]";
	}
	
	
	
}

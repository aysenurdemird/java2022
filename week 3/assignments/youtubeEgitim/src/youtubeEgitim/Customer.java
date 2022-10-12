package youtubeEgitim;

public class Customer {

	//özellik tutucu class
	//bir class sadece bir işi yapabilir. tek classta hem özellik tutma hem operasyon tutma doğru değildir
	
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	
	private int id;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

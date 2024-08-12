class AdharCard{
	long adharNumber;
	String name;
	String address;
	AdharCard(){
		this.adharNumber=323828889830L;
		this.name="Krishna";
		this.address="West Bengal, Haldia";	
	}
	public static void main(String[] args) {
		AdharCard ad=new AdharCard();
		System.out.println(ad.adharNumber);
		System.out.println(ad.name);
		System.out.println(ad.address);	
	}
}
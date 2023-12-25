package com.example.demo.entity;



import javax.persistence.*;



@Entity
@Table(name="vechicle")
public class Vechicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "veh_id")
	private long id;

	@Column
	private String category;
	
	@Column(name = "plate_number")
	private String plateNumber;

	@Column
	private String manufacturer;
	

	@Column
	private String type;
	

	@Column(name = "registration_date")
	private String registrationDate;

	@Column(name = "premiumAmount")
	private double premiumAmount;

    @Column(name="next_premium_date")
    private String nextPreDate;

    @Column(name="previous_premium_date")
    private String previousPreDate;

    @Column
    private int pendingFines;
    
	@OneToOne
	@JoinColumn(name = "insurance_id")
	private Insurance insurance;

	@ManyToOne
	 @JoinColumn(name = "user_id")
	//@JoinTable(name = "vehicle_user", joinColumns = { @JoinColumn(name = "veh_id") }, inverseJoinColumns = {
	//		@JoinColumn(name = "user_id") })
	public User user;

	public Vechicle() {
		super();
	}

	public Vechicle(long id, String category, String plateNumber, String manufacturer, String type,
			String registrationDate, double premiumAmount, String nextPreDate, String previousPreDate, int pendingFines,
			Insurance insurance, User user) {
		super();
		this.id = id;
		this.category = category;
		this.plateNumber = plateNumber;
		this.manufacturer = manufacturer;
		this.type = type;
		this.registrationDate = registrationDate;
		this.premiumAmount = premiumAmount;
		this.nextPreDate = nextPreDate;
		this.previousPreDate = previousPreDate;
		this.pendingFines = pendingFines;
		this.insurance = insurance;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getNextPreDate() {
		return nextPreDate;
	}

	public void setNextPreDate(String nextPreDate) {
		this.nextPreDate = nextPreDate;
	}

	public String getPreviousPreDate() {
		return previousPreDate;
	}

	public void setPreviousPreDate(String previousPreDate) {
		this.previousPreDate = previousPreDate;
	}

	public int getPendingFines() {
		return pendingFines;
	}

	public void setPendingFines(int pendingFines) {
		this.pendingFines = pendingFines;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vechicle [id=" + id + ", category=" + category + ", plateNumber=" + plateNumber + ", manufacturer="
				+ manufacturer + ", type=" + type + ", registrationDate=" + registrationDate + ", premiumAmount="
				+ premiumAmount + ", nextPreDate=" + nextPreDate + ", previousPreDate=" + previousPreDate
				+ ", pendingFines=" + pendingFines + ", insurance=" + insurance + ", user=" + user + "]";
	}

	
}

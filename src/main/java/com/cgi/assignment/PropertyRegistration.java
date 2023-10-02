package com.cgi.assignment;

public class PropertyRegistration {

	private String typeOfProperty;
	private double area;
	private String location;
	private double expectedPrice;
	private String sellerName;

	public PropertyRegistration(String typeOfProperty, double area, String location, double expectedPrice,
			String sellerName) {
		this.typeOfProperty = typeOfProperty;
		this.area = area;
		this.location = location;
		this.expectedPrice = expectedPrice;
		this.sellerName = sellerName;
	}

	public boolean registerProperty() {
		if (isValidData()) {
			// Perform registration logic here (e.g., store in a database)
			return true;
		} else {
			System.out.println("Error: Invalid property data. Registration failed.");
			return false;
		}
	}

	private boolean isValidData() {
		return isValidTypeOfProperty(typeOfProperty) && isValidArea(area) && isValidLocation(location)
				&& isValidExpectedPrice(expectedPrice) && isValidSellerName(sellerName);
	}

	// Validation methods (you can add more specific validation logic as needed)
	private boolean isValidTypeOfProperty(String type) {
		return type != null && !type.isEmpty();
	}

	private boolean isValidArea(double area) {
		return area >= 0 && area <= 999999;
	}

	private boolean isValidLocation(String location) {
		return location != null && !location.isEmpty();
	}

	private boolean isValidExpectedPrice(double price) {
		return price >= 0;
	}

	private boolean isValidSellerName(String name) {
		return name != null && !name.isEmpty();
	}
}

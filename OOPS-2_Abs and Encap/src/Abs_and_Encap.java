
public class Abs_and_Encap {
	
		// Private member variables
		private String customerId;
		private String customerName;
		private long contactNumber;
		private String address;
		
		//For showing Abstraction
		public void payBill(double totalPrice, double discount) {
			System.out.println("Calculating final amount to be paid.....");
			double priceAfterDiscount = totalPrice * (1 - (discount / 100));
			System.out.println("Hi " + customerName
					+ ", your final bill amount after discount is "
					+ (int) (priceAfterDiscount * 100) / 100.0);
		}

		// Public getter and setter methods
		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public long getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}

	class Tester {

		public static void main(String args[]) {
			Abs_and_Encap customer = new Abs_and_Encap();

			customer.setCustomerId("C101");// Setting values of the instance variables using setter methods
			customer.setCustomerName("Jack");
			customer.setContactNumber(9870345687L);
			customer.setAddress("D089, St. Louis Street, Springfield");

			System.out.println("Displaying Customer Details");// Displaying values of the instance variables using getter methods
			System.out.println("Customer Id : " + customer.getCustomerId());
			System.out.println("Customer Name : " + customer.getCustomerName());
			System.out.println("Contact Number : " + customer.getContactNumber());
			System.out.println("Address : " + customer.getAddress()+"\n");
			
			customer.payBill(1000,5);
		}
	}

	


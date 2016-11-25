package oop.InterfaceT;



public class Test {
	public static void main(String[] args) {
		Bank bank = new Nabil();
		Bank  nicAsia= new NicAsia();
		Bank standChart = new StandChart();
		
		printBankInfo(bank);
		printBankInfo(nicAsia);
		printBankInfo(standChart);

 	
	
	}
	
	
	@SuppressWarnings("static-access")
	public static void printBankInfo(Bank bank){
		System.out.println("Bank Name:"+ bank.getBankName());
		System.out.println("Service Rate"+ bank.serviceChargeRate);
		System.out.println("*****************************");
	}

}

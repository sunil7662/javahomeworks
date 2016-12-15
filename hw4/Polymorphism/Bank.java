package Polymorphism;

public class Bank {
	int getInterestRate(){
		return 0;
	}
	public static void main(String[] args) {
		Bank abc = new Bank_ABC();
		Bank xyz = new Bnak_XYZ();
		
		System.out.println(abc.getInterestRate());
		System.out.println(xyz.getInterestRate());
		
	}
}

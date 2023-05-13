package Abstractions_Concept02_Interface_MultipleInheritenance;

public class FinancialCenter implements AtmBanking,MobileBankig, OnlineBanking {
	
	//multiple inheritance (by using "implements keyord")
	
 public void close() {
System.out.println("We can close an account at the FinancialCenter");
 }
 public void access() {
	 System.out.println("We can access the safety deposit box at the FinancialCenter"); 
 }
public void open() {
	 System.out.println("Client can open a new account by using OnlineBanking"); 
}
public void apply() {
	 System.out.println("Client can apply for a new credit card by using OnlineBanking"); 
}
public void check() {
	 System.out.println("We can check our balance from MobileBankig "); 
}
public void transfer() {
	 System.out.println("We can tansfer money by using Zelle from MobileBankig"); 	
}
public void activation() {
	 System.out.println("Client can do activation of a new Debit card by AtmBanking"); 
}
public void deposit() {
	 System.out.println("We can depost cash or check by AtmBanking"); 
}
public void withdraw() {
	 System.out.println("Client can withdraw money anytime by using AtmBanking"); 
}
 
}

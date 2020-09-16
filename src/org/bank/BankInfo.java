package org.bank;

public class BankInfo extends AxisBank {
public void saving() {
	System.out.println(" savings: 1300");
}
public void fixed() {
	System.out.println(" fixed: 123");
}
public static void main(String[] args) {
	BankInfo comp = new BankInfo();
	comp.saving();
	comp.fixed();
	comp.deposit();
}}

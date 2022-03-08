package com.tns.client;

import com.tns.application.*;
//import com.tns.framework.*;

public class Client 
{
	public static void main(String[] args) 
	{
		
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(101, "Avatar", 1000, true);
		gssfactory.getNewNormalAccount(201, "John", 1000, 50);
				
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(1000);
		
		gsprime.toString();
				
		GSNormalAcc gsnormal = new GSNormalAcc(); 
		gsnormal.getAccNm();
		gsnormal.getAccNo();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		
		gsnormal.bookProduct(1000);
		
		gsnormal.toString();
	
	}

}

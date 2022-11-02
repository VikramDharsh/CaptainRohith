package com.xworkz.Vikram;

import com.xworkz.dharsh.J10C;
import com.xworkz.dharsh.J10CWarJet;

public class J10CRunner {
	public static void main(String[] args)
	{
		J10C f35=new J10C();
f35.getType(); // accesing the private specified variable of different package //we can only read it cant modify in another class of different package

J10CWarJet f35WarJet= new J10CWarJet();
f35WarJet.geName();

	}
}

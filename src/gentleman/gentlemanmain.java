package gentleman;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class gentlemanmain {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	
		
		ChromeDriver maindriver = new ChromeDriver();
		maindriver.get("https://www.wahylab.com/gendemo/");
		
		
		
	/*	gentlemanlogin obj1 = new gentlemanlogin(maindriver);
		obj1.log();
		
		gentlemandash obj2=new gentlemandash(maindriver);
	    obj2.bfr();
		obj2.dash();
		obj2.aft();*/
		
		gentlemanuserlist obj3 = new gentlemanuserlist(maindriver); // passed
		obj3.bfrusr();
		//obj3.usrlist();
		//obj3.usrafm();
		
		/*gentlemanvendors obj4 = new gentlemanvendors(maindriver);//passed
		obj4.venbfm();
		obj4.ventest();
		obj4.aftvenpay();*/
		
	 /*  gentlemanvendorpayment obj5= new gentlemanvendorpayment(maindriver);//passed
		obj5.vendpaybfm();
		obj5.testvendpay();
		obj5.aftvenpay();
		
		gentlemanpurchase obj6 = new gentlemanpurchase(maindriver); //passed
		obj6.purcbfm();
		obj6.purctst();
		obj6.aftpur();
		
		gentlemanROP obj7 = new gentlemanROP(maindriver);//passed
		obj7.rop();
		obj7.aftrop();
		
		gentlemanitemcategory ob8 = new gentlemanitemcategory(maindriver); //passed
		ob8.tstic();
		ob8.aftic();
		
		gentlemanitems ob9 = new gentlemanitems(maindriver); // pased
		ob9.gitst();
		ob9.aftgi();
		
		gentlemandesignation ob10 = new gentlemandesignation(maindriver); // passed
		ob10.tstdsg();
		ob10.aftdsg();
		
		gentlemanemployeedetails obj11 = new gentlemanemployeedetails(maindriver); // passed
		obj11.tstemp(); 
		obj11.aftge();
		
		gentlemanConsumptionReport obj12 = new gentlemanConsumptionReport(maindriver); //passed
		obj12.tstcr();
		obj12.aftcr();
		
		gentlemanmasterconsumption obj13 = new gentlemanmasterconsumption(maindriver); //passed
		obj13.tstmc();
		obj13.aftmc();*/

		/*gentlemanglobalstock obj14 = new gentlemanglobalstock(maindriver);//passed
		obj14.tstgs();
		obj14.aftgs();
		
		gentlemanoutofstock obj15 = new gentlemanoutofstock(maindriver); //passed
		obj15.tstoos();
		obj15.aftoos();
		
		gentlemanstockrequest obj16 = new gentlemanstockrequest(maindriver);//passsed
		obj16.tstsr();
		obj16.aftsr();
		
		
		gentlemanbranchtobranch obj17 = new gentlemanbranchtobranch(maindriver);//passed
		obj17.tstbb();
		obj17.afbb();
		
		gentlemanbranchreturn obj18 = new gentlemanbranchreturn(maindriver);//passed
		obj18.tstbranchreturn();
		obj18.aftbr();
		
		gentlemanreports obj19 = new gentlemanreports(maindriver); // passed
		obj19.tstrep();
		obj19.aftrep();
		
		gentlemanadminreport obj20= new gentlemanadminreport(maindriver); //passed
		obj20.tstadminrep();
		obj20.aftadm();
		
		gentlemanopeningstock obj21 = new gentlemanopeningstock(maindriver); //passed
		obj21.tstos();
		obj21.aftos();*/
		
		/*gentlemanpurchasestock obj22 = new gentlemanpurchasestock(maindriver); //passed
		obj22.tstps();
		obj22.aftps();*/
		
		gentlemanpurchasereturn obj23 = new gentlemanpurchasereturn(maindriver);//passed
		obj23.tstpr();
		obj23.aftpr();
		
		
		
		
		
		
		
		
		

	}

}

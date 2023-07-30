//comment
//Comments means-It is not read by the computer it is just visible who is seen the code to understand it 
//Comments-two type
//single line-//
class suticase{
   public static void main(String[] args){
//We declare the variable with datatype int 
	   int suticase1=1000;
	   int suticase2=6000;
	   int suticase3=7939;
	   int total=suticase1+suticase2+suticase3;
	   System.out.println(total);
	   String chips=getschipspacket(50);
	   System.out.println(chips);
   }
   static String getschipspacket(int cash){
	   if(cash<10){
		   return "Please give me minimum 10rupees";
	   }
	   else{
		   int packets=cash/10;
		   int remainingmoney=cash%10;
		   return "Take "+packets+" Thank you and your remainingmoney is "+remainingmoney;
	   }
   }
}

//multi line commwnts
/*     
------
------ mutliline comments start with(/*) end wuth (*/)
-----
---
--  */







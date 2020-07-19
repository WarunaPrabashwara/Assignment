import scala.io.StdIn.readLine
import scala.io.StdIn.readInt


object assignment extends App
    {

val text = readLine("enter your string");
println("press 1 to encrypt 2 to decrypt :");
val choice = readInt()
println("how many numbers do you want to shift (enter positive numbers,negative will give errors) :");
val s = readInt()
if ( choice == 1){
    encrypt(text,s)
}
else{
    if(choice == 2){
        decrypt(text ,s);
    }
    else{
        println("your choice s wrong");
    }
}



        def encrypt(text : String , s :Int) ={
            var result: String = "" ;
            var len = text.length();
            for  ( i:Int <- 0 to len-1 )
                {
                    if((text.charAt(i)).isUpper) 
		        	{
			    		result = result + ((text.charAt(i)+s-65)%26  +65).toChar ; 
			        	}
			       
		        	

                   else
		            
			 	        {
				        	result = result + ((text.charAt(i)+s-97)%26 +97).toChar; 			 		
				        }

		 
	            	
		
	            } 
            println("Encryppted message = " + result );

                }


  def decrypt(text : String , s :Int) ={
            var result: String = "" ;
            var len = text.length();
            for  ( i:Int <- 0 to len-1 )
                {
                    if((text.charAt(i)).isUpper) 
		        	{ if (text.charAt(i)-s-65 < 0)
			        	{
			    		result = result + ((text.charAt(i)-s-65)%26 +(26 +65)).toChar ; 
			        	}
			        else
			    	{
			    		result = result + ((text.charAt(i)-s-65)%26 +65).toChar ; 			 		
			    	 }

		        	}

                   else
		            { if (text.charAt(i)-s-97 < 0)
		        		{
				    	result = result + ((text.charAt(i)-s-97)%26 +26 +97).toChar; 
			        	}
			         else
			 	        {
				        	result = result + ((text.charAt(i)-s-97)%26 +97).toChar; 			 		
				        }

		 
	            	}
		
	            } 
            println("decryppted message = " + result );

                }








        }










    
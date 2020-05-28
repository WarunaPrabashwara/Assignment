object takehomesalary extends App{

def normal(hours :Int)Int ={
           return (150*hours)
                               } 

def ot(hours : Int)Int ={
               return (75*hours)
                              } 

  def  takehomesalary(normal: Int, ot:Int) ={
              print ("your takehome salary is" +(normal+ot)*0.9) 
                     } 

takehomesalary( normal(40),ot(10))
}

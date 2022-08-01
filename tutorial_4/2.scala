object scala_4 extends App{
    print("Enter the number= ")
    var x=scala.io.StdIn.readInt()

    def function1(x:Int):String= x match{
        case x if x>0 => "highter than zero"
        case x if x<0|| x==0 =>"lesser than zero or equal to zero"
    }
    
    def function2(x:Int):String=x%2 match{
        case y if y==1  => "Odd number"
        case y if y==0 => "Even number"
    }
    println(function1(x))
    println(function2(x))
}
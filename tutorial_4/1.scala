object scala_1 extends App{
    def Interest(deposit:Double):Double = deposit match{
        case x if x< 20000 => x*0.02
        case x if x< 200000 => x*0.04
        case x if x< 2000000 => x*0.035
        case x if x> 200000 =>x*0.065
    }
    print("Enter the deposit amount: ")
    val x=scala.io.StdIn.readInt()
    printf("Interest= %.2f",Interest(x))

}
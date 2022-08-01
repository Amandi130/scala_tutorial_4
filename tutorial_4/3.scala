object scala_5 extends App{
    def toUpper(x:String):String=x.toUpperCase()
    def toLower(x:String):String=x.toLowerCase()
    def formatName(name:String)(func:String=>String):String=func(name)

    println(formatName("Bunny")(toUpper(_)))
    println(formatName("Niroshan".substring(0,2))(toUpper(_))+formatName("Niroshan".substring(2,8))(toLower(_)))
    println(formatName("Saman")(toLower(_)))
    println(formatName("Kumara".substring(0,1))(toUpper(_))+formatName("Kumara".substring(1,5))(toLower(_))+formatName("Kumara".substring(5,6))(toUpper(_)))
}

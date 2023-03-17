fun main() {
    var a:Int = -3
    
    while(a<=2){
        
        var b:Int = 0
        while(b<=a+1){
            print("Inner While Loop <-> ")
            b++
            println()
        }
        
        println("Outer While Loop ")
        a++
        println()
        
    }
 
}

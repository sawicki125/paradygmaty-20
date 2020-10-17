object Lab2 {
 def total(listA:List[Double]):Double =
  {
    def totalRec(listL:List[Double], currentTotal:Double):Double =
      if (listL == Nil) currentTotal
      else totalRec(listL.tail, currentTotal*listL.head)
    if (listA == Nil) 0
    else totalRec(listA, 1.0)
   }                                              //> total: (listA: List[Double])Double
   
   
   total(Nil)                                     //> res0: Double = 0.0
   total(List(3.0, 1.0, 2.0)) == 6.0              //> res1: Boolean = true
   total(List(3.0)) == 3.0                        //> res2: Boolean = true
   total(List(3.0, 1.0, 2.5)) == 7.5              //> res3: Boolean = true
   
   def stringParser(listA:List[String], separator:String, ending:String):String =
   {
    def stringParserRec(listB:List[String], currentString:String, separator:String):String =
      if (listB == Nil) currentString
      else stringParserRec(listB.tail, currentString+separator+listB.head, separator)
      if (listA == Nil) ""
      else stringParserRec(listA.tail, listA.head, separator) + ending
    }                                             //> stringParser: (listA: List[String], separator: String, ending: String)String
                                                  //| 
    
    stringParser(List("Ala","ma","kota"), " ", ".") == "Ala ma kota."
                                                  //> res4: Boolean = true
    stringParser(Nil, " ", ".") == ""             //> res5: Boolean = true
    stringParser(List("la", "aaaaa","ppppa"), "---", "!") == "la---aaaaa---ppppa!"
                                                  //> res6: Boolean = true
          
}
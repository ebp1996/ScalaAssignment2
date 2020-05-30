object companyXYZ extends App {

  def workingHour(hours:Int):Int=hours*150

  def otHour(hours:Int):Int=hours*75

  def income(h1:Int,h2:Int):Int=workingHour(h1)+otHour(h2)

  def tax(income:Int):Double=income*.1

  def takeHomeSalary(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))



 println( takeHomeSalary(2,5))

}

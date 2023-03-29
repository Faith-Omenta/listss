fun main() {
    val familyList=family(listOf("Omenta","Naom","Kemunto","Kwamboka","Edwin","Bonvick","Geneviev","Darlene","Lindsay","Faith"))
    println(familyList)
    var height=height(listOf(58.0,10.3,76.0,65.0))
    println(height)

    creatpersonList()
    creatCarList()
     }
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun family(family:List<String>):String{
    val family2 = family.filterIndexed{index,family->index % 2==0}
    return family2.toString()
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class Average(var average:Double,var total:Double)

fun height(height:List<Double>):Average{
    var average=height.average()
    var height=height.sum()
    var total=Average(average,height)
    return total
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun creatpersonList(){
    val person1=Person("Philis",30,5.8,85.8)
    val person2=Person("Melvin",26,5.3,60.7)
    val person3=Person("Darline",24,5.4,82.6)
    val person4=Person("Glenah",28,5.8,78.9)

    val descending= listOf(person1,person2,person3,person4)
    val sorted=descending.sortedByDescending{person->person.age}
    println(sorted)
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class Perso(var name:String,var age:Int,var height:Double,var weight:Double)


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Double)

fun creatCarList(car:List<Double>):Average {
    val car1 = Car("KBC 234", 30.0)
    val car2 = Car("KCD 534", 26.0)
    val car3 = Car("KBK 767", 24.0)
    val car4 = Car("KBE 654", 28.0)
    val car= listOf(car1,car2,car3,car4)
    return car
}




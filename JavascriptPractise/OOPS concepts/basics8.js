class Person{
    age = 25;
    //Using getter
    get location()
    {
        return "cannada"
    }

    //Constructur is a method which executes by 
    //default you create object of class.

    constructor(FirstName, LastName)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    constructor(){
        return "this is construction";
    }

    fullName(){
        console.log(this.FirstName+ this.LastName);
    }
}

let person = new Person("Tim","Jo  ");
let person1 = new Person("Sanjith", "H M")

console.log(person.age);

console.log(person.location);
 
console.log(person.fullName());
console.log(person1.fullName());
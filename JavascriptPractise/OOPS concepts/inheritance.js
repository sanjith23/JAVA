const Person = require("./basics8");

class pet extends Person
{
    get location()
    {
        return "Bluecross"
    }
    constructor(Firstname, Lastname)
    {
        //Call parent class constructor
        super(Firstname, Lastname)
    }

}

let dogname = new pet("SRK","Raone")

// console.log(dogname.location());
dogname.fullName()
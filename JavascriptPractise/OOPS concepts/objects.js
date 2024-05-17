let input = 'name'

let alien = {
    name: "sanjith", 
    technology: "JS",
    'work exp': 4
}

console.log(alien)

//Two ways to fetch the values from the objects.
//One is dot operator

console.log( alien.technology)
console.log(alien.name)

//Another is square bracket
console.log(alien['name'])
console.log(alien['technology'])
console.log(alien['work exp'])

console.log(alien[input])
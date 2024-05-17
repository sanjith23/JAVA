let alien = {
    name : 'Sanjith',
    tech : 'JS',
    laptop : {
        cpu1 : 'i7',
        ram : 4,
        brand : 'Asus'
    }
}

console.log(alien)

console.log(alien.laptop.cpu?.length)

//delete property
delete alien.tech;

console.log(alien)


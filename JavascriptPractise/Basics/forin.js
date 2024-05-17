let alien = {
    name : 'Sanjith',
    tech : 'JS',
    laptop : {
        cpu1 : 'i7',
        ram : 4,
        brand : 'Asus'
    }
}

//to fetch the keys
for(let key in alien)
    {
        console.log(key)
    }


//To fetch all the key and values
for(let key in alien){
    console.log(key, alien[key]);
}

//To fetch the key and values for laptop
for(let key in alien.laptop){
    console.log(key)
}

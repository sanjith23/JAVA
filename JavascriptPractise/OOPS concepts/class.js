class product{
    constructor(name, price){
        this.name = name;
        this.prie = price;
    }

    displayproduct(){
        console.log(`Product : ${this.name}`);
        console.log(`Price: ${this.prie}`);
    }

    CalculateTotal(salestax){
        return this.price + (this.price * salestax);
    }
}

const salestax = 0.05;

const product1 = new product("Shirt", 20.00);
const product2 = new product("pants", 22.33);
const Product3 = new product("Shoes", 100);

product1.displayproduct();
product2.displayproduct();

const total = product1.CalculateTotal(salestax);
console.log(`Total price (with tax:) $${total.toFixed(2)}`);
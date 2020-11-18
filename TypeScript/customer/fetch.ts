import { Customer } from "./customer";
import { Address } from "./customer";
var customer= new Customer(1,'pawan');
console.log(customer.getId);
console.log(customer.getId());
customer.setName("Abhishek");
console.log(customer.getName())

var address= new Address("Chembur");
console.log(address.getAddress());


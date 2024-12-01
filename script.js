// Q2 

const randomNumbers = Array.from({ length: 10 }, () => Math.floor(Math.random() * 1000) + 1);

randomNumbers.forEach((num, index) => console.log(`Number ${index + 1}: ${num}`));

let sum = 0;
for (let i = 0; i < randomNumbers.length; i++) {
    sum += randomNumbers[i];
}

console.log("Sum of the array:", sum);



// Q3 
const navbar = document.querySelector('.navbar');
if (navbar) {
  navbar.remove();
  console.log('removed successfully.');
}

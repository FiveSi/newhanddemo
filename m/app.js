const express = require("express")
const app = express()
const fs = require("fs")
const port = 3001
const abc = fs.readFileSync('index.html', 'utf-8')
let number1 = Math.floor(Math.random() * (100) + 1);
console.log(number1)
app.get('/', (req, res) => {
   let a =  req.query
   console.log(parseInt(a.hi))
   if (parseInt(a.hi) > number1) {
       console.log('you is big')
       let chang = abc.replace('{%hi%}', `You Number  ${parseInt(a.hi)} is so big`)
       res.send(chang);


   }else if (parseInt(a.hi) < number1){
    console.log('you is small')
    let chang = abc.replace('{%hi%}', `You Number  ${parseInt(a.hi)} is so small`)
    res.send(chang);


   }else if (parseInt(a.hi) === number1) {
    console.log('WIN')
    console.log('try again')
    let chang = abc.replace('{%hi%}', 'YOU A WIN,let play a new game')
    res.send(chang);

   }else {
    console.log('play game')
    let chang = abc.replace('{%hi%}', 'HI let play game');
    res.send(chang);

   }


})
app.get('/restart', (req, res) =>  {
    let number1 = Math.floor(Math.random() * (100) + 1);
    console.log(number1);
    res.redirect('/'); 
})
app.listen(port, () => {
    console.log(`port is ${port}.. http://localhost:3001/`)
})
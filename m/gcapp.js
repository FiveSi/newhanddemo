const express = require("express")
const app = express()
const fs = require("fs")
const port = 3002
const abc = fs.readFileSync('guesschar.html', 'utf-8')
//////////
let b = "abcdefghijklmnopqrstvwxyz"
const charData = b.split("")
let char1 = Math.floor(Math.random() * (25) + 0);
let charGen = charData[char1]
console.log(charGen);
///////////////////
let i = 6

app.get('/', (req, res) => {
    
   let youGuess =  req.query
   let youBig = youGuess.hi

   if (i > 0) {
    console.log(charGen);
        if (youBig != charGen) {
       console.log('wrong')
       let chang = abc.replace('{%hi%}', `You Char ${youBig} is wrong`)
       res.send(chang);
       console.log(i);
       i--;
       
   }else if (youBig = charGen) {
    console.log('WIN')
    console.log('try again')
    let chang = abc.replace('{%hi%}', 'YOU A WIN,let play a new game')
    res.send(chang);

   }
}

else {
    console.log('LOSE');
    let chang = abc.replace('{%hi%}', 'YOU A LOSER,let play a new game')
    res.send(chang);
}
})
app.get('/restart', (req, res) =>  {
     i = 6;
    console.log(i);
    console.log(i);
    char1 = Math.floor(Math.random() * (25) + 0);
    charGen = charData[char1]
    console.log(charGen);
    res.redirect('/'); 
})
app.listen(port, () => {
    console.log(`port is ${port}.. http://localhost:3002/`)
})


// if (i = 6) {
//     console.log(charGen);
//         if (youBig != charGen) {
//        console.log('wrong')
//        let chang = abc.replace('{%hi%}', `You Char ${youBig} is wrong`)
//        res.send(chang);
//        console.log(i);
//        i--;


// else if (i = 6) {
//     console.log('play game')
//     let chang = abc.replace('{%hi%}', 'HI let play game');
//     res.send(chang);
//    }
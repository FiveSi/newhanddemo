let list = [];
let r = 49;
for (i = 1; i < 50; i++) {
  list[i-1] = i;
}
for (i = 0; i < 6; i++) {
  let o = Math.floor(Math.random() * r);
  console.log(list[o]);
  list.splice(o, 1);
  r--;
}

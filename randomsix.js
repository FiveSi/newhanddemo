let list = [];
for (i = 1; i < 50; i++) {
  list[i-1] = i;
}
for (i = 0; i < 6; i++) {
  let o = Math.floor(Math.random() * 50);
  console.log(list[o]);
  list.splice(o, 1);
}

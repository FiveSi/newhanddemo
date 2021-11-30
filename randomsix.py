import random
bloxk = [0,17,22,26,38,44,8,2,14,30,41,42,44,22,10,28,36,39,47,48,44]
for i in range(6):
  o = random.randrange(50)
  while o in bloxk:
    o = random.randrange(50)
  print(o)
  bloxk.append(o)

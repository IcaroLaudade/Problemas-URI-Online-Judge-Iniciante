import math

numero=int(raw_input())
contapos=(1+math.sqrt(5))/2
contaneg=(1-math.sqrt(5))/2
formula=(math.pow(contapos,numero)-math.pow(contaneg,numero))/math.sqrt(5)
print formula
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import math
if __name__ == "__main__":
    numero=int(raw_input())
    minimo=numero/math.log(numero)
    maximo=minimo*1.25506
    print '%.1f'%minimo +' '+ '%.1f'%maximo 

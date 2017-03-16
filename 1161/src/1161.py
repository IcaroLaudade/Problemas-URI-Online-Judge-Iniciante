# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
import sys
import math
if __name__ == "__main__":
    for line in sys.stdin:
        a,b=line.split()
        a=int(a)
        b=int(b)
        c=math.factorial(a)+math.factorial(b)
        print c


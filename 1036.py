import math
if __name__ == "__main__":
    a,b,c=raw_input().split()
    a=float(a)
    b=float(b)
    c=float(c)
    d=float(((b*b)-(4*a*c)))
    if d<0 or a==0:
        print "Impossivel calcular"
    else:
        print "R1 = %.5f" %((-b+math.sqrt(d))/(2*a))
        print "R2 = %.5f" %((-b-math.sqrt(d))/(2*a))

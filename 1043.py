def verificaInvalido(a,b,c):
    if a-c >=b or a-b >=c or b-c >=a:
        return False
    else:
        return True

if __name__ == "__main__":
    triangulo=raw_input()
    a,b,c=triangulo.split()
    a=float(a)
    b=float(b)
    c=float(c)
    if not verificaInvalido(a,b,c):
        print "Area = %.1f" % ((a+b)*c/2)
    else:        
        print "Perimetro = %.1f" %(a+b+c)


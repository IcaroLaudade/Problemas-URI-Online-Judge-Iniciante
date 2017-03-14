# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
def verificaMaior(a,b,c):   
    if a>b and a>c:
        return a
    elif b>a and b>c:
        return b
    else:
        return c

def verificaRetangulo(a,b,c):
    hipotenusa=verificaMaior(a,b,c)
    if hipotenusa==a and a**2==(b**2 + c**2):
        return "S"
    elif hipotenusa==b and b**2==(a**2 + c**2):
        return "S"
    elif hipotenusa==c and c**2==(a**2 + b**2):
        return "S"
    else:
        return "N"
def verificaInvalido(a,b,c):
    if a-c >=b or a-b >=c or b-c >=a:
        return False
    else:
        return True

if __name__ == "__main__":
    triangulo=raw_input()
    a,b,c=triangulo.split()
    a=int(a)
    b=int(b)
    c=int(c)
    if not verificaInvalido(a,b,c):
        print "Invalido"
    else:        
        if a==b and b==c:
            print "Valido-Equilatero\nRetangulo: N"
        elif a==b or b==c or a==c:
            print "Valido-Isoceles\nRetangulo: %s"%verificaRetangulo(a,b,c)
        else:
            print "Valido-Escaleno\nRetangulo: %s"%verificaRetangulo(a,b,c)


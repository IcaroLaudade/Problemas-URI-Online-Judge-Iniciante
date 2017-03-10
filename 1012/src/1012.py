# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    linha=raw_input("")
    a,b,c=linha.split()
    a=float(a)
    b=float(b)
    c=float(c)
    areatriangulo=(a*c)/2.0
    areacirculo=(c**2)*3.14159
    areatrapezio=((a+b)*c)/2.0
    areaquadrado=b**2
    arearetangulo=a*b
    print "TRIANGULO: %.3f" % areatriangulo
    print "CIRCULO: %.3f" % areacirculo
    print "TRAPEZIO: %.3f" % areatrapezio
    print "QUADRADO: %.3f" % areaquadrado
    print "RETANGULO: %.3f" % arearetangulo

def entradas():
    while True:
        a=float(raw_input())
        if a<0 or a>10:
            print "nota invalida"
            continue
        else:
            break
    while True:
        b=float(raw_input())
        if b<0 or b>10:
            print "nota invalida"
            continue
        else:
            break
    print "media = %.2f"%((a+b)/2)

   
    
if __name__=="__main__":
    entradas()
    print "novo calculo (1-sim 2-nao)"
    c=int(raw_input())    
    while True:
        if c<1 or c>2:
                print "novo calculo (1-sim 2-nao)"
                c=int(raw_input())
                continue
        else:
            if c==1:
                entradas()
                print "novo calculo (1-sim 2-nao)"
                c=int(raw_input())                
            elif c==2:
                break
        
    


   
        
    
            
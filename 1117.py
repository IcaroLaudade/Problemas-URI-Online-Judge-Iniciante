if __name__=="__main__":
    a=float(raw_input())
    b=float(raw_input())
    c=0
    d=0
    while True:
        if a>=0 and a<=10:
            break
        else:
            print "nota invalida"                    
            a=float(raw_input())
    while True:
        if b>=0 and b<=10:
                break
        else:
            print "nota invalida"
            b=float(raw_input())   
    print "media = %.2f"%((a+b)/2)           
    
    
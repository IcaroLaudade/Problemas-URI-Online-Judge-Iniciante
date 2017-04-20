if __name__=="__main__":
    a=float(raw_input())
    if a>=0 and a<=2000.00:
        print "Isento"
    elif a>=2000.01 and a<=3000.00:
        print "R$ %.2f" %(((a-2000)/100)*8)       
    elif a>=3000.01 and a<=4500.00:
        b=80
        c=(a-3000)/100*18
        soma=b+c   
        print "R$ %.2f" %(soma)      
    elif a>4500.00:
        b=80
        c=270
        d=(a-4500)/100*28
        soma=b+c+d        
        print "R$ %.2f" %(soma)    
if __name__ == "__main__":
    a=int(raw_input())
    b=a
    cont100=0
    cont50=0
    cont20=0
    cont10=0
    cont5=0
    cont2=0
    cont1=0
    while True:
        if a>=100:
            cont100=cont100+1
            a=a-100
        elif a>=50:
            cont50=cont50+1
            a=a-50
        elif a>=20:
            cont20=cont20+1
            a=a-20 
        elif a>=10:
            cont10=cont10+1
            a=a-10 
        elif a>=5:
            cont5=cont5+1
            a=a-5 
        elif a>=2:
            cont2=cont2+1
            a=a-2 
        elif a>=1:
            cont1=cont1+1
            a=a-1
        if a <=0:
            break
    print b    
    print "%s nota(s) de R$ 100,00" % cont100 
    print "%s nota(s) de R$ 50,00" % cont50
    print "%s nota(s) de R$ 20,00" % cont20
    print "%s nota(s) de R$ 10,00" % cont10
    print "%s nota(s) de R$ 5,00" % cont5
    print "%s nota(s) de R$ 2,00" % cont2
    print "%s nota(s) de R$ 1,00" % cont1            
            
    
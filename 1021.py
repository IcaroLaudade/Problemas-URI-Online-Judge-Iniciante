if __name__ == "__main__":
    a,b=raw_input().split(".")
    a=int(a)
    b=int(b)
    cont100=0
    cont50=0
    cont20=0
    cont10=0
    cont5=0
    cont2=0
    cont1=0
    cent50=0
    cent25=0
    cent10=0
    cent5=0
    cent1=0
    cont100=cont100+(a/100)
    a=a-(cont100*100)
    cont50=cont50+(a/50)
    a=a-(cont50*50)
    cont20=cont20+(a/20)
    a=a-(cont20*20) 
    cont10=cont10+(a/10)
    a=a-(cont10*10) 
    cont5=cont5+(a/5)
    a=a-(cont5*5) 
    cont2=cont2+(a/2)
    a=a-(cont2*2) 
    cont1=a
    cent50=cent50+(b/50)
    b=b-(cent50*50)    
    cent25=cent25+(b/25)
    b=b-(cent25*25)
    cent10=cent10+(b/10)
    b=b-(cent10*10)
    cent5=cent5+(b/5)
    b=b-(cent5*5)
    cent1=b             
    print "NOTAS:"    
    print "%s nota(s) de R$ 100.00" % cont100 
    print "%s nota(s) de R$ 50.00" % cont50
    print "%s nota(s) de R$ 20.00" % cont20
    print "%s nota(s) de R$ 10.00" % cont10
    print "%s nota(s) de R$ 5.00" % cont5
    print "%s nota(s) de R$ 2.00" % cont2
    print "MOEDAS"
    print "%s moedas(s) de R$ 1.00" % cont1
    print "%s moedas(s) de R$ 0.50" % cent50
    print "%s moedas(s) de R$ 0.25" % cent25
    print "%s moedas(s) de R$ 0.10" % cent10
    print "%s moedas(s) de R$ 0.05" % cent5
    print "%s moedas(s) de R$ 0.01" % cent1
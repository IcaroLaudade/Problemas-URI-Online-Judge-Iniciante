if __name__=="__main__":
    a=float(raw_input())
    if a>=0 and a<=400.00:
        print "Novo salario: %.2f" % (a+(a/100)*15)
        print "Reajuste ganho: %.2f" %((a/100)*15)
        print "Em percentual: 15 %"
    elif a>=400.01 and a<=800.00:
        print "Novo salario: %.2f" % (a+(a/100)*12)
        print "Reajuste ganho: %.2f" %((a/100)*12)
        print "Em percentual: 12 %"        
    elif a>=800.01 and a<=1200.00:
        print "Novo salario: %.2f" % (a+(a/100)*10)
        print "Reajuste ganho: %.2f" %((a/100)*10)
        print "Em percentual: 10 %"    
    elif a>=1200.01 and a<=2000.00:
        print "Novo salario: %.2f" % (a+(a/100)*7)
        print "Reajuste ganho: %.2f" %((a/100)*7)
        print "Em percentual: 7 %"
    elif a>2000.00:
        print "Novo salario: %.2f" % (a+(a/100)*4)
        print "Reajuste ganho: %.2f" %((a/100)*4)
        print "Em percentual: 4 %"        
        
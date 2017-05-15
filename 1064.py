if __name__=="__main__":
    a=float(input())
    b=float(input())
    c=float(input())
    d=float(input())
    e=float(input())
    f=float(input())
    g=[a,b,c,d,e,f]
    contpos=0
    somapos=0
    for i in range(len(g)):
        if g[i]>0:
            contpos=contpos+1
            somapos=somapos+g[i]    
    print ("%s valores positivos" %contpos)
    print ("%.1f" %(somapos/contpos))
            
    

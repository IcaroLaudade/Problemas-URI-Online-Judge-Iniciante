if __name__=="__main__":
    a=int(raw_input())
    b=int(raw_input())
    c=int(raw_input())
    d=int(raw_input())
    e=int(raw_input())
    f=[a,b,c,d,e]
    contimpar=0
    contneg=0
    contpos=0
    contpar=0
    for g in range(len(f)):
        if f[g]<0 :
            contneg=contneg+1
        elif f[g]>0:
            contpos=contpos+1
        if f[g] %2 ==0:
            contpar=contpar+1
        elif f[g]%2==1:
            contimpar=contimpar+1
    print "%s valor(es) par(es)" % contpar
    print "%s valor(es) impar(es)" % contimpar
    print "%s valor(es) positivo(s)" % contpos
    print "%s valor(es) negativo(s)" % contneg
            
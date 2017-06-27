if __name__=="__main__":
    o=int(raw_input())
    a=map(int,raw_input().split())
    menor=0
    pos=0
    for i in range(0,len(a)) :
        if i==0:
            menor=a[i]
            pos=i
        else:
            if a[i]<menor:
                menor=a[i]
                pos=i
    print "Menor valor: %i" %menor
    print "Posicao: %i"%pos
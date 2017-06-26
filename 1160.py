
if __name__=="__main__":
    o=int(raw_input())

    for i in range(0,o):
        anos=0
        a,b,c,d=raw_input().split()
        a=int(a)
        b=int(b)
        c=float(c)
        d=float(d)
        while(a<=b):
            a+=round(((a/100)*c))
            b+=round(((b/100)*d))
            anos+=1
            if anos>100:
                print "Mais de 1 seculo."
                break
        if a>b:
            print "%d anos." %anos   
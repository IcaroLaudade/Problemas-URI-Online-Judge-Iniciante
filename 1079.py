if __name__=="__main__":
    a=int(raw_input())
    cont=1
    while cont<=a:
        b,c,d=raw_input().split()
        b=float(b)
        c=float(c)
        d=float(d)
        b=b*2
        c=c*3
        d=d*5
        e=b+c+d
        print "%.1f" %(e/10)
        cont=cont+1


if __name__=="__main__":
    while True:
        try:
            o=int(raw_input())
            a=map(int,raw_input().split())
            maximo=max(a)
            if maximo<10:
                print 1
            elif maximo>=10 and maximo<20:
                print 2
            elif maximo>=20:
                print 3            
        except:
            break    

    
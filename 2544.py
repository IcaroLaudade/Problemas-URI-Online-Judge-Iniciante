if __name__=="__main__":
    while True:
        contador=0
        try:
            a=int(raw_input())
            if a==1:
                print 0
            else :
                while a>1:
                    a=a/2
                    contador+=1
                print contador
        except:
            break
if __name__=="__main__":
    soma=0
    cont=0
    while True:
        a=int(raw_input())
        if a<0:
            break
        soma+=a
        cont+=1
    media=soma/(cont*1.00)
    print "%.2f"%media
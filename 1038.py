if __name__ == "__main__":
    a,b=raw_input().split()
    a=int(a)
    b=int(b)
    if a==1:
        print "Total: R$ %.2f" %(b*4.00)
    elif a==2:
        print "Total: R$ %.2f" %(b*4.50)
    elif a==3:
        print "Total: R$ %.2f" %(b*5.00)
    elif a==4:
        print "Total: R$ %.2f" %(b*2.00)
    elif a==5:
        print "Total: R$ %.2f" %(b*1.50)     
        
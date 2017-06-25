if __name__=="__main__":
    soma=1.00
    dobro=2.00
    for i in range (3,40,2):
        soma+=i/dobro
        dobro=dobro*2
    print "%.2f"%soma
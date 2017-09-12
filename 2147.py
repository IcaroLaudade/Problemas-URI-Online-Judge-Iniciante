numeroCasos=int(raw_input())
for i in range(numeroCasos):
    palavra=raw_input()
    tam=0.00
    for j in range(len(palavra)):
        tam+=0.01
    print "%.2f" % tam
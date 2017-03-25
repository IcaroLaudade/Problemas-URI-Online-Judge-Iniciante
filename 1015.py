import math
if __name__ == "__main__":
    x1,y1=raw_input().split()
    x2,y2=raw_input().split()
    x1=float(x1)
    y1=float(y1)
    x2=float(x2)
    y2=float(y2)
    distancia=math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))
    print "%.4f" % distancia

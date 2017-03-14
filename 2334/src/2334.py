
if __name__ == "__main__":
    p=0
    while True:
        p=int(raw_input())
        if p<0:
            break
        elif p>0:
            print p-1
        else:
            print p


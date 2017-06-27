if __name__=="__main__":
            a,b,c=map(int,raw_input().split())
            if (a>b and b<=c) or (a<b and b-a<=c-b) or ((a>b) and (a-b > b-c)) or ((a==b) and (b < c)) :
                        print ":)"
            elif (a<b and b>=c) or (a<b and b-a>=c-b) or ((a>b) and (a-b <= b-c)) or ((a==b) and (b >= c)) :
                        print ":("
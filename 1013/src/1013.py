# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
def maior(a,b):
    maior=(a+b+abs(a-b))/2
    return maior;

if __name__ == "__main__":
    linha=raw_input("")
    a,b,c=linha.split()
    a=int(a)
    b=int(b)
    c=int(c)
    maiorAB=maior(a,b)
    maiorAB=maior(maiorAB,c)
    print "%s eh o maior" % maiorAB


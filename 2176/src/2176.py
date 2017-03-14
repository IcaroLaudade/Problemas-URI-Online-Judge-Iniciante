# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    a=raw_input()
    lista=list(a)
    i=0
    contador=0
    while i<len(lista):
        if(lista[i]=="1"):
            contador+=1;
        i+=1    
    if contador %2==0:
        print a+"0"
    else:
        print a+"1"    


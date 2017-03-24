if __name__ == "__main__":
    number=int(raw_input())
    conta=0
    soma=0
    while conta<number:
        nume=raw_input()
        numero=list(str(nume))
        for cont in range(0,len(numero)):
            if numero[cont] is '2' or numero[cont] is '5' or numero[cont] is '3':
                soma =soma+ 5
            elif numero[cont]is '9' or numero[cont]is '0' or numero[cont] is '6':              
                soma =soma+ 6
            elif numero[cont]is'1':              
                soma =soma+ 2
            elif numero[cont] is '7':              
                soma =soma+ 3
            elif numero[cont] is '8' :                
                soma =soma+ 7
            else :
                soma =soma+ 4
        print ("%s leds"%soma)
        soma=0
        conta=conta+1
        
        

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
def mostrar():
    for i in range(1,numeromulttres,4):
        lista=[str(i),str(i+1),str(i+2),'PUM'] 
        print " ".join(lista)
        lista=[]
    
if __name__ == "__main__":
    numero=int(raw_input())
    numeromulttres=numero*4
    mostrar()


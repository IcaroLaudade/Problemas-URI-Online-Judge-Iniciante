# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
def calculoVitaminaC(alimentos):
    a,b=alimentos.split(" ",1)
    a=int(a)
    somavitaminac=0
    if b=='suco de laranja':
        somavitaminac+=a*120
    if b=='morango fresco':
        somavitaminac+=a*85
    if b=='mamao':
        somavitaminac+=a*85
    if b=='goiaba vermelha':
        somavitaminac+=a*70
    if b=='manga':
        somavitaminac+=a*56
    if b=='laranja':
        somavitaminac+=a*50 
    if b=='brocolis':
        somavitaminac+=a*34 
    return somavitaminac
if __name__ == "__main__":
    qtdalimentos=1
    while True:        
        qtdalimentos=int(raw_input())
        if qtdalimentos<1:
            break
        else:
            contador=0
            somavitaminac=0
            while (contador<qtdalimentos):                                
                alimentos=raw_input()
                somavitaminac+=calculoVitaminaC(alimentos)              
                contador+=1
            if somavitaminac<110:
                falta=110-somavitaminac
                print 'Mais %s mg' %falta
            elif somavitaminac>130:
                sobra=somavitaminac-130
                print 'Menos %s mg' %sobra
            else:
                print str(somavitaminac)+' mg'    

  

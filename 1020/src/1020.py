# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    idadedias=int(raw_input())
    ano=365
    mes=30
    idadeano=0
    idademes=0
    while idadedias>=ano:
        idadeano+=1
        idadedias-=365
    print str(idadeano)+' ano(s)'
    while idadedias>=mes:
        idademes+=1
        idadedias-=30
    print str(idademes)+' mes(es)'
    print str(idadedias)+' dia(s)'   


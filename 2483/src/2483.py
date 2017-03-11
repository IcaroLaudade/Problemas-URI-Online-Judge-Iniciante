# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    i=int(raw_input())
    vetor=[]
    for a in range(0,i):
        vetor.insert(a,'a')     
    print "Feliz nat%sl!"% ''.join([str(a) for a in vetor])

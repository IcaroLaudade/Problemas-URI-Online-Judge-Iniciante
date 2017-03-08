# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    nome=raw_input()
    salariofixo=float(raw_input())
    totalvenda=float(raw_input())
    total= salariofixo+(totalvenda * 0.15)
    print "TOTAL = R$ %.2f" %total

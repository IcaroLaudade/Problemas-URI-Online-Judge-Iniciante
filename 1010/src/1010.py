# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    codigopeca = int(raw_input())
    numeropeca = int(raw_input())
    valorUnitario = float(raw_input())
    total = numeropeca * valorUnitario
    print "VALOR A PAGAR: R$ %.2f" % total  
   
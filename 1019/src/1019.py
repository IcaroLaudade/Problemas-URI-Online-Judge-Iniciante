# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    seg=int(raw_input())
    minut,seg=divmod(seg,60)
    h,minut=divmod(minut,60)
    print "%s:%s:%s"%(h,minut,seg)

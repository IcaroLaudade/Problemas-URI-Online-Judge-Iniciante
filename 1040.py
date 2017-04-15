if __name__ == "__main__":
    a,b,c,d = raw_input().split()
    a=float(a)
    b=float(b)
    c=float(c)
    d=float(d)
    e=((a*2)+(b*3)+(c*4)+d)/10
    if e<5:
        print "Media: %.1f" % e
        print "Aluno reprovado."
    elif e>7:     
        print "Media: %.1f" % e
        print "Aluno aprovado."
    else:
        print "Media: %.1f" % e
        print "Aluno em exame." 
        f=float(raw_input())
        print "Nota do exame: %.1f" %f
        g=(e+f)/2
        if g<5:
            print "Aluno reprovado."
            print "Media final: %.1f" % g
        elif g>5:     
            print "Aluno aprovado." 
            print "Media final: %.1f" % g
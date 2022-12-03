import math
print('Encontre o valor de uma equação do segundo grau!')
a = int(input('Qual o valor de A?'))
b = int(input('Qual o valor de B?'))
c = int(input('Qual o valor de C?'))
delta = (b*b-4*a*c)
if delta < 0:
    print("Raiz negativa, nao ha solucao dentro dos conjuntos reais")
else:
    print('O valor de delta é', delta) 
x1 = (-b + (math.sqrt(delta)))/(2 * a)
x2 = (-b - (math.sqrt(delta)))/(2 * a)
print('O valor de x1 é: {}'.format(x1))
print('O valor de x2 é: {}'.format(x2))
def reemplazacontar(texto):
    texto = texto.replace(" ","")
    tam =len(texto)
    cont = 0
    for i in range(tam):
        con = cont + 1

def comparar(texto):
    resultado = True
    div = len(texto)/2
    for i in range(int(div)):
        if texto[i-1] == texto[-i]:
            return print("La palabra es un Palindromo o capicua")
        else:
            return print("La palabra NO es un Palindromo o capicua")
            break

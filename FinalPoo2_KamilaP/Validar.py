import texto.reordenar as reordenar
while True:
    texto=input("Ingresa un palindromo o capicua:")
    esPalindromo=reordenar.palindromo(texto)
    if esPalindromo==True:
        print(f"Felicidades '{texto}' si es palindromo o capicua")
        break
    else:
        print(f"Tonto '{texto}' no es palindromo o capicua")
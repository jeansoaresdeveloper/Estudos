import random


def jogoForca():

    imprimeMensagemAbertura()
    palavraSecreta = carregaPalavraSecreta()
    letrasAcertadas = imprimePalavraSecreta(palavraSecreta)

    print("")
    for underscore in letrasAcertadas:
        print(underscore, end=" ")
    print(" - {} letras".format(len(letrasAcertadas)))
    print("")

    enforcou = False
    acertou = False
    tentativas = 1


    while not enforcou and not acertou:

        print("Tentativa {} de {}".format(tentativas, 6))
        chute = pedeChute()

        if chute in palavraSecreta:
            chuteCorreto(chute, palavraSecreta, letrasAcertadas)
        else:
            tentativas += 1
            desenhaForca(tentativas)

        print("")
        for letras in letrasAcertadas:
            print(letras, end=" ")
        print(" - {} letras".format(len(letrasAcertadas)))
        print("")

        enforcou = tentativas == 7
        acertou = "_" not in letrasAcertadas

    if acertou:
        mensagemVencedor()
    else:
        mensagemPerdedor(palavraSecreta)

    print("\nFim do jogo")

def imprimeMensagemAbertura():
    print("**********************************")
    print("*** Bem vindo ao jogo de Forca ***")
    print("**********************************")


def carregaPalavraSecreta():
    arquivo = open("palavras.txt", "rt", encoding="utf-8")
    palavras = []

    for linha in arquivo:
        palavras.append(linha.strip())
    arquivo.close()

    numeroAleatorio = random.randrange(0, len(palavras))
    palavraSecreta = palavras[numeroAleatorio].upper()
    return palavraSecreta

def imprimePalavraSecreta(palavra):
    return ["_" for letra in palavra]

def pedeChute():
    return input("Informe uma letra para procurarmos na palavra: ").strip().upper()

def chuteCorreto(chute, palavraSecreta, letrasAcertadas):
    contador = 0
    for letra in palavraSecreta:
        if (chute == letra):
            letrasAcertadas[contador] = letra
        contador += 1

def mensagemVencedor():
    print("Parabéns, você ganhou!")
    print("       ___________      ")
    print("      '._==_==_=_.'     ")
    print("      .-\\:      /-.    ")
    print("     | (|:.     |) |    ")
    print("      '-|:.     |-'     ")
    print("        \\::.    /      ")
    print("         '::. .'        ")
    print("           ) (          ")
    print("         _.' '._        ")
    print("        '-------'       ")

def mensagemPerdedor(palavraSecreta):
    print("Puxa, você foi enforcado!")
    print("A palavra era {}".format(palavraSecreta))
    print("    _______________         ")
    print("   /               \       ")
    print("  /                 \      ")
    print("//                   \/\  ")
    print("\|   XXXX     XXXX   | /   ")
    print(" |   XXXX     XXXX   |/     ")
    print(" |   XXX       XXX   |      ")
    print(" |                   |      ")
    print(" \__      XXX      __/     ")
    print("   |\     XXX     /|       ")
    print("   | |           | |        ")
    print("   | I I I I I I I |        ")
    print("   |  I I I I I I  |        ")
    print("   \_             _/       ")
    print("     \_         _/         ")
    print("       \_______/           ")

def desenhaForca(erros):
    print("  _______     ")
    print(" |/      |    ")

    if(erros == 1):
        print(" |      (_)   ")
        print(" |            ")
        print(" |            ")
        print(" |            ")

    if(erros == 2):
        print(" |      (_)   ")
        print(" |      \     ")
        print(" |            ")
        print(" |            ")

    if(erros == 3):
        print(" |      (_)   ")
        print(" |      \|    ")
        print(" |            ")
        print(" |            ")

    if(erros == 4):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |            ")
        print(" |            ")

    if(erros == 5):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |            ")

    if(erros == 6):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      /     ")

    if (erros == 7):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      / \   ")

    print(" |            ")
    print("_|___         ")
    print()

if __name__ == "__main__":
    jogoForca()

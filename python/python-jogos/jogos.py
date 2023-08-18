import forca
import jogo


def escolheJogo():

    print("***************************")
    print("*** Escolha o seu jogo! ***")
    print("***************************")

    print("(1) Forca (2) Adivinhação")
    qualJogo = int(input("Qual jogo? "))

    while (qualJogo < 1 or qualJogo > 2):
        print("(1) Forca (2) Adivinhação")
        qualJogo = int(input("Qual jogo? "))

    if (qualJogo == 1):
        forca.jogoForca()
    elif (qualJogo == 2):
        jogo.jogoAdivinhacao()

if(__name__ == "__main__"):
    escolheJogo()
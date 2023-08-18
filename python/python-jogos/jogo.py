import random


def jogoAdivinhacao():
    print("*********************************")
    print("Bem vindo ao jogo de adivinhação!")
    print('*********************************', end="\n\n")

    numeroSecreto = random.randrange(1, 101)
    totalTentativas = 0
    pontuacao = 1000

    print("(1) Fácil (2) Médio (3) Difícil")
    nivel = int(input("Escolha um nível: "))
    while (nivel < 1 or nivel > 3):
        print("O nível precisa ser entre 1 e 3")
        print("(1) Fácil (2) Médio (3) Difícil")
        nivel = int(input("Escolha um nível: "))

    if (nivel == 1):
        totalTentativas = 10
    elif (nivel == 2):
        totalTentativas = 6
    else:
        totalTentativas = 3

    for rodada in range(1, totalTentativas + 1):
        print("Tentativa {} de {}".format(rodada, totalTentativas))
        chuteUsuario = int(input("Digite um número entre 1 e 100: "))
        print("Você digitou: ", chuteUsuario, ", Tipo da variável ", type(chuteUsuario), end="\n\n")

        if (chuteUsuario < 1 or chuteUsuario > 100):
            print("O número precisa estar entre 1 e 100!\n")
            continue

        acertou = numeroSecreto == chuteUsuario
        maior = chuteUsuario < numeroSecreto
        menor = chuteUsuario > numeroSecreto

        if (acertou):
            print("Você acertou o número e fez {} pontos!\n".format(pontuacao))
            break
        elif (maior):
            print("O número secreto é maior!\n")
            pontosPerdidos = abs(chuteUsuario - numeroSecreto)
            pontuacao = pontuacao - pontosPerdidos
        elif (menor):
            print("O número secreto é menor!\n")
            pontosPerdidos = abs(chuteUsuario - numeroSecreto)
            pontuacao = pontuacao - pontosPerdidos

    print("Fim do jogo!")


if (__name__ == "__main__"):
    jogoAdivinhacao()

class Conta:
    def __init__(self, numero, titular, saldo, limite):
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    def extrato(self):
        print("{} seu saldo é de R$ {}".format(self.__titular, self.__saldo))

    def depositar(self, valor):
        self.__saldo += valor

    def __pode_sacar(self, valor):
        valor_disponivel_a_sacar = self.__saldo + self.__limite
        return valor <= valor_disponivel_a_sacar

    def sacar(self, valor):
        if(self.__pode_sacar(valor)):
            self.__saldo -= valor
        else:
            print("Você não pode sacar R$ {}!".format(valor))

    # Encapsulamento
    def transferir(self, valor, destino):
        self.sacar(valor)
        destino.depositar(valor)

    @property
    def saldo(self):
        return self.__saldo

    @property
    def titular(self):
        return self.__titular

    @property
    def limite(self):
        return self.__limite

    @limite.setter
    def limite(self, limite):
        self.__limite = limite

    @staticmethod
    def codigos_bancos():
        return {"BB": "001", "Caixa": "104", "Bradesco": "237"}

codigos = Conta.codigos_bancos()
print(codigos["BB"])

conta = Conta(123, "Jean", 500, 1000)
conta.depositar(300)
conta.sacar(250.50)
conta.extrato()

conta2 = Conta(1234, "Carlos", 300, 2000)
conta2.depositar(300)
conta2.sacar(250.50)
conta2.extrato()

print("")
conta2.transferir(40, conta)
conta2.extrato()
conta.extrato()

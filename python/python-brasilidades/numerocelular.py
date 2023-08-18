import re

class Celular:
    def __init__(self, telefone):
        self.resposta = None
        self.telefone = str(telefone)
        self.valida_telefone()

    def __str__(self):
        return self.formata_telefone()

    def valida_telefone(self):
        padrao = "([0-9]{2})?([0-9]{2})([9]?[0-9]{4})([0-9]{4})"
        self.resposta = re.search(padrao, self.telefone)
        if not self.resposta:
            raise ValueError("Número inválido")

    def formata_telefone(self):
        numero_formatado = "+{} ({}) {}-{}".format(
            self.resposta.group(1),
            self.resposta.group(2),
            self.resposta.group(3),
            self.resposta.group(4)
        )
        return numero_formatado


celular = Celular(5544999999999)
print(celular)

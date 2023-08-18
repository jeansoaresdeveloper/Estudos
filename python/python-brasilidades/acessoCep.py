import requests


class BuscaEndereco:
    def __init__(self, cep):
        self.cep = str(cep)
        self.cep_valido()

    def __str__(self):
        return self.format_cep()

    def cep_valido(self):
        if len(self.cep) == 8:
            return True

        raise ValueError("Cpf Inválido")

    def format_cep(self):
        return "{}-{}".format(self.cep[:5], self.cep[5:])

    def acesso_via_cep(self):
        url = "https://viacep.com.br/ws/{}/json/".format(self.cep)
        r = requests.get(url)
        dados = r.json()
        return (
            dados["bairro"],
            dados["localidade"],
            dados["uf"]
        )

cep = 12345678
objeto_cep = BuscaEndereco(cep)
bairro, cidade, estado = objeto_cep.acesso_via_cep()
print(f"Bairro: {bairro}, cidade: {cidade}, estado: {estado}")

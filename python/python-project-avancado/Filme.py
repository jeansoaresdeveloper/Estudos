class Programa:

    def __init__(self, nome, ano):
        self._nome = nome.title()
        self.ano = ano
        self._likes = 0

    @property
    def nome(self):
        return self._nome

    @property
    def likes(self):
        return self._likes

    @nome.setter
    def nome(self, novo_nome):
        self._nome = novo_nome.title()

    def dar_likes(self):
        self._likes += 1

    def __str__(self):
        return f"{self._nome} - {self.ano} - {self._likes} Likes"


class Filme(Programa):

    def __init__(self, nome, ano, duracao):
        super(Filme, self).__init__(nome, ano)
        self.duracao = duracao

    def __str__(self):
        return f"{self._nome} - {self.ano} - {self.duracao} min - {self._likes} Likes"


class Serie(Programa):
    def __init__(self, nome, ano, temporada):
        super(Serie, self).__init__(nome, ano)
        self.temporada = temporada

    def __str__(self):
        return f"{self._nome} - {self.ano} - {self.temporada} Temporadas - {self._likes} Likes"


class Playlist:

    def __init__(self, nome, programas):
        self.nome = nome
        self._programas = programas

    # Definindo classe como um objeto iteravel
    def __getitem__(self, item):
        return self._programas[item]

    def __len__(self):
        return len(self._programas)


vingadores = Filme("Vingadores Ultimato", 2012, 160)
batman = Filme("Batman - cavalheiro das trevas", 2012, 143)
transformers = Filme("Transformers", 2007, 152)

flash = Serie("Flash", 2011, 12)
good_doctor = Serie("the good doctor", 2016, 5)

lista_de_programas = [vingadores, flash, batman, transformers, good_doctor]
playlist = Playlist("Playlist Fim de semana", lista_de_programas)

print(f"Tamanho da lista de Programas: {len(playlist)}")
for programa in playlist:
    print(programa)

    # detalhes = programa.duracao if hasattr(programa, 'duracao') else programa.temporada
    # Acima algo sem polimorfismo -> Abaixo polimorfismo
    # Sobreescrevendo métodos

    # programa.imprimir() Método para imprimir sem o uso do __str__


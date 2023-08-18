from datetime import datetime, timedelta


class Datas:
    def __init__(self):
        self.momento_cadastro = datetime.today()

    def __str__(self):
        data_formatada = self.momento_cadastro.strftime("%d/%m/%Y %H:%M")
        return data_formatada

    def mes_cadastro(self):
        meses = {
            1: "Janeiro",
            2: "Fevereiro",
            3: "Março",
            4: "Abril",
            5: "Maio",
            6: "Junho",
            7: "Julho",
            8: "Agosto",
            9: "Setembro",
            10: "Outubro",
            11: "Novembro",
            12: "Dezembro",
        }
        mes_de_cadastro = self.momento_cadastro.month
        return meses[mes_de_cadastro]

    def semana_cadastro(self):
        semanas = {
            6: "Domingo",
            0: "Segunda-feira",
            1: "Terça-feira",
            2: "Quarta-feira",
            3: "Quinta-feira",
            4: "Sexta-feira",
            5: "Sábado"
        }
        semana_de_cadastro = self.momento_cadastro.weekday()
        return semanas[semana_de_cadastro]


data = Datas()
print(data.mes_cadastro())
print(data.semana_cadastro())
print(data)
from validate_docbr import CPF, CNPJ


class Documento:

    def __init__(self, info_documento):
        self.__documento = str(info_documento)

    def __str__(self):
        return self.__valida_documento()

    def __valida_documento(self):
        val_cpf = CPF()
        val_cnpj = CNPJ()
        if val_cpf.validate(self.__documento):
            return val_cpf.mask(self.__documento)
        elif val_cnpj.validate(self.__documento):
            return val_cnpj.mask(self.__documento)

        raise ValueError("Documento Inválido!")


documento = Documento("30555788000163")
print(documento)
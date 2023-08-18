from fastapi import APIRouter, Response

from src.models.papel import Papel

router = APIRouter()

banco_de_dados = []


@router.post("/papel")
async def add_papel(papel: Papel):
    banco_de_dados.append(papel)
    return papel


@router.get("/papel")
async def list_papel(response: Response):
    response.status_code = 400
    return banco_de_dados
from fastapi import APIRouter, Response

from src.models.papel import Papel

router = APIRouter()

banco_de_dados = []


@router.post("/test")
async def add_test(papel: Papel):
    banco_de_dados.append(papel)
    return papel


@router.get("/test")
async def list_test(response: Response):
    response.status_code = 400
    return banco_de_dados
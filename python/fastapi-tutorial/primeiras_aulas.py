from typing import Optional
from pydantic import BaseModel
from fastapi import FastAPI, Header, Response

app = FastAPI()


class Item(BaseModel):
    id: int
    quantidade: int
    descricao: str
    valor: float


@app.get("/")
def read_root(user_agent: Optional[str] = Header(None)):
    return {"user-agent": user_agent}


@app.get("items/{item_id}")
def read_item(item_id: int, q: Optional[str] = None):
    return {"item_id": item_id, "q": q}


@app.post("/item")
def add_item(novo_item: Item, outro_item: Item):
    return [novo_item, outro_item]


@app.get("/cookie")
def cookie(response: Response):
    response.set_cookie(key="PrimeiroCookie", value="12345678")
    return {"Cookie": True}


@app.get("/item/valor_total")
def get_valor_total():
    valor_total = sum([item.valor * item.quantidade for item in banco_de_dados])
    return {"Valor total": valor_total}

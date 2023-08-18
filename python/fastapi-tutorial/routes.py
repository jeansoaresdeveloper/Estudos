from fastapi import APIRouter

from src.controllers import papel_controller as papel
from src.controllers import test_controller as test

router = APIRouter()

router.include_router(papel.router)
router.include_router(test.router)

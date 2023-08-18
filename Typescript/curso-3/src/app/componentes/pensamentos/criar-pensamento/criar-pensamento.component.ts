import { Component, OnInit } from '@angular/core';
import { InterfacePensamento } from '../interface-pensamento.js';
import { PensamentoService } from '../pensamento.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-criar-pensamento',
  templateUrl: './criar-pensamento.component.html',
  styleUrls: ['./criar-pensamento.component.css']
})
export class CriarPensamentoComponent implements OnInit {

  pensamento: InterfacePensamento = {
    conteudo: '',
    autoria: '',
    modelo: 'modelo1'
  }

  constructor(
    private servicePensamento: PensamentoService,
    private router: Router
  ) { }

  ngOnInit(): void {
  }

  criarPensamento() {
    this.servicePensamento.criar(this.pensamento).subscribe(() => {
      this.router.navigate(['/listarPensamento']);
    });
  }

  cancelar() {
    this.router.navigate(['/listarPensamento']);
  }

}

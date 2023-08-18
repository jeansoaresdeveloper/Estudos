import { Component, OnInit } from '@angular/core';
import { InterfacePensamento } from '../interface-pensamento.js';
import { PensamentoService } from '../pensamento.service';

@Component({
  selector: 'app-listar-pensamento',
  templateUrl: './listar-pensamento.component.html',
  styleUrls: ['./listar-pensamento.component.css']
})
export class ListarPensamentoComponent implements OnInit {

  listaPensamentos: Array<InterfacePensamento> = [];

  constructor(private servicePensamento: PensamentoService) { }

  ngOnInit(): void {
     this.servicePensamento.listar().subscribe((listaPensamentos) => {
        this.listaPensamentos = listaPensamentos;
     })
  }

}

import { Component, OnInit } from '@angular/core';
import { InterfacePensamento } from '../interface-pensamento';
import { PensamentoService } from '../pensamento.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-excluir-pensamento',
  templateUrl: './excluir-pensamento.component.html',
  styleUrls: ['./excluir-pensamento.component.css']
})
export class ExcluirPensamentoComponent implements OnInit {
  pensamento: InterfacePensamento = {
    id: 0,
    conteudo: '',
    autoria: '',
    modelo: ''
  }
  constructor(
    private servicePensamento: PensamentoService,
    private router: Router,
    private activatedRoute: ActivatedRoute 
  ) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.paramMap.get('id');
    this.servicePensamento.buscaPorId(parseInt(id!)).subscribe((pensamento) => {
      this.pensamento = pensamento;
    })
  }

  excluirPensamento(): void
  {
    if (this.pensamento.id) {
      this.servicePensamento.excluir(this.pensamento.id).subscribe(() => {
        this.router.navigate(['/listarPensamento']);
      });
    }
  }

  cancelar(): void
  {
    this.router.navigate(['/listarPensamento']);
  }

}

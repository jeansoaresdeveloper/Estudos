import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { InterfacePensamento } from './interface-pensamento';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PensamentoService {

  private readonly api = 'http://localhost:3000/pensamentos';

  constructor(private http: HttpClient) { }

  listar(): Observable<InterfacePensamento[]>
  {
    return this.http.get<InterfacePensamento[]>(this.api);
  }

  criar(pensamento: InterfacePensamento): Observable<InterfacePensamento>
  {
    return this.http.post<InterfacePensamento>(this.api, pensamento);
  }

  editar(pensamento: InterfacePensamento): Observable<InterfacePensamento>
  {
    const url = `${this.api}/${pensamento.id}`
    return this.http.put<InterfacePensamento>(url, pensamento);
  }

  excluir(idPensamento: number): Observable<InterfacePensamento>
  {
    const url = `${this.api}/${idPensamento}`;
    return this.http.delete<InterfacePensamento>(url)
  }

  buscaPorId(idPensamento: number): Observable<InterfacePensamento>
  {
    const url = `${this.api}/${idPensamento}`;
    return this.http.get<InterfacePensamento>(url);
  }

}

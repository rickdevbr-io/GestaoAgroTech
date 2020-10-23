import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string;
  ativarRastreamento = true;

  // tslint:disable-next-line:typedef
  formatoTemperatura(value: number) {
    return value + 'º';
  }

  // tslint:disable-next-line:typedef
  formatoUmindade(value: number) {
    return value + '%';
  }

  // tslint:disable-next-line:typedef
  clickRastreamento(){
    this.ativarRastreamento = !this.ativarRastreamento;
  }
}

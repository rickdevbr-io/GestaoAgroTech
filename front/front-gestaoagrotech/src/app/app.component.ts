import { Component } from '@angular/core';
import {DroneResponseDTO, DroneUpdateDTO} from './objects';
import { DroneService } from './drone.service'

// @ts-ignore
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string;
  ativarRastreamento = true;
  droneUpdateDTO = new DroneUpdateDTO();
  droneResponseDTO = new DroneResponseDTO();
  droneId: number;

  constructor(
    private droneService: DroneService
  ) { }

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

  clickSalvar(){

  }

  // tslint:disable-next-line:typedef
  clickPesquisar() {
    // tslint:disable-next-line:no-debugger
    debugger;
    this.droneService.pesquisarDrone(this.droneId).subscribe(
      // tslint:disable-next-line:no-debugger
      resultData => { debugger; this.droneResponseDTO = resultData; }
      );
  }

}

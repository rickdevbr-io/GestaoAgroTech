import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { DroneUpdateDTO, DroneResponseDTO } from './objects';
import {AbstractHttpService} from './http-client.service';

@Injectable({
  providedIn: 'root'
})
export class DroneService extends AbstractHttpService{
  protected getBackendUrl(): string {
    return 'http://localhost:8080';
  }

  constructor(
    public http: HttpClient
  ) {
    super('/teste/v1/', http);
  }

  pesquisarDrone(droneId: number): Observable<DroneResponseDTO> {
    return this.http.get<DroneResponseDTO>( this.getBackendUrl() +  this.uri + droneId, this.options());
  }

}

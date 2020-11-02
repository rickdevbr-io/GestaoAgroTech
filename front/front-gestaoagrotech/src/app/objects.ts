export class DroneUpdateDTO {
  latitude: number;
  longitude: string;
  temperatura: string;
  umidade: number;
}

export class DroneResponseDTO {
  id: number;
  latitude: string;
  longitude: string;
  temperatura: number;
  umidade: number;
}

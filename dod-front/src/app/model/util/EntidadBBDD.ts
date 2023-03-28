export class EntidadBBDD {
  public nombreColumna: string;
  public esObligatorio: boolean;
  public valorColumna: any;

  constructor(nombreColumna: string,  esObligatorio: boolean, valorColumna: any) {
    this.nombreColumna = nombreColumna;
    this.esObligatorio = esObligatorio;
    this.valorColumna = valorColumna;
  };
}

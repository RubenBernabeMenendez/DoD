import {EntidadBBDD} from './EntidadBBDD';

export class BBDDOptions {
  public tableNombre: string;
  public entidadBBDD: EntidadBBDD[];
  public showAlert: boolean;
  public where: string;
  public join: string;

  constructor(tableNombre: string, showAlert: boolean, where: string, join: string) {
    this.tableNombre = tableNombre;
    this.entidadBBDD = [];
    this.showAlert = showAlert;
    this.where = where;
    this.join = join;
  };
}

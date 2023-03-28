import {Injectable} from '@angular/core';
import {SQLite} from '@ionic-native/sqlite/ngx';
import {Platform} from '@ionic/angular';
import {SQLiteObject} from '@ionic-native/sqlite';
import {SQLitePorter} from '@ionic-native/sqlite-porter/ngx';
import {BBDDOptions} from "../model/util/BBDDOptions";

@Injectable({
  providedIn: 'root'
})
export class DbService {
  // TODO run in computer browser ionic cordova run browser
  private dbInstance: SQLiteObject;
  private dbName = 'beberOmorirBD';
  private version = 1;

  /*
      ***** TABLES *****
   */
  private customSettingCreateTable = "CREATE TABLE IF NOT EXISTS CUSTOM_SETTING(customSettingId INTEGER PRIMARY KEY AUTOINCREMENT, theme INTEGER, music INTEGER)";

  private tablesCreate = [
    this.customSettingCreateTable
  ];

  /*
      ***** INSERTS *****
   */
  private insertCustomSetting = 'INSERT or IGNORE INTO CUSTOM_SETTING(customSettingId, theme, music) VALUES (1, 1, 1)';

  private inserts = [
    this.insertCustomSetting
  ];

  constructor(
    private platform: Platform,
    private sqlite: SQLite
  ) {
    this.databaseConn();
  }

  // Create SQLite database
  databaseConn() {
    this.platform.ready().then(() => {
      this.sqlite.create({
        name: this.dbName,
        location: 'default'
      }).then((sqLite: SQLiteObject) => {
        this.dbInstance = sqLite;
        for (const item of this.tablesCreate) {
          sqLite.executeSql(item, [])
            .then((scs: any) => {
            }).catch((error) => alert(JSON.stringify(error)));
        }
        for (const item of this.inserts) {
          sqLite.executeSql(item, [])
            .then((scs: any) => {
            }).catch((error) => alert(JSON.stringify(error)));
        }
      })
        .catch((error) => alert(JSON.stringify(error)));
    });
  }

  public selectItem(bbddOptions: BBDDOptions): Promise<any> {
    let selectString = 'SELECT * FROM ' + bbddOptions.tableNombre;
    selectString += (bbddOptions.where !== '' && bbddOptions.where !== null) ? ' WHERE ' + bbddOptions.where : '';
    selectString += (bbddOptions.join !== '' && bbddOptions.join !== null) ? ' JOIN ' + bbddOptions.join : '';
    return this.dbInstance.executeSql(selectString, [])
      .then((scs) => scs, (e) => {
        alert(JSON.stringify(e));
      });
  }
}

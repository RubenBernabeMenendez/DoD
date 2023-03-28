import { Injectable } from '@angular/core';
import {CustomSetting} from "../model/CustomSetting";
import {BBDDOptions} from "../model/util/BBDDOptions";
import {DbService} from "./db.service";

@Injectable({
  providedIn: 'root'
})
export class CustomSettingService {
  private tableName = 'CUSTOM_SETTING';

  constructor(private db: DbService) { }

  findAll(): Promise<CustomSetting[]> {
    const bbddOptions = new BBDDOptions(this.tableName, true, '', '');
    return this.db.selectItem(bbddOptions).then((scs) => {
        const customSettings = [];
        if (scs.rows.length > 0) {
          for (let i = 0; i < scs.rows.length; i++) {
            const customSetting = new CustomSetting();
            customSetting.customSettingId = scs.rows.item(i).customSettingId;
            customSetting.theme = scs.rows.item(i).theme;
            customSetting.music = scs.rows.item(i).music;
            customSettings.push(customSetting);
          }
        }
        return customSettings;
      }
    );
  }
}

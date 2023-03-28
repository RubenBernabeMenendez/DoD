import { Component } from '@angular/core';
import {CustomSettingService} from "../../services/custom-setting.service";
import {CustomSetting} from "../../model/CustomSetting";

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public customSettings: CustomSetting[]

  constructor(private customSettingService: CustomSettingService) {}

  showBBDD() {
    this.customSettingService.findAll().then((scs: CustomSetting[]) => {
        if (scs.length > 0) {
          this.customSettings = scs;
          console.log(scs);
        }
      }
    );
  }
}

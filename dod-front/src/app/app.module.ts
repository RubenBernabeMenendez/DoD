import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import {AngularMaterialModule} from "./shared/AngularMaterialModule";
import {HttpClientModule} from "@angular/common/http";

import { SQLite } from '@ionic-native/sqlite/ngx';
import { SQLitePorter } from '@ionic-native/sqlite-porter/ngx';
import { Camera } from '@ionic-native/camera/ngx';
import { File } from '@ionic-native/file/ngx';
import {MainMenuComponent} from "./views/main-menu/main-menu.component";
import {TypeGameMenuComponent} from "./views/type-game-menu/type-game-menu.component";
import {MinigamesMenuComponent} from "./views/minigames-menu/minigames-menu.component";


export const viewComponents = [
  MainMenuComponent,
  TypeGameMenuComponent,
  MinigamesMenuComponent
];

@NgModule({
  declarations: [AppComponent,
    ...viewComponents],
  imports: [BrowserModule, IonicModule.forRoot(), AppRoutingModule, AngularMaterialModule, HttpClientModule],
  exports: [AngularMaterialModule],
  providers: [SQLite, SQLitePorter, Camera, File, { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }],
  bootstrap: [AppComponent],
})
export class AppModule {}

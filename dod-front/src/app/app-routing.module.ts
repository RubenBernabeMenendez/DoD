import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';
import {MainMenuComponent} from "./views/main-menu/main-menu.component";
import {TypeGameMenuComponent} from "./views/type-game-menu/type-game-menu.component";

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./views/home/home.module').then(m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'main-menu',
    pathMatch: 'full'
  },
  {
    path: 'main-menu',
    component: MainMenuComponent
  },
  {
    path: 'type-game-menu',
    component: TypeGameMenuComponent
  }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }

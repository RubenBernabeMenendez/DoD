import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-type-game-menu',
  templateUrl: './type-game-menu.component.html',
  styleUrls: ['./type-game-menu.component.scss'],
})
export class TypeGameMenuComponent implements OnInit {

  public typeGames = [
    {name: 'Minijuegos', url: '/minigames-menu'},
    {name: 'Partida de mundos', url: '/minigames-menu'},
    {name: 'Personalizar partida', url: '/minigames-menu'},
  ];

  constructor() { }

  ngOnInit() {}

}

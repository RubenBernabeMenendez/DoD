import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-minigames-menu',
  templateUrl: './minigames-menu.component.html',
  styleUrls: ['./minigames-menu.component.scss'],
})
export class MinigamesMenuComponent implements OnInit {

  public minigames = [
    'Yo nunca',
    'Azar',
    'Reto de tiempo'
  ];

  constructor() { }

  ngOnInit() {}

}

import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  sidebar: boolean;

  constructor(public router: Router) {
    this.sidebar = true;
  }

  toggleSideBar(){
    this.sidebar = !this.sidebar;
  }
}

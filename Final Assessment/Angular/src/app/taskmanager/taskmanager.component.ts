import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-taskmanager',
  templateUrl: './taskmanager.component.html',
  styleUrls: ['./taskmanager.component.css']
})
export class TaskmanagerComponent implements OnInit {
  
  viewdata: any[] = [];
  constructor() { }

  sendtask(value) {
    console.log(value);
    this.viewdata.push(value);
  }

  delete(i){
    console.log(i);
   this.viewdata.splice(i,1,);
  }

  ngOnInit() {
  }

}

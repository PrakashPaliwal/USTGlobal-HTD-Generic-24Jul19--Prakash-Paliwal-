import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-viewtask',
  templateUrl: './viewtask.component.html',
  styleUrls: ['./viewtask.component.css']
})
export class ViewtaskComponent implements OnInit {
  view:any[]=[];
  constructor(private service: ServiceService) { 
   
  }

  deletedata(i){
    this.service.tasks.splice(i,1,);
  }

  ngOnInit() {
    this.view=this.service.tasks;
    console.log(this.view)
  }
  


}

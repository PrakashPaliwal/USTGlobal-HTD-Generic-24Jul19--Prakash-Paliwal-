import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  carData: any = '';

  cars = [
    {
      brand : 'Sport Car',
      img : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      description : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. In facilis nobis obcaecati hic reiciendis nam laboriosam dolor. Quasi, eos quo.'
    },
    {
      brand : 'BMW',
      img : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      description : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. In facilis nobis obcaecati hic reiciendis nam laboriosam dolor. Quasi, eos quo.'
    },
    {
      brand : 'Martin',
      img : 'https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857__340.jpg',
      description : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. In facilis nobis obcaecati hic reiciendis nam laboriosam dolor. Quasi, eos quo.'
    },
    {
      brand : 'cotvette',
      img : 'https://cdn.pixabay.com/photo/2013/08/11/03/40/corvette-171422__340.jpg',
      description : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. In facilis nobis obcaecati hic reiciendis nam laboriosam dolor. Quasi, eos quo.'
    },
    {
      brand : 'Mustang',
      img : 'https://cdn.pixabay.com/photo/2013/07/12/12/56/ford-mustang-146580__340.png',
      description : 'Lorem ipsum dolor sit amet consectetur adipisicing elit. In facilis nobis obcaecati hic reiciendis nam laboriosam dolor. Quasi, eos quo.'
    }
  ]


  constructor() {
  }

  sendBike(car){
    this.carData = car ;
    console
  }
  ngOnInit() {
  }

}

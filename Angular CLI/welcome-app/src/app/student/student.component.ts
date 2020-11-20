import { Component, OnInit } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  Student:IStudent={}
  Students:IStudent[]=[]

  constructor(){

  }
  LoadStudent(){
    this.Student={
      name:'pawan',rollNo:3,cgpa:5
    }
  }
  LoadStudents(){
    this.Students=[{
      name:'pawan',rollNo:1,cgpa:9
    },
    {
      name:"amit",rollNo:2,cgpa:8
    }
  
  ]
  }
  ngOnInit(): void {
  }

}

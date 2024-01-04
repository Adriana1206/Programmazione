import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-mycalc',
  templateUrl: './mycalc.component.html',
  styleUrl: './mycalc.component.css'
})
export class MycalcComponent implements OnInit{

  inputStr: any;
  ngOnInit(): void{
      this.inputStr = new FormGroup({
        text : new FormControl()
      })
  }

  buttonClick(buttoElement: any){
    let buttonText = buttoElement.textContent
    if(this.inputStr.controls.text.value != null){
      this.inputStr.controls.text.setValue(
        this.inputStr.controls.text.value
        + buttonText)
    }else{
      this.inputStr.controls.text.setValue(buttonText)
    }  
  }

  clearDisplay(){
    this.inputStr.controls.text.setValue("")
  }

  calculate(){
    let resulat = eval(this.inputStr.controls.text.value)
    this.inputStr.controls.text.setValue(resulat)
  }

  deleteLast(){
    let str = this.inputStr.controls.text.value
    str = str.slice(0, -1)
    this.inputStr.controls.text.setValue(str)
  }

}

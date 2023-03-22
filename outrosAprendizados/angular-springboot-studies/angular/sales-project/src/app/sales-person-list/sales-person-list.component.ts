import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list-bootstrap.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  // criar um array de objetos
  salesPersonList: SalesPerson[] = [
    new SalesPerson("Harry", "Potter", "harry.potter@acrossdigital.com.br", 50000),
    new SalesPerson("Hermione", "Granger", "hermione.granger@acrossdigital.com.br", 40000),
    new SalesPerson("Rony", "Weasley", "rony.weasley@acrossdigital.com.br", 90000),
    new SalesPerson("Albus", "Dumbledore", "albus.dumbledore@acrossdigital.com.br", 60000)
  ];

  constructor() { }

  ngOnInit(): void {
  }

}

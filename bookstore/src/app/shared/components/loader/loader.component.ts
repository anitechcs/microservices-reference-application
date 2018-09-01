import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material';

@Component({
  selector: 'app-loader',
  templateUrl: './loader.component.html',
  styleUrls: ['./loader.component.scss']
})
export class LoaderComponent implements OnInit {
  title;
  message;
  constructor(public dialogRef: MatDialogRef<LoaderComponent>) {}

  ngOnInit() {
  }

}

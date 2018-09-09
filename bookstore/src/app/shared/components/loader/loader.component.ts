import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material';

@Component({
  selector: 'app-loader',
  templateUrl: './loader.component.html',
  styleUrls: ['./loader.component.scss']
})
export class LoaderComponent {
  title;
  constructor(public dialogRef: MatDialogRef<LoaderComponent>) {
    this.title = 'Loading..';
  }
}

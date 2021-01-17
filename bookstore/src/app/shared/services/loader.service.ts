import { Injectable } from '@angular/core';
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { Observable } from 'rxjs';
import { LoaderComponent } from '../components/loader/loader.component';

@Injectable()
export class LoaderService {
  dialogRef!: MatDialogRef<LoaderComponent>;
  constructor(private dialog: MatDialog) { }

  public open(title: string = 'Loading..'): Observable<boolean> {
    this.dialogRef = this.dialog.open(LoaderComponent, { disableClose: true, backdropClass: 'light-backdrop'});
    this.dialogRef.updateSize('120px');
    this.dialogRef.componentInstance.title = title;
    return this.dialogRef.afterClosed();
  }

  public close() {
    if (this.dialogRef) {
      this.dialogRef.close();
    }
  }
}

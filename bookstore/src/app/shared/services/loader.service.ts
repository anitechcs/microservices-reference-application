import { Injectable } from '@angular/core';
import { MatDialog, MatDialogRef } from '@angular/material/dialog';
import { Observable } from 'rxjs';
import { LoaderComponent } from '../components/loader/loader.component';

@Injectable()
export class LoaderService {
  dialogRef!: MatDialogRef<LoaderComponent>;
  constructor(private dialog: MatDialog) { }

  public open(): Observable<boolean> {
    this.dialogRef = this.dialog.open(LoaderComponent, { disableClose: true, height: '80px', width: '80px'});
    return this.dialogRef.afterClosed();
  }

  public close() {
    if (this.dialogRef) {
      this.dialogRef.close();
    }
  }
}

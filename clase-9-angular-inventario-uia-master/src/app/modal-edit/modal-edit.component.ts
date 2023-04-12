import { Component, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatPaginator, PageEvent} from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { DatosService } from '../datos.service'
import { IPartida }  from '../../assets/IPartida'
import { Router } from '@angular/router';
@Component({
  selector: 'app-modal-edit',
  templateUrl: './modal-edit.component.html',
  styleUrls: ['./modal-edit.component.css']
})
export class ModalEditComponent {

  constructor(
    public dialogRef: MatDialogRef<ModalEditComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {}

  onNoClick(): void {
    this.dialogRef.close();
  }

  onConfirmClick(): void {
    // Aquí puedes realizar la acción que necesites al confirmar la edición
    // En este ejemplo, simplemente se cierra el modal
    this.dialogRef.close();
  }

}

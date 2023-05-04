import { Component, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import {MatPaginatorModule} from '@angular/material/paginator';
import {MatPaginator, PageEvent} from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { DatosService } from '../datos.service'
import { IPartida }  from '../../assets/IPartida'
import { Router } from '@angular/router';
import { IItem, ISolicitudMaterial } from '../ISolicitudMaterial';
@Component({
  selector: 'app-modal-edit',
  templateUrl: './modal-edit.component.html',
  styleUrls: ['./modal-edit.component.css']
})
export class ModalEditComponent {

  solicitudes: ISolicitudMaterial[] | undefined;
  items: IItem[] | undefined;

  constructor(public dialog: MatDialog, private datosSolicitud: DatosService) {
    this.datosSolicitud.getSolicitudesMaterial().subscribe((data: ISolicitudMaterial[]) => {
      console.log(data);
      this.solicitudes = data; // Inicializar la propiedad "solicitudes" con los datos obtenidos del servicio
    });
    console.log("en modal");
  }
  openDialog() {
    const dialogRef = this.dialog.open(ModalEditComponent);

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }
}
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { DocumentsComponent } from './components/documents/documents.component';

const routes: Routes = [
    { path: '', component: DashboardComponent },
    { path: 'documents', component: DocumentsComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }

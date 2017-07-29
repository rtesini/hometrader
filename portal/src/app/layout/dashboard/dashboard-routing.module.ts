import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { DocumentsComponent } from './components/documents/documents.component';
import { HelpComponent } from './components/help/help.component';
import { TasksComponent } from './components/tasks/tasks.component';

const routes: Routes = [
    { path: '', component: DashboardComponent },
    { path: 'documents', component: DocumentsComponent},
    { path: 'help', component: HelpComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }

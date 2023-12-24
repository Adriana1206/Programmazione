import { Routes } from '@angular/router';
import { ClienteFormComponent } from './cliente-form/cliente-form.component';
import { Page404Component } from './page404/page404.component';
import { ClientiComponent } from './clienti/clienti.component';

export const routes: Routes = [
    {path: '', redirectTo: 'home', pathMatch: 'full' }, // redirect alla pagina di default
    {path:"home", component:ClientiComponent},
    {path:"delete/:mode/:id", component:ClienteFormComponent},
    {path:"create/:mode/:id", component:ClienteFormComponent},
    {path:"**", component:Page404Component},
];

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SearchRoutingModule } from './search-routing.module';
import { SearchComponent } from './search.component';
import { PageHeaderModule } from './../../shared';

@NgModule({
    imports: [
        CommonModule,
        SearchRoutingModule,
        PageHeaderModule
    ],
    declarations: [SearchComponent]
})
export class SearchModule { }

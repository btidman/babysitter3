import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { GigsComponent } from './gigs/gigs.component';
import { GigService } from './gig.service'


@NgModule({
  declarations: [
    AppComponent,
    GigsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    GigService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }

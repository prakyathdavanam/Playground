import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {ContentService} from './content.service';

import { AppComponent } from './app.component';
import { ContentsComponent } from './contents/contents.component';


@NgModule({
  declarations: [
    AppComponent,
    ContentsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [ContentService],
  bootstrap: [AppComponent]
})
export class AppModule { }

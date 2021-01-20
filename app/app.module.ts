import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CarouselComponent } from './carousel/carousel.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { BottomComponent } from './bottom/bottom.component';
import { OwnerregisterComponent } from './ownerregister/ownerregister.component';
import { HomeComponent } from './home/home.component';
import { CustomerhomeComponent } from './customerhome/customerhome.component';
import { OwnerhomeComponent } from './ownerhome/ownerhome.component';
import { ProfileComponent } from './profile/profile.component';
import { RentcarComponent } from './rentcar/rentcar.component';

const appRoot: Routes = [{path: '', component: HomeComponent},
{path: 'login', component: LoginComponent},
{path: 'register', component: RegisterComponent},
{path: 'ownerregister', component: OwnerregisterComponent},
{path: 'ownerhome', component:  OwnerhomeComponent},
{path: 'customerhome', component: CustomerhomeComponent},
{path: 'profile', component: ProfileComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    CarouselComponent,
    FooterComponent,
    BottomComponent,
    OwnerregisterComponent,
    HomeComponent,
    CustomerhomeComponent,
    OwnerhomeComponent,
    ProfileComponent,
    RentcarComponent,
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule,    // modules
    RouterModule.forRoot(appRoot),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

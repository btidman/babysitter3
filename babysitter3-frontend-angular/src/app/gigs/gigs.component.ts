import { Component, OnInit } from '@angular/core';
import { Gig } from '../gig';
import { GigService } from '../gig.service';

@Component({
  selector: 'app-gigs',
  templateUrl: './gigs.component.html',
  styleUrls: ['./gigs.component.css']
})
export class GigsComponent implements OnInit {

  selectedGig: Gig;
  gigs : Gig[];

  constructor(private gigService: GigService) { }

  ngOnInit() {
    this.selectedGig = new Gig();
    this.gigService.getGigs().subscribe(gigs => this.gigs = gigs);
  }

  selectGig(gig: Gig){
    this.selectedGig = gig;
  }

  saveNewGig(){
    this.gigService.saveNewGig(this.selectedGig).subscribe(() => this.ngOnInit());
    this.selectedGig = new Gig();
  }

  saveGig(){
    this.gigService.saveGig(this.selectedGig).subscribe(() => this.ngOnInit());
    this.selectedGig = new Gig();
  }
}

import { Injectable } from '@angular/core';
import { Gig } from './gig';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';


@Injectable()
export class GigService {

  constructor(private http: HttpClient) { }

  getGigs(): Observable<Gig[]> {
    return this.http.get<Gig[]>('http://localhost:8080/gigs');
    
  }

  saveGig(gig: Gig): Observable<any> { 
    return this.http.put('http://localhost:8080/gigs', gig);
  }

  saveNewGig(gig: Gig): Observable<any> { 
    return this.http.post('http://localhost:8080/gigs', gig);
  }
}

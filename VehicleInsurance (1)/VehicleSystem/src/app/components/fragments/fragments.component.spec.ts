import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FragmentsComponent } from './fragments.component';

describe('FragmentsComponent', () => {
  let component: FragmentsComponent;
  let fixture: ComponentFixture<FragmentsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FragmentsComponent]
    });
    fixture = TestBed.createComponent(FragmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

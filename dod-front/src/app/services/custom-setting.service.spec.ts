import { TestBed } from '@angular/core/testing';

import { CustomSettingService } from './custom-setting.service';

describe('CustomSettingService', () => {
  let service: CustomSettingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomSettingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

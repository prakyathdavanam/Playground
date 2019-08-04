import { Injectable } from '@angular/core';
import{contents} from './contents';
import {CONTENTS} from './stock';
@Injectable()
export class ContentService {
private content1  : contents[] = CONTENTS;
getcontents():contents[] {
	return this.content1;
}
searchCom(Company: string): contents[] {

  return this.content1;
 }
  constructor() { }

}

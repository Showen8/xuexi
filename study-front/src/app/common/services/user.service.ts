import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { ApiResponse } from "../model/api.response";
import { UserInfoVo } from "../model/user.info.vo";


@Injectable({
    providedIn: 'root'
})

export class UserService {

    constructor(private http: HttpClient) { }
  
    userRegister(params: UserInfoVo) : Observable<ApiResponse> {
      return this.http.post<ApiResponse>(`${environment.baseUrl}/register`, params);
    }
  }
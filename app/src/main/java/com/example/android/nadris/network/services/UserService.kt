package com.example.android.nadris.network.services

import com.example.android.nadris.network.models.AuthModel
import com.example.android.nadris.network.models.CreateStudentAccountDataModelModel
import com.example.android.nadris.network.models.CreateTeacherAccountDataModelModel
import com.example.android.nadris.network.models.LoginAccountModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService{

    @POST("api/Auth/Token")
    suspend fun login( @Body loginAccountData: LoginAccountModel): Response<AuthModel>  // send email and password and receive token as return string

    @POST("api/Auth/Register/Student")
    suspend fun createStudentAccount(@Body studentAccountDataModel: CreateStudentAccountDataModelModel): Response<AuthModel>

    @POST("api/Auth/Register/Teacher")
    suspend fun createTeacherAccount(@Body TeacherAccountDataModel: CreateTeacherAccountDataModelModel): Response<AuthModel>



}

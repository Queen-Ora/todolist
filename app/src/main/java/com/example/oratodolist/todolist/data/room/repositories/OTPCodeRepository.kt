package com.example.oratodolist.todolist.data.room.repositories


import com.example.oratodolist.todolist.data.room.models.OTPCode
import com.example.oratodolist.todolist.data.room.daos.OTPCodeDao
import kotlinx.coroutines.flow.Flow

class OTPCodeRepository(
    private val otpCodeDao: OTPCodeDao
){
    suspend fun insert(optCode: OTPCode){otpCodeDao.insert(optCode)}
    fun checkOtpCode(email: String,code: String): Flow<List<OTPCode>> =otpCodeDao.checkOtpCode(email,code)

}

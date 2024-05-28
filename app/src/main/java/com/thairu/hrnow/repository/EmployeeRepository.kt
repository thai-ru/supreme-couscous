package com.thairu.hrnow.repository

import androidx.lifecycle.MutableLiveData
import com.thairu.hrnow.data.Employee
import com.thairu.hrnow.data.EmployeeDAO
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EmployeeRepository(private val employeeDao: EmployeeDAO) {
    val allEmployees = MutableLiveData<List<Employee>>()
    val foundEmployee = MutableLiveData<Employee>()
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun addEmployee(newEmployee: Employee) {
        coroutineScope.launch(Dispatchers.IO) {
            employeeDao.addEmployee(newEmployee)
        }
    }

    fun updateEmployeeDetails(newEmployee: Employee) {
        coroutineScope.launch(Dispatchers.IO) {
            employeeDao.updateEmployeeDetails(newEmployee)
        }
    }

}
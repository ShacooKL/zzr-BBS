import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import * as api from "@/api"
export const useUserStore = defineStore('user', () => {

  const isLogin = ref(false)
  const userId = ref(-1)
  const userName = ref("default")

  const login = ((username,password) => {
    const result =  api.login(username,password)
    if(result==null){
      alert("登录失败")
    }else{
      alert("登陆成功")
      isLogin.value = true
      userId.value = result.id
      userName.value = username
    }
  })

  const register = ((username,password,gender) => {
    const result =  api.register(username,password,gender)
    console.log(result)
    if(result==null){
      alert("注册失败")
    }else{
      alert("注册成功")
    }
  })

 

  return { isLogin,userId,userName,login,register}
})

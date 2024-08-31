// api.js
import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080';

// 创建 Axios 实例
const api = axios.create({
  baseURL: API_BASE_URL,
  timeout: 5000, // 请求超时时间
  headers: {
    'Content-Type': 'application/json', // 设置请求头
  },
});

export const login = async (username,password) => {
  await api.post('login', {
    username: username,        // 参数 firstName
    password: password   // 参数 lastName
  })
  .then(function (response) {
    console.log(response.data)
    return response.data
  })
  .catch(function (error) {
    console.log(error);
  });


};
export const register = (name,password,gender) => {
	// 正常：
  const genderNum = gender=='男'?'1':'2'
  api.post('users/register', {
    username: name,        // 参数 firstName
    password: password,
    gender:genderNum   // 参数 lastName
  })
  .then(function (response) {
    console.log(response);
  })
  .catch(function (error) {
    console.log(error);
  });
	// 测试：
	// // 模拟异步请求
  // return new Promise((resolve, reject) => {
  //   setTimeout(() => {
	// 		console.log(name)
	// 		console.log(password)
  //     // 模拟异步操作成功，返回数据
  //     if(password =='123')
  //       resolve({state:true,id:55210919,name:name,avatar:'/img/profile.jpg',email:name+'@qq.com'});
  //     else
  //       resolve({state:false})
  //     // 或者模拟异步操作失败y
  //     // reject(new Error('Failed to fetch book.'));
  //   }, 50); 
  // });

};
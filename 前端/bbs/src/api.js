// api.js
import axios from 'axios';

const API_BASE_URL = 'http://localhost:8888/Web';

// 创建 Axios 实例
const api = axios.create({
  baseURL: API_BASE_URL,
  timeout: 5000, // 请求超时时间
  headers: {
    'Content-Type': 'application/json', // 设置请求头
  },
});

export const login = (name,password) => {
	// 正常：
  // return axios.get(`/book/query/${id}`);
	// 测试：
	// 模拟异步请求
  return new Promise((resolve, reject) => {
    setTimeout(() => {
			console.log(name)
			console.log(password)
      // 模拟异步操作成功，返回数据
      if(password =='123')
        resolve({state:true,id:55210919,name:name,avatar:'/img/profile.jpg',email:name+'@qq.com'});
      else
        resolve({state:false})
      // 或者模拟异步操作失败y
      // reject(new Error('Failed to fetch book.'));
    }, 50); 
  });

};
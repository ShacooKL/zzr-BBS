<script setup>
import { ref } from 'vue';
import * as api from '@/api' ;
import { useRoute, useRouter } from 'vue-router'
const username = ref('')
const password = ref('')
const router = useRouter()
const login = (()=>{
	api.login(username.value,password.value)
})
const toRegister = (async ()=>{
	router.push('/register')
})
</script>
<template>
<div class="column">
	<div class="row">
		<div class="box">
				<div class="title">
					Login
				</div>
				<div class="input" @keydown.enter="login">
					<div class="input-item">
						<span>用户名</span>
						<input type="text" v-model="username">
					</div>
					<div class="input-item">
						<span>密码</span>
						<input type="password" v-model="password">
					</div>
				</div>
				<div class="button">
					<button @click="login" type="submit">登录</button>
					<button @click="toRegister"> 注册</button>
				</div>
		</div>
	</div>
	
</div>
	
</template>
<style scoped>
.column{
	min-width: 100vw;
	min-height: 100vh;
	position: relative;
	display: flex;
	flex-direction: column;
	justify-content: center;
}
.row{
	display: flex;
	flex-direction: row;
	justify-content: center;
	width: 100vw;
}
.box{
	border: 1.5px solid black;
	border-radius: 15px;
	width: 700px;
	height: 500px;
	position: relative;
}
.title{
	font-size: 30px;
	font-weight: 600;
	text-align: center;
	padding: 20px;
	margin-bottom: 50px;
}
.input-item{
	display: flex;
	padding: 20px;
	width: 100%;
	box-sizing: border-box;
	justify-content: center;
}
.input span{
	margin-right: 20px;
	line-height: 30px;
	width: 60px;
}
input{
	height: 30px;
	width: 60%;
	outline: none;
	border: 1.7px solid black;
	border-radius: 7px;
	padding: 10px;
	box-sizing: border-box;
	font-size: 15px;
}
input::selection{
	border:none ;
}
.button{
	display: flex;
	width: 30%;
	justify-content: space-between;
	position: absolute;
	left: 35%;
	bottom: 100px;
}
button{
	width: 80px;
	height: 40px;
	border-radius: 10px;
	background-color: #53adc6;
	border: none;
	cursor: pointer;
}

</style>
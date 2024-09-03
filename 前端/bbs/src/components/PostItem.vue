<script setup>
import { ref } from 'vue';
import { MdPreview } from 'md-editor-v3';
const text = ref('Hello Editor!Hello Editor!Hellor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Edito Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!Hello Editor!');

const isExpand = ref(false)
const expand = (()=>{
	isExpand.value = !isExpand.value
	console.log("aaa")
})


</script>
<template>
<div class="postItem">
		<div class="title">
			zzr是世界上最好的小宝
		</div>
		<div class="person">
			<div class="avatar">

			</div>
			<div class="userName">
				ZZR忠实粉丝
			</div>
		</div>
		<div class="passage">
			<MdPreview v-model="text" class="mdp" :class="{ unexpand: !isExpand }"/>
			<button @click="expand">expand</button>
		</div>
		
</div>
</template>
<style scoped>
.postItem{
	width: 100%;
	min-height: 200px;
	background-color: #63a096;
	margin-bottom: 10px;
}
.postItem .title{
	font-size: 20px;
	font-weight: 600;
	font-family: '微软雅黑';
	padding: 10px 15px ;
}
.person{
	height: 30px;
	background-color: #7b7777;
	display: flex;
	padding: 0 15px;
	line-height: 30px;
	font-weight: bold;
}
.avatar{
	height: 30px;
	width: 30px;
	border-radius: 5px;
	background-color: #fff;
	margin-right: 10px;
}
.mdp{
	overflow: hidden;
	padding: 10px;

}
button{
	width: 80px;
	height: 40px;
	border: none;
	background-color: #1b6593;
}
.unexpand{
	max-height: 120px;
}
.passage{

}
</style>
<script setup>
import { ref } from 'vue';
import { MdPreview } from 'md-editor-v3';
const text = ref('Hello Editor!');
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
			<MdPreview v-model="text" />
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
</style>
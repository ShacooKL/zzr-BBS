<script setup>
import { ref, watch } from 'vue';
const postContent = ref('')
const textarea = ref(null)
const autoResize = (()=>{
	textarea.value.style.height = 'auto';
	textarea.value.style.height = textarea.value.scrollHeight + 'px';
})
</script>
<template>
<div class="box">
	<div class="editor">
		<textarea  ref="textarea" @input="autoResize()" v-model="postContent" placeholder="发个若博特吧！">
		</textarea>
	<span v-if="postContent.length>0">{{ postContent.length }}</span>
	</div>
	<button>发送</button>
</div>


</template>
<style scoped>
.box{
	width: 100%;
	min-height: 200px;
	background-color: #fff;
	border-radius: 15px;
	margin-bottom: 10px;
	padding: 20px;
	box-sizing: border-box;
}
.box textarea{
	width: 100%;
	min-height: 60px;
	border: none;
	border-radius: 15px;
	background-color: #ededed;
	padding: 10px 10px 30px;
	resize: none;
	font-size: 15px;
	font-family: '微软雅黑';
	box-sizing: border-box;
}
.box textarea:focus{
	background-color: #ffffff;
	outline:1px solid rgb(213, 127, 15);
}
.editor{
	position: relative;
}
.editor span{
	position: absolute;
	bottom: 10px;
	right: 10px;
	font-size: 14px;
	color: #6f6f6f;
}
button{
	border: none;
	background-color: #eabe96;
}
</style>
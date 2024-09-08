<script setup>
import { ref, watch } from 'vue';

//文字输入组件ref
const textarea = ref(null)
//图片input组件 ref
const imgInput = ref(null)

//帖子文字内容
const postContent = ref('')
//图片临时url列表
const imgUrls = ref([])
const addColor = ref("#666666")

const autoResize = (()=>{
	//textarea自动调整高度
	textarea.value.style.height = 'auto';
	textarea.value.style.height = textarea.value.scrollHeight + 'px';
})

const previewImage = (()=>{
	//自动生成图片url并更新url列表
	imgUrls.value = []
	for(const file of imgInput.value.files){
		imgUrls.value.push(URL.createObjectURL(file)  )
	}
})

const removeImage = (index) => {
	imgUrls.value.splice(index, 1);  // 删除对应索引的图片
}

const aa = (()=>{
	imgInput.value.click()
})
</script>
<template>

<div class="box">
	<!-- 文字输入部分 -->
	<div class="editor">
		<textarea  ref="textarea" @input="autoResize()" v-model="postContent" placeholder="发个若博特吧！">
		</textarea>
		<span v-if="postContent.length>0">{{ postContent.length }}</span>
	</div>
	<!-- 图片输入部分 -->
	<input ref="imgInput" type="file" @change="previewImage" multiple v-show="false">

	

	<!-- 图片预览-->
	<div class="imgPreview">
		<div v-for="(image, index) in imgUrls" :key="index" class="image-item">
			<img :src="image" alt="Image preview" />
			<svg @click="removeImage(index)" t="1725787733373" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="2430" width="200" height="200"><path d="M512 149.333c200.299 0 362.667 162.368 362.667 362.667S712.299 874.667 512 874.667 149.333 712.299 149.333 512 311.701 149.333 512 149.333zM625.13 353.6L512.022 466.73 398.87 353.6 353.6 398.87l113.152 113.109L353.6 625.13l45.27 45.269L512 557.227l113.13 113.152 45.27-45.27L557.227 512l113.152-113.13-45.27-45.27z" p-id="2431"></path></svg>
			
		</div>
		<div class="addImg" @click="aa" @mouseover="addColor='#dda02e'" @mouseleave="addColor='#666666'">
			<svg viewBox="0 0 1024 1024" width="30" height="30"><path d="M426.666667 426.666667H85.546667A85.418667 85.418667 0 0 0 0 512c0 47.445333 38.314667 85.333333 85.546667 85.333333H426.666667v341.12c0 47.274667 38.186667 85.546667 85.333333 85.546667 47.445333 0 85.333333-38.314667 85.333333-85.546667V597.333333h341.12A85.418667 85.418667 0 0 0 1024 512c0-47.445333-38.314667-85.333333-85.546667-85.333333H597.333333V85.546667A85.418667 85.418667 0 0 0 512 0c-47.445333 0-85.333333 38.314667-85.333333 85.546667V426.666667z" :fill="addColor" p-id="1439"></path></svg>
		</div>
	</div>

	
	<button class="postButton">发送</button>
	{{ imageUrl }}
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
	position: relative;
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
.imgPreview{
	display: flex;
	margin: 10px 10px 40px 0;
	flex-wrap: wrap;
}
.image-item{
	margin: 10px 10px 10px 0;
	position: relative;
	width: 100px;
	height: 100px;
	border-radius: 10px;
	border: 1px solid rgb(137, 137, 137);
}
.image-item img{
	width: 100%;
	height: 100%;
}
.image-item button{
	position: absolute;
	z-index: 999;
	width: 15px;
	height: 15px;
	right: 5px;
	top: 5px;
	border-radius: 50%;
	cursor: pointer;
}

.image-item svg{
	position: absolute;
	z-index: 999;
	width: 20px;
	height: 20px;
	right: 5px;
	top: 5px;
	border-radius: 50%;
	cursor: pointer;
	fill: #c6c6c6;
}
.image-item svg:hover{
	fill: #ff9641;
}

.addImg{
	width: 100px;
	height: 100px;
	border: 1px dashed black;
	border-radius: 10px;
	cursor: pointer;
	align-items: center;
	display: flex;
	justify-content: center;
	margin: 10px 10px 10px 0;
}
.addImg:hover{
	border: 1px dashed #dda02e;;
}
.postButton{
	width: 80px;
	height: 40px;
	border-radius: 25px;
	background-color: #f3a25f;
	cursor: pointer;
	color: white;
	font-size: 13px;
	position: absolute;
	right: 20px;
	bottom: 20px;
}
.postButton:hover{
	background-color: #fb7e17;
}
</style>
<script setup>
import { ref } from 'vue';
import {  MdPreview } from 'md-editor-v3';
import PostIcon from '@/components/PostIcon.vue';
const text = ref('zzr最美最漂亮最可爱\nhhh');

const isExpand = ref(false)
const expand = (()=>{
	isExpand.value = !isExpand.value
	console.log("aaa")
})
const stateActive = (()=>{

})

</script>
<template>

<div class="postItem">
	<div class="header">
		<div class="avatar">
			<img src="@/assets\img\profile.jpg" alt="avatar">
		</div>

		<right>
			<div class="userName">
				ZZR忠实粉丝
			</div>
			<div class="time">2024/9/5</div>
		</right>
		
	</div>
		
		<div class="body">
			<div class="passage">
				<MdPreview v-model="text" class="mdp" :class="{ unexpand: !isExpand }"/>
			</div>
			<div class="state">

				<PostIcon text="转发" path="M832 250.352L468.215 612.354c-15.66 15.582-40.986 15.52-56.569-0.14-15.582-15.659-15.52-40.985 0.14-56.568L777.222 192H626c-22.091 0-40-17.909-40-40s17.909-40 40-40h174c61.856 0 112 50.144 112 112v174c0 22.091-17.909 40-40 40s-40-17.909-40-40V250.352z m0 339.909c0-22.092 17.909-40 40-40s40 17.908 40 40V800c0 61.856-50.144 112-112 112H224c-61.856 0-112-50.144-112-112V224c0-61.856 50.144-112 112-112h209.74c22.09 0 40 17.909 40 40s-17.91 40-40 40H224c-17.673 0-32 14.327-32 32v576c0 17.673 14.327 32 32 32h576c17.673 0 32-14.327 32-32V590.26z"/>
				<PostIcon text="评论"/>
				<PostIcon text="点赞" path=" M301.546 280.724l224.3-196.378a88 88 0 0 1 53.785-18.35c48.601 0 88 39.399 88 88V262c0 17.673 14.327 32 32 32h101.295a112 112 0 0 1 19.63 1.734c60.898 10.84 101.477 68.997 90.636 129.896l-70.14 394C831.538 873.073 785.069 912 730.786 912H370c-61.856 0-112-50.144-112-112V369.369a112 112 0 0 1 43.546-88.645zM338 800c0 17.673 14.327 32 32 32h360.786c15.51 0 28.786-11.122 31.504-26.392l70.14-394c3.098-17.4-8.496-34.015-25.896-37.113a32 32 0 0 0-5.608-0.495H699.63c-61.856 0-112-50.144-112-112V153.996a8 8 0 0 0-12.89-6.332l-224.3 196.378A32 32 0 0 0 338 369.369V800zM192 379v445c0 53.333-80 53.333-80 0V379c0-53.333 80-53.333 80 0z"/>
			</div>
			
		</div>
		<!--  转发 评论  -->
		<div class="bottom">
				
		</div>
		
		
</div>
</template>
<style scoped>
.postItem{
	width: 100%;
	min-height: 200px;
	background-color: #ffffff;
	margin-bottom: 10px;
	border-radius: 15px;
	padding: 20px;
	box-sizing: border-box;
}

.avatar{
	height: 50px;
	width: 50px;
	border-radius: 5px;
	background-color: #fff;
	margin-right: 10px;
}
.avatar img{
	width: 100%;
	height: 100%;
	border-radius: 50%;
}
.header{
	display: flex;
	line-height: 30px;
	font-weight: bold;
}

.header span{
	font-size: 14px;
	font-weight: 400;
	color: #8e8e8e;
}
.header .userName{
	font-size: 20px;
	font-weight: 600;
	font-family: '微软雅黑';

}
.time{
	color: #8e8e8e;
	font-size: 14px;
	height: 14px;
	line-height: 14px;
	font-weight: 400;
}
.mdp{
	overflow: hidden;
	padding: 10px 0px;

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
.body{
	padding: 0px 60px;
}
.state{
	display: flex;
	justify-content: space-between;
	padding: 15px 0px;
}
.state-item{
	background-color: #ffffff;
	height: 30px;
	min-width: 60px;
	display: flex;
	font-size: 15px;
	align-items: center;
	cursor: pointer;
}

.state-item .icon{
	height: 25px;
	width: 25px;

	border-radius: 10px;
	margin-right: 5px;
	align-items: center;
	display: flex;
	justify-content: center;
}
.state-item .icon:hover{
	background-color: #eed9b8;
}
.state-item .icon svg{
	display: block;
}

</style>
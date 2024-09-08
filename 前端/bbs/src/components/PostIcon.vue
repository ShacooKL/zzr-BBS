<script setup>
import { ref } from 'vue';
const props = defineProps({
  text: {
		type:String,
		default:"icon"
	},
  path: {
		type:String,
		default:"M176 193c-17.673 0-32 14.327-32 32v481c0 17.673 14.327 32 32 32h27c51.915 0 94 42.085 94 94v45.5a1.94 1.94 0 0 0 3.293 1.388l117.045-114.176A94 94 0 0 1 482.976 738H848c17.673 0 32-14.327 32-32V225c0-17.673-14.327-32-32-32H176z m0-80h672c61.856 0 112 50.144 112 112v481c0 61.856-50.144 112-112 112H482.976a14 14 0 0 0-9.776 3.978L356.156 936.154c-32.394 31.6-84.271 30.956-115.87-1.437A81.94 81.94 0 0 1 217 877.5V832c0-7.732-6.268-14-14-14h-27c-61.856 0-112-50.144-112-112V225c0-61.856 50.144-112 112-112z m336 438c-35.346 0-64-28.654-64-64 0-35.346 28.654-64 64-64 35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64z m228 0c-35.346 0-64-28.654-64-64 0-35.346 28.654-64 64-64 35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64z m-456 0c-35.346 0-64-28.654-64-64 0-35.346 28.654-64 64-64 35.346 0 64 28.654 64 64 0 35.346-28.654 64-64 64z"
	},
	color: {
		type:String,
		default:"#000000"
	}
})
const iconColor = ref("#000000")
const isHover = ref(false)
const hoverEvent=(()=>{
	isHover.value = true
	iconColor.value="#dda02e"

})
const resetEvent=(()=>{
	isHover.value = false
	iconColor.value=props.color
})

</script>
<template>
	<div class="postIcon" @mouseenter="hoverEvent"   @mouseleave="resetEvent" :class={hoverColor:isHover}>
		<div class="icon" :class={hoverIcon:isHover}>
			<svg viewBox="0 0 1024 1024" width="20" height="20"><path :fill=iconColor :d=path ></path></svg>
		</div>
		{{ text }}
	</div>

</template>

<style scoped>
.postIcon{
	background-color: #ffffff;
	height: 30px;
	min-width: 60px;
	display: flex;
	font-size: 15px;
	align-items: center;
	cursor: pointer;
}

.postIcon .icon{
	height: 25px;
	width: 25px;
	border-radius: 10px;
	margin-right: 5px;
	align-items: center;
	display: flex;
	justify-content: center;
}
.hoverColor{
	color: #dda02e;
}
.hoverIcon{
	background-color: #eed9b8;
}
</style>
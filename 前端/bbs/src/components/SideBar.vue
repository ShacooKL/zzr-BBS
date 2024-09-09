<script setup>
import { ref } from 'vue';
const props = defineProps({
	title:String
})
</script>

<template>

<div class="left-side-bar">
	<div class="title">
		{{$props.title}}
	</div>
	<slot></slot>
</div>

</template>



<style scoped>
.left-side-bar{
	height: 100vh;
  width: 200px;
  background-color: #fff;
  margin-right: 20px;
  position: sticky;
  top: 75px;
  border-radius: 5px;
}
.left-side-bar .title{
	font-size: 22px;
	padding: 15px;
	font-family: '微软雅黑';
}
</style>
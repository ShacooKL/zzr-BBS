<script setup>
import PostItem  from '@/components/PostItem.vue'
import PostEditor  from '@/components/PostEditor.vue'
import SideBar  from '@/components/SideBar.vue'
import Header  from '@/components/Header.vue'
</script>
<template>
<div class="body">
  <Header/>
  <div class="main">
   
    <SideBar title="首页">
      <div class="side-items">
        <div class="side-item">
          我的关注
        </div>
        <div class="side-item">
          最新若博
        </div>
      </div>

    </SideBar>
    <div class="mid">
      <PostEditor class="postEditor"/>
      <div class="posts">
        <PostItem/>
      </div>
      <div class="right">

      </div>
      
    </div>
    
  </div>

</div>

	
</template>


<style scoped>
.body{
  background-color: #eaeaea;
}
.editor{
	width: 500px;
	height: 200px;
	display: block;
}


.main{
  height: 2000px;
	min-height: 100vh;
  display: flex;
  flex-direction: row;
  position: relative;
  justify-content: center;
}
.posts{
  width: 700px;
}
.postEditor{
  width: 700px;
}
.mid{
  display: flex;
  flex-direction: column;
}
.side-item{
  margin: 0 5px;
  padding: 10px;
  border-radius: 5px;
  cursor: pointer;
}
.side-item:hover{
  background-color: #d9d9d9;
}
</style>

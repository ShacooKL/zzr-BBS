<script setup>
import PostItem  from '@/components/PostItem.vue'
import PostEditor  from '@/components/PostEditor.vue'
</script>
<template>
<div class="body">
  <div class="header">
    <img src="@/assets/img/zzr1.jpg" alt="">
    <div class="text">
      <span class="ruobo">若博特</span>
      <span class="website">www.ruobot.com</span>
    </div>
    <div class="search">
      <div class="icon">
        <svg  class="icon" viewBox="0 0 1024 1024" ><path d="M970.837333 919.850667l-205.696-205.653334A382.421333 382.421333 0 0 0 853.333333 469.333333a384 384 0 0 0-384-384 384 384 0 0 0-384 384 384 384 0 0 0 384 384 382.421333 382.421333 0 0 0 244.906667-88.192l205.653333 205.653334a36.053333 36.053333 0 0 0 50.986667 0 36.266667 36.266667 0 0 0-0.042667-50.944z m-380.117333-162.986667c-38.4 16.256-79.189333 24.448-121.386667 24.448a311.296 311.296 0 0 1-220.586666-91.392A311.296 311.296 0 0 1 157.312 469.333333 311.296 311.296 0 0 1 248.746667 248.746667 311.296 311.296 0 0 1 469.333333 157.354667a311.296 311.296 0 0 1 220.586667 91.392A311.296 311.296 0 0 1 781.354667 469.333333a311.296 311.296 0 0 1-91.392 220.586667 310.186667 310.186667 0 0 1-99.242667 66.901333z" fill="#595959" p-id="1535"></path></svg>
      </div>
      <div class="input"><input placeholder="搜索若博"></div>
      
    </div>
    <div class="post">
          <svg viewBox="0 0 1024 1024"><path d="M989.953 192.762L467.111 771.048s-31.231 43.13-61.511 16.063c-28.898-25.834-34.577-52.784-8.145-81.354l530.986-577.249c15.862-14.515 49.99-44.157 76.889-16.063 24.474 25.563 11.058 51.744-15.377 80.317zM818.342 79.95l-674.534 0.318c-46.003 8.032-55.495 34.78-55.495 102.238l-1.52 663.052c0 68.14 10.612 94.776 58.214 102.508l663.865-0.277c46.362-8.039 56.821-34.792 56.821-102.23l1.238-278.724c0-29.163 17.134-52.804 38.27-52.804 21.135 0 38.269 23.641 38.269 52.804l0.313 378.062c-10.872 45.235-48.564 78.788-93.815 78.788H798.29l-644.092 0.315-51.678-0.315c-50.796 0-92.021-42.235-96.414-95.909l-0.302-824.245c2.93-55.222 44.892-99.15 96.717-99.15h51.678L818.342 0c26.835 0 48.59 17.897 48.59 39.975 0 22.077-21.755 39.975-48.59 39.975z" fill="#f1a365" p-id="3498"></path></svg>
       </div>
  </div>
  <div class="main">
    <PostEditor/>
    <PostItem/>
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
.header{
  z-index: 999;
	width: 100vw;
	height: 70px;
	background-color: #ffffff;
  margin-bottom: 20px;
  display: flex;
  align-items: center;
  border-top: 2px solid rgb(205, 131, 11);
  position: sticky;
  top: 0px;
}
.text{
  display: flex;
  flex-direction: column;
  margin-left: 10px;
  font-style: italic;
}
.ruobo{
  font-size: 20px;
  font-weight: bold;
  margin-top: 10px ;
}
.website{
  font-size: 12px;
  
}
.header img{
  width: 50px;
  height: 50px;
  border-radius: 50%;
  margin: 5px 0 0 100px;

}
.main{
	width: 50vw;
	min-height: 100vh;
	margin-left: 25vw ;
}

.search{
  height: 32px;
  min-width: 200px;
  background-color: #ebebeb;
  margin-left: 20px;
  border-radius: 14px;
  display: flex;
  align-items: center;
  box-sizing: border-box;
  padding: 5px;
}
.search .icon{
  margin-top: 2px;
}
.search svg{
  width: 20px;
  height: 20px;
} 
.search input{
  border: none;
  background-color: #ebebeb;
  outline: none;
  margin-left: 5px;
  font-size: 15px;

}
.post{
  height: 30px;
  width: 30px;
  margin-left: 40px;
  cursor: pointer;
}
.post svg{
  height: 100%;
  width: 100%;
}
</style>

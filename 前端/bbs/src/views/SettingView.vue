<script setup>
import PostItem  from '@/components/PostItem.vue'
import PostEditor  from '@/components/PostEditor.vue'
import SideBar  from '@/components/SideBar.vue'
import Header  from '@/components/Header.vue'
import { ref } from 'vue';

const selectedSideItem = ref(true)
</script>
<template>
<div class="body">
  <Header/>
  <div class="main">
   
    <SideBar title="设置">
      <div class="side-items">
        <div class="side-item" :class="{selected:selectedSideItem}">
          <svg :class="{selected:selectedSideItem}" t="1725869440092" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="9047" width="200" height="200"><path d="M512 512c-141.312 0-256-114.688-256-256S370.688 0 512 0s256 114.688 256 256S653.312 512 512 512z m0-443.733333c-103.424 0-187.733333 84.309333-187.733333 187.733333S408.576 443.733333 512 443.733333s187.733333-84.309333 187.733333-187.733333S615.424 68.266667 512 68.266667z"  p-id="9048"></path><path d="M68.266667 1024c-18.773333 0-34.133333-15.36-34.133334-34.133333 0-295.936 218.794667-546.133333 477.866667-546.133334 139.605333 0 272.042667 67.584 362.837333 185.002667 11.605333 15.018667 8.874667 36.181333-6.144 47.786667a33.860267 33.860267 0 0 1-47.786666-6.144C743.082667 569.685333 630.442667 512 512 512 290.133333 512 102.4 730.794667 102.4 989.866667c0 18.773333-15.36 34.133333-34.133333 34.133333zM955.733333 853.333333h-204.8c-18.773333 0-34.133333-15.36-34.133333-34.133333s15.36-34.133333 34.133333-34.133333h204.8c18.773333 0 34.133333 15.36 34.133334 34.133333s-15.36 34.133333-34.133334 34.133333zM955.733333 1024h-204.8c-18.773333 0-34.133333-15.36-34.133333-34.133333s15.36-34.133333 34.133333-34.133334h204.8c18.773333 0 34.133333 15.36 34.133334 34.133334s-15.36 34.133333-34.133334 34.133333z"  p-id="9049"></path></svg>
          编辑资料
        </div>
      </div>

    </SideBar>
    <div class="mid">
      <div class="mid-box">
        <div class="title">
          账号信息设置
        </div>

        <div class="avatar-setting">
          <div class="avatar">
            <img src="@/assets/img/profile.jpg" alt="">
            <div class="mask">
              <svg t="1725858475445" class="icon" viewBox="0 0 1251 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="8035" width="200" height="200"><path d="M1164.47896 1024H87.044108A87.036712 87.036712 0 0 1 0.007396 935.825553V312.915752a85.33011 85.33011 0 0 1 87.036712-85.33011H341.327835a20.194793 20.194793 0 0 0 19.341491-15.074986L398.214574 64.605133A85.33011 85.33011 0 0 1 483.544684 0.038683h286.709169a87.036712 87.036712 0 0 1 85.33011 64.56645l40.958452 146.198921a20.76366 20.76366 0 0 0 19.625926 15.074986h249.448354A87.036712 87.036712 0 0 1 1251.515672 312.915752v625.754138a87.036712 87.036712 0 0 1-87.036712 85.33011zM87.044108 292.436526a20.194793 20.194793 0 0 0-20.194793 19.910359V935.825553a19.910359 19.910359 0 0 0 20.194793 19.910359l1077.434852 1.706602a20.194793 20.194793 0 0 0 20.194793-20.194792V312.915752a20.194793 20.194793 0 0 0-20.194793-20.194793l-249.448354-1.422168a86.752278 86.752278 0 0 1-85.33011-64.56645l-40.105152-145.061186a20.194793 20.194793 0 0 0-19.341491-15.074986H483.544684a20.194793 20.194793 0 0 0-19.341491 15.074986L426.657944 227.585642a87.036712 87.036712 0 0 1-85.330109 64.56645z m545.828268 602.146141a262.816738 262.816738 0 1 1 263.101172-262.532304 263.101172 263.101172 0 0 1-263.101172 262.532304z m0-455.093919A191.708313 191.708313 0 1 0 824.865123 632.050363a191.992747 191.992747 0 0 0-191.992747-191.708314zM995.525343 483.575972a56.88674 56.88674 0 1 1 56.886739-56.88674 56.88674 56.88674 0 0 1-56.886739 56.88674z m-71.677293-56.88674z" p-id="8036"></path></svg>
            </div>
          </div>
        </div>

        <div class="info-setting">
         
          <div class="form-item">
            <label>名称</label>
            <input class="textInput">
          </div>
          <div class="form-item">
            <label>密码</label>
            <input class="textInput">
          </div>
          <div class="form-item">
            <label>性别</label>
            <div class="radioInput">
              <input type="radio" name="group1" value="option1" > 男
            </div>
            <div class="radioInput">
              <input type="radio" name="group1" value="option1" > 女
            </div>
          </div>
          <div class="btn-box">
            <button class="save-btn">保存</button><button>取消</button>
          </div>
          
        </div>

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
  display: flex;
  align-items: center;
}
.side-item svg{
  width: 18px;
  height: 18px;
  margin-right: 5px;
}
.selected{
  fill: #e95600;
  color: #e95600;
}

.side-item:hover{
  background-color: #d9d9d9;
}
.mid-box{
  width: 700px;
  min-height: 100vh;
  background-color: #fff;
  border-radius: 5px;
}
.title{
  padding: 20px 15px;
  font-size: 16px;
  color: #313131;
}
.avatar-setting{
  display: flex;
  align-items: center;
  justify-content: center;
  margin-top: 10px;
}
.avatar{
  width: 100px;
  height: 100px;
  border-radius: 50%;
  position: relative;
  cursor: pointer;
}
.avatar img{
  width: 100%;
  height: 100%;
  border-radius: 50%;
}
.mask{
  width: 100%;
  height: 100%;
  border-radius: 50%;
  background-color: #53535300;
  position: absolute;
  top: 0;
  left: 0;
  display: flex;
  align-items: center;
  justify-content: center;
}
.mask:hover{
  background-color: #53535376;
}
.mask svg{
  width: 50px;
  height: 50px;
  fill: #ffffff;
  display: none;
}
.mask:hover svg{
  display: block;
  fill: #ffffff;
}

.form-item{
  display: flex;
  padding: 10px;
  margin: 40px 10px;
  align-items: center;
}
.form-item label{
  display: inline-block;
  width: 80px;
  text-align: end;
  font-size: 15px;
  margin-right: 20px;
  box-sizing: border-box;
}
.form-item .textInput{
  flex-grow: 1;
  height: 30px;
  border-radius: 10px;
  border: none;
  outline: none;
  background-color: #dfdfdf;
  padding: 10px;
  box-sizing: border-box;
}
.form-item .textInput:focus{
  outline: 1px solid #e95600;
  background-color: #ffffff;
}
.radioInput{
  margin-right: 20px;
}
.btn-box{
  display: flex;
  padding-left: 60px;
  justify-content: end;
}
button{
  width: 60px;
  height: 30px;
  border: none;
  border-radius: 15px;
  background-color: #c2c2c2;
  cursor: pointer;
  margin-right: 40px;
}
button:hover{
  background-color: #b9b9b9;
}
.save-btn{
  color: #ffffff;
  background-color: #e95600;
}
.save-btn:hover{
  background-color: #ff5e00;
}
</style>

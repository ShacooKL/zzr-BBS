<script setup>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
const isSttingBoxShow = ref(false)
const router= useRouter()
const backHome = (()=>{
	router.push('/')
})
const toSetting = (()=>{
	router.push('/setting')
})

</script>
<template>
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

		<div class="mid-icons">
			<!-- Home -->
			<div class="icon" @click="backHome">
				<svg t="1725871427314"  viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="12679" width="200" height="200"><path d="M840.192497 1024h-178.309309a64.604822 64.604822 0 0 1-64.604823-64.604822V646.06179H419.615104v311.395243a64.604822 64.604822 0 0 1-64.604822 64.604822H181.22331a64.604822 64.604822 0 0 1-64.604822-64.604822V525.250772H76.563498a58.14434 58.14434 0 0 1-58.790388-38.762893A64.604822 64.604822 0 0 1 31.340122 416.068622L470.652914 18.102917a64.604822 64.604822 0 0 1 89.800703 0l432.852309 396.673609a64.604822 64.604822 0 0 1-45.869424 109.828198h-44.577327v436.728598a64.604822 64.604822 0 0 1-62.666678 62.666678zM422.199297 585.979305h179.601406a64.604822 64.604822 0 0 1 64.604822 64.604822v313.333388h175.725117V465.168287h109.182149L515.876289 64.618389 76.563498 462.584094h107.890053v501.333421h178.955358v-310.749195a64.604822 64.604822 0 0 1 58.790388-67.189015z" fill="#231815" p-id="12680"></path></svg>
			</div>
		</div>

		<div class="right-btns ">
			<!-- 设置按钮 -->
			<div class=" btn" @mouseover="isSttingBoxShow=true" @mouseleave="isSttingBoxShow=flase">
				<svg t="1725855104225"  viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4794" width="200" height="200"><path d="M560.60928 61.44a61.44 61.44 0 0 1 59.97568 48.10752l14.39744 64.768a365.54752 365.54752 0 0 1 71.00416 34.28352l58.53184-29.14304a61.44 61.44 0 0 1 75.13088 16.3328l61.17376 75.55072a61.44 61.44 0 0 1 0.3584 76.89216l-41.91232 52.75648a364.93312 364.93312 0 0 1 17.32608 76.288l60.25216 28.7744a61.44 61.44 0 0 1 33.3824 69.2736l-21.8624 94.72a61.44 61.44 0 0 1-60.37504 47.616l-66.06848-0.54272a368.75264 368.75264 0 0 1-49.152 61.56288l15.31904 63.96928a61.44 61.44 0 0 1-32.8192 69.5296l-87.36768 42.61888a61.44 61.44 0 0 1-74.99776-16.95744l-41.80992-52.50048a371.27168 371.27168 0 0 1-78.19264 0L431.104 937.84064a61.44 61.44 0 0 1-74.99776 16.95744l-87.36768-42.61888a61.44 61.44 0 0 1-32.8192-69.5296l15.31904-63.96928a368.75264 368.75264 0 0 1-49.152-61.56288l-66.06848 0.54272a61.44 61.44 0 0 1-60.37504-47.616l-21.8624-94.72a61.44 61.44 0 0 1 33.3824-69.26336l60.25216-28.7744c3.072-26.38848 8.96-51.9168 17.32608-76.29824l-41.91232-52.75648a61.44 61.44 0 0 1 0.3584-76.9024l61.17376-75.54048a61.44 61.44 0 0 1 75.13088-16.3328l58.5216 29.14304a365.54752 365.54752 0 0 1 71.0144-34.28352l14.39744-64.768A61.44 61.44 0 0 1 463.39072 61.44h97.21856zM512 307.2c-118.76352 0-215.04 96.27648-215.04 215.04s96.27648 215.04 215.04 215.04 215.04-96.27648 215.04-215.04-96.27648-215.04-215.04-215.04z m0 51.2c90.49088 0 163.84 73.34912 163.84 163.84s-73.34912 163.84-163.84 163.84-163.84-73.34912-163.84-163.84 73.34912-163.84 163.84-163.84z" fill="#2c2c2c" p-id="4795"></path></svg>
			</div>
			<div class="btn post-btn">
				<svg viewBox="0 0 1024 1024"><path d="M989.953 192.762L467.111 771.048s-31.231 43.13-61.511 16.063c-28.898-25.834-34.577-52.784-8.145-81.354l530.986-577.249c15.862-14.515 49.99-44.157 76.889-16.063 24.474 25.563 11.058 51.744-15.377 80.317zM818.342 79.95l-674.534 0.318c-46.003 8.032-55.495 34.78-55.495 102.238l-1.52 663.052c0 68.14 10.612 94.776 58.214 102.508l663.865-0.277c46.362-8.039 56.821-34.792 56.821-102.23l1.238-278.724c0-29.163 17.134-52.804 38.27-52.804 21.135 0 38.269 23.641 38.269 52.804l0.313 378.062c-10.872 45.235-48.564 78.788-93.815 78.788H798.29l-644.092 0.315-51.678-0.315c-50.796 0-92.021-42.235-96.414-95.909l-0.302-824.245c2.93-55.222 44.892-99.15 96.717-99.15h51.678L818.342 0c26.835 0 48.59 17.897 48.59 39.975 0 22.077-21.755 39.975-48.59 39.975z"  p-id="3498"></path></svg>
			</div>
			<Transition>
				<div class="settings-box" v-show="isSttingBoxShow" @mouseover="isSttingBoxShow=true" @mouseleave="isSttingBoxShow=flase">
					<div class="setting-item" @click="toSetting">
						账号设置
					</div>
					<div class="setting-item">
						退出
					</div>
				</div>
			</Transition>
			
		</div>
		
	</div>
</template>


<style scoped>
.search{
  height: 40px;
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
.header{
  z-index: 999;
	height: 70px;
	background-color: #ffffff;
  margin-bottom: 20px;
  display: flex;
  align-items: center;
  border-top: 2px solid rgb(205, 131, 11);
  position: sticky;
  top: 0px;
}
.header img{
  width: 50px;
  height: 50px;
  border-radius: 50%;
  margin: 5px 0 0 100px;

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
.btn{
	border-radius: 50%;
	width: 30px;
	cursor: pointer;
	height: 30px;
	display: flex;
	background-color: #dddddd;
	align-items: center;
	justify-content: center;
	margin-right: 20px;
}
.btn:hover{
	background-color: #cccccc;
}
.btn svg{
	height: 17px;
	width: 17px;
}
.right-btns{
	display: flex;
	position: absolute;
	right: 350px;
	
}
.post-btn{
	background-color: #ff5e00;
}
.post-btn svg{
	fill: #ffffff;
}
.post-btn:hover{
	background-color: #e15200;
}
.settings-box{
	width: 150px;
	height: 300px;
	border-radius: 5px;
	position: absolute;
	display: flex;
	flex-direction: column;
	top: 35px;
	left: -120px;
	box-shadow:0px 0px 5px #cbcbcb;
	background-color: #ffffff;
	transition: 0.2s;
}
.setting-item{
	font-size: 15px;
	padding: 10px 0 10px 20px;
	cursor: pointer;
}
.setting-item:hover{
	background-color: #cccccc;
}
.mid-icons{
	height: 40px;
}
.mid-icons .icon {
	width: 80px;
	height: 40px;
	margin-left: 20px;
	display: flex;
	align-items: center;
	justify-content: center;
	padding: 5px;
	border-radius: 10px;
	box-sizing: border-box;
	cursor: pointer;
}
.mid-icons .icon:hover{
	background-color: #dadada;

}
.mid-icons .icon svg {
	width: 30px;
	height: 30px;
}
</style>
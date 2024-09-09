<script setup>
import { ref, computed, watch } from 'vue';
import { MdPreview } from 'md-editor-v3';
import PostIcon from '@/components/PostIcon.vue';

const text = ref('zzr最美最漂亮最可爱\nhhh');
const isDetailShow = ref(false)
const postImgs = ref([])
const imgLeftNum = ref(9)
const curImgIndex = ref(0)
const curLeft = ref(0)
const rotationAngles = ref(0)
const detailImgRef = ref(null)
const detailImgBoxRef = ref(null)

watch(curImgIndex, (newValue,oldValue) => {
	if(detailImgBoxRef.value!=null)
		detailImgBoxRef.value.style.height = `auto`;
	rotationAngles.value = 0
	if(oldValue<curLeft.value||oldValue>curLeft.value+8)
		return
	if (curImgIndex.value > curLeft.value + 8) {
		curLeft.value = curLeft.value + 9
	} else if (curImgIndex.value < curLeft.value) {
		curLeft.value = curLeft.value - 9
	}
})

const translateXNum = computed(() => {
	return Math.floor(curLeft.value / 9) * 100
})

for (var a = 0; a < 9; a++) {
	postImgs.value.push("src/assets/img/profile.jpg")
	postImgs.value.push("src\\assets\\img\\0bb0b376fb0448e380ec23637c2c9afd.jpg")
}


const showDeatil = ((index) => {
	curImgIndex.value = index
	isDetailShow.value = true
})


const rotate = (() => {
	const rect = detailImgRef.value.getBoundingClientRect();
	if(rect.width>rect.height)
		detailImgBoxRef.value.style.height = `${rect.width}px`;
	else
		detailImgBoxRef.value.style.height = `auto`;

	setTimeout(() => {
		rotationAngles.value += 90
		rotationAngles.value = rotationAngles.value % 360
		detailImgRef.value.style.transform = `rotate(${rotationAngles.value}deg)`;
	}, 10); // 延迟执行，确保旋转完成

})

</script>
<template>
	<!-- 若博主体 -->
	<div class="postItem">
		<!--1. 头部 -->
		<div class="header">
			<div class="avatar">
				<img src="@/assets/img/profile.jpg" alt="avatar">
			</div>
			<div class="right">
				<div class="userName">
					ZZR忠实粉丝
				</div>
				<div class="time">2024/9/5</div>
			</div>

		</div>

		<!-- 2. 主体 -->
		<div class="body">

			<!-- 2.1 文字部分 -->
			<div class="passage">
				<MdPreview v-model="text" class="mdp" />
			</div>

			<!-- 2.2 图片部分(九宫格) -->
			<div class="images" v-if="!isDetailShow">
				<img v-for="(img, index) in postImgs.slice(0, 8)" :key="index" :src=img @click="showDeatil(index)">
				<div v-if="postImgs.length >= 9" class="lastImg" @click="showDeatil(8)">
					<img :src=postImgs[8]>
					<div class="mask">
						{{ '+' + imgLeftNum }}
					</div>
				</div>
			</div>

			<!-- 2.2 图片部分(详细大图) -->
			<div class="image" v-if="isDetailShow">
				<div class="function">
					<div class="btn" @click="isDetailShow = false">
						<svg t="1725808612536" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="3431" ><path d="M270.4 476.48a32 32 0 1 1-28.8-56.96l256-128a32 32 0 0 1 28.8 0l256 128a32 32 0 0 1-28.8 56.96L512 355.84z m0 288a32 32 0 0 1-28.8-56.96l256-128a32 32 0 0 1 28.8 0l256 128a32 32 0 0 1-28.8 56.96L512 643.84z" p-id="3432"></path></svg>
						收起
					</div>

					<div class="btn" @click="rotate">
						<svg t="1725809187860" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4876" width="200" height="200"><path d="M951.629227 461.298248c-11.243065-11.478426-31.018457-11.573593-42.421158-0.393973l-19.681248 19.352767C879.102401 259.036661 699.342294 86.802972 477.064838 86.802972c-227.913826 0-413.357376 185.43127-413.357376 413.357376 0 227.943502 185.445596 413.373749 413.357376 413.373749 121.468492 0 236.415454-53.759391 314.960345-146.978493 3.494591-2.674922 6.330172-5.887081 8.469905-9.510608 0.283456-0.343831 0.599657-0.693802 0.913812-1.038656l2.016937-3.181459-0.661056-0.343831c1.353834-3.560082 1.984191-7.02602 1.984191-10.518564 0-17.229406-13.983479-31.240515-31.209816-31.240515-10.361999 0-20.060895 5.509481-25.698289 14.424524-67.300802 80.872912-165.997662 127.260405-270.775007 127.260405-194.21533 0-352.277252-158.031223-352.277252-352.24553 0-194.19998 158.060899-352.261902 352.277252-352.261902 192.954617 0 350.169241 155.936515 352.21483 348.388688l-35.052331-35.144428c-11.307533-11.385305-31.113625-11.417027-42.420135-0.096191-11.778254 11.701506-11.778254 30.753421-0.063445 42.48358l74.008574 74.194816c5.637394 5.701862 13.227256 8.818853 21.22644 8.818853l0.314155-0.029676 0.787946 0.218988c1.699712 0.441045 3.559059 0.944512 5.636371 0.944512 7.874341 0 15.337313-3.052522 21.00643-8.594749l76.558653-75.331709c5.732561-5.622044 8.943696-13.211906 9.008164-21.227464C960.351889 474.525504 957.266621 466.999087 951.629227 461.298248"  p-id="4877"></path><path d="M675.059238 606.886067l-0.030699-0.124843 0.063445-234.57248c0-28.42233-23.147186-51.537793-51.554166-51.537793L311.508221 320.650951c-28.405957 0-51.522444 23.115464-51.522444 51.537793l0 268.680299c0 28.405957 23.116487 51.55212 51.522444 51.55212l312.030619 0c28.405957 0 51.554166-23.14514 51.554166-51.55212l-0.030699-32.500205 0-1.482771L675.059238 606.886067zM629.458667 374.252753l0 234.209206 0 15.150048 0 15.210423c0 4.408403-3.590781 7.997138-7.999185 7.997138L313.585533 646.819568c-4.408403 0-7.999185-3.589758-7.999185-7.997138L305.586348 374.252753c0-4.425799 3.590781-7.999185 7.999185-7.999185l307.872926 0C625.867886 366.253568 629.458667 369.826953 629.458667 374.252753" p-id="4878"></path><path d="M586.060251 439.742303c-6.455015 0-12.501732 2.487657-17.006326 6.974855l-83.424015 92.77908L430.235276 500.19207c-4.345981-4.077875-10.077519-6.26775-16.156982-6.26775-7.904017 0-13.951757 2.551102-18.581194 7.212262l-64.623833 86.414115c-8.345062 8.251941-8.345062 23.36822 0.913812 32.659841 4.535293 4.53427 10.519588 7.020904 16.848737 7.020904 6.487761 0 12.43931-2.548032 17.195637-7.336082l52.465932-70.101591L472.686111 588.339666c4.408403 4.122901 10.235109 6.329149 16.818037 6.329149 6.457062 0 12.472056-2.521426 17.005302-7.083326l96.746438-107.59553c4.15667-4.094248 6.643304-10.093892 6.643304-16.502859 0-6.392594-2.488681-12.392238-7.054673-16.895809C598.53333 442.261683 592.391447 439.742303 586.060251 439.742303"  p-id="4879"></path><path d="M402.521075 487.689315c25.446555 0 46.168506-20.707624 46.168506-46.184879 0-25.446555-20.721951-46.153156-46.168506-46.153156-25.445532 0-46.167482 20.705578-46.167482 46.153156C356.353592 466.98169 377.075543 487.689315 402.521075 487.689315"  p-id="4880"></path></svg>
						旋转
					</div>

					<div class="btn">
						<svg t="1725809318585" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="7531" width="200" height="200"><path d="M783.058824 135.529412H225.882353c-48.188235 3.011765-90.352941 45.176471-90.352941 105.411764v557.176471c3.011765 48.188235 45.176471 90.352941 105.411764 90.352941h286.117648c15.058824-1.505882 25.6-13.552941 30.117647-30.117647-4.517647-15.058824-16.564706-27.105882-30.117647-30.117647H225.882353c-16.564706 0-33.129412-16.564706-30.117647-45.17647V623.435294c78.305882-46.682353 120.470588-70.776471 126.494118-75.294118 10.541176-7.529412 25.6-10.541176 39.152941-6.023529l105.411764 51.2c30.117647 12.047059 67.764706 0 90.352942-21.082353l271.058823-206.305882V542.117647c4.517647 18.070588 16.564706 30.117647 30.117647 30.117647 16.564706 0 30.117647-13.552941 30.117647-30.117647V225.882353c-3.011765-48.188235-45.176471-90.352941-105.411764-90.352941zM527.058824 527.058824c-15.058824 10.541176-33.129412 10.541176-48.188236 4.517647L391.529412 493.929412c-37.647059-21.082353-67.764706-7.529412-90.352941 3.011764l-105.411765 63.247059V225.882353c0-16.564706 16.564706-33.129412 45.17647-30.117647h557.176471c16.564706 0 33.129412 16.564706 30.117647 45.17647v57.22353L527.058824 527.058824z"  p-id="7532"></path><path d="M353.882353 256c-54.211765 0-97.882353 43.670588-97.882353 97.882353s43.670588 97.882353 97.882353 97.882353 97.882353-43.670588 97.882353-97.882353-43.670588-97.882353-97.882353-97.882353z m0 135.529412c-21.082353 0-37.647059-16.564706-37.647059-37.647059s16.564706-37.647059 37.647059-37.647059 37.647059 16.564706 37.647059 37.647059-16.564706 37.647059-37.647059 37.647059zM823.717647 781.552941c12.047059-21.082353 19.576471-46.682353 19.576471-73.788235 0-82.823529-67.764706-150.588235-150.588236-150.588235s-150.588235 67.764706-150.588235 150.588235 67.764706 150.588235 150.588235 150.588235c34.635294 0 66.258824-12.047059 91.858824-31.623529l39.152941 39.152941c10.541176 10.541176 28.611765 10.541176 40.658824 0l3.011764-3.011765c10.541176-10.541176 10.541176-28.611765 0-40.658823l-43.670588-40.658824z m-51.2-30.117647c-4.517647 1.505882-9.035294 3.011765-12.047059 7.529412l-3.011764 3.011765c-4.517647 4.517647-7.529412 10.541176-7.529412 18.070588-15.058824 12.047059-36.141176 19.576471-57.22353 19.57647-49.694118 0-90.352941-40.658824-90.352941-90.352941s40.658824-90.352941 90.352941-90.352941 90.352941 40.658824 90.352942 90.352941c0 13.552941-4.517647 28.611765-10.541177 42.164706z"  p-id="7533"></path></svg>
						查看大图 
					</div>
				</div>

				<!-- 2.2.1 详细大图 -->
				<div class="imgDetail" ref="detailImgBoxRef">
					<img ref="detailImgRef" :src=postImgs[curImgIndex] :style="{ transform: `rotate(${rotationAngles}deg)` }">
					<div class="prevMask" v-if="curImgIndex > 0" @click="curImgIndex--"></div>
					<div class="nextMask" v-if="curImgIndex < postImgs.length - 1" @click="curImgIndex++"></div>
				</div>

				<!-- 2.2.2 预览图 -->	
				<div class="bottom">
					<!-- 2.2.2.1 前一组 -->	
					<div class="preGroup" v-if="curLeft >= 9" @click="curLeft = curLeft - 9">
						<svg viewBox="0 0 1024 1024" width="20" height="20">
							<path
								d="M710.4 838.4 358.4 492.8c-12.8-12.8-32-12.8-44.8 0l0 0c-12.8 12.8-12.8 32 0 44.8l352 352c12.8 12.8 32 12.8 44.8 0l0 0C723.2 876.8 723.2 851.2 710.4 838.4z"
								p-id="2175"></path>
							<path
								d="M358.4 531.2l352-352c12.8-12.8 12.8-32 0-44.8l0 0c-12.8-12.8-32-12.8-44.8 0L313.6 486.4c-12.8 12.8-12.8 32 0 44.8l0 0C326.4 544 345.6 544 358.4 531.2z"
								p-id="2176"></path>
						</svg>
					</div>
					<!-- 2.2.2.1 后一组 -->	
					<div class="nextGroup" v-if="curLeft + 9 < postImgs.length" @click="curLeft = curLeft + 9">
						<svg viewBox="0 0 1024 1024" width="20" height="20">
							<path
								d="M326.4 838.4l352-352c12.8-12.8 32-12.8 44.8 0l0 0c12.8 12.8 12.8 32 0 44.8l-352 352c-12.8 12.8-32 12.8-44.8 0l0 0C313.6 876.8 313.6 851.2 326.4 838.4z"
								p-id="2338"></path>
							<path
								d="M678.4 531.2 326.4 185.6c-12.8-12.8-12.8-32 0-44.8l0 0C339.2 128 358.4 128 371.2 134.4l352 352c12.8 12.8 12.8 32 0 44.8l0 0C710.4 544 684.8 544 678.4 531.2z"
								p-id="2339"></path>
						</svg>
					</div>
					<!-- 2.2.2.1 预览图 -->	
					<div class="imgsPreviewBox">
						<div class="imgsPreview" :style="{ transform: `translateX(-${translateXNum}%)` }">
							<div class="previewImg" v-for="(img, index) in postImgs" :key="index" @click="curImgIndex = index" :style="{marginRight:(index+1)%9==0?'0px':'1.25%'}">
								<img :src="img" >
								<div :class="{ previewMask: curImgIndex != index, previewCur: curImgIndex == index }"></div>
							</div>
						</div>
					</div>

				</div>


			</div>

			<div class="state">
				<PostIcon text="转发"
					path="M832 250.352L468.215 612.354c-15.66 15.582-40.986 15.52-56.569-0.14-15.582-15.659-15.52-40.985 0.14-56.568L777.222 192H626c-22.091 0-40-17.909-40-40s17.909-40 40-40h174c61.856 0 112 50.144 112 112v174c0 22.091-17.909 40-40 40s-40-17.909-40-40V250.352z m0 339.909c0-22.092 17.909-40 40-40s40 17.908 40 40V800c0 61.856-50.144 112-112 112H224c-61.856 0-112-50.144-112-112V224c0-61.856 50.144-112 112-112h209.74c22.09 0 40 17.909 40 40s-17.91 40-40 40H224c-17.673 0-32 14.327-32 32v576c0 17.673 14.327 32 32 32h576c17.673 0 32-14.327 32-32V590.26z" />
				<PostIcon text="评论" />
				<PostIcon text="点赞"
					path=" M301.546 280.724l224.3-196.378a88 88 0 0 1 53.785-18.35c48.601 0 88 39.399 88 88V262c0 17.673 14.327 32 32 32h101.295a112 112 0 0 1 19.63 1.734c60.898 10.84 101.477 68.997 90.636 129.896l-70.14 394C831.538 873.073 785.069 912 730.786 912H370c-61.856 0-112-50.144-112-112V369.369a112 112 0 0 1 43.546-88.645zM338 800c0 17.673 14.327 32 32 32h360.786c15.51 0 28.786-11.122 31.504-26.392l70.14-394c3.098-17.4-8.496-34.015-25.896-37.113a32 32 0 0 0-5.608-0.495H699.63c-61.856 0-112-50.144-112-112V153.996a8 8 0 0 0-12.89-6.332l-224.3 196.378A32 32 0 0 0 338 369.369V800zM192 379v445c0 53.333-80 53.333-80 0V379c0-53.333 80-53.333 80 0z" />
			</div>

		</div>

		<!--3.  转发 评论  -->
		<div class="bottom">

		</div>


	</div>
</template>
<style scoped>
.postItem {
	width: 100%;
	min-height: 200px;
	background-color: #ffffff;
	margin-bottom: 10px;
	border-radius: 5px;
	box-sizing: border-box;
}

.avatar {
	height: 50px;
	width: 50px;
	border-radius: 5px;
	background-color: #fff;
	margin-right: 10px;
}

.avatar img {
	width: 100%;
	height: 100%;
	border-radius: 50%;
}

.header {
	display: flex;
	line-height: 30px;
	font-weight: bold;
	padding: 20px 20px 0 20px;
}

.header span {
	font-size: 14px;
	font-weight: 400;
	color: #8e8e8e;
}

.header .userName {
	font-size: 20px;
	font-weight: 600;
	font-family: '微软雅黑';

}

.time {
	color: #8e8e8e;
	font-size: 14px;
	height: 14px;
	line-height: 14px;
	font-weight: 400;
}

.mdp {
	overflow: hidden;
}

button {
	width: 80px;
	height: 40px;
	border: none;
	background-color: #1b6593;
}

.unexpand {
	max-height: 120px;
}


.passage {
	padding: 0 60px 0px;
}

.state {
	display: flex;
	justify-content: space-between;
	padding: 20px 60px;
}

.state-item {
	background-color: #ffffff;
	height: 30px;

	display: flex;
	font-size: 15px;
	align-items: center;
	cursor: pointer;
	width: 30%;
}
.postIcon{
	width: 30%;
}


.image {
	width: 100%;
	background-color: #dddddd;
	box-sizing: border-box;
	padding: 0 60px 5px;
}

.image img {
	width: 100%;
}

.function {
	display: flex;
}

.function .btn {
	cursor: pointer;
	margin: 10px 10px 10px 0;
	display: flex;
	font-size: 13px;
	align-items: center;
	color: #424242;
}
.function .btn:not(:last-child) {
	padding-right: 5px;
	border-right: 1.5px solid #bdbdbd;
}
.btn svg{
	width: 20px;
	height: 20px;
	fill: #424242;
}
.function .btn:hover {
	color: #cb6a20;
}
.btn:hover svg{
	fill:#cb6a20; ;
}

.images {
	display: flex;
	flex-wrap: wrap;
	padding: 0 60px;
}

.images img {
	width: 25%;
	margin: 0px 5px 5px 0px;
	border-radius: 15px;
	cursor: zoom-in;
	object-fit: cover;
}

.lastImg {
	width: 25%;
	border-radius: 15px;
	box-sizing: border-box;
	margin: 0px 5px 5px 0px;
	position: relative;
	display: flex;
}

.lastImg img {
	width: 100%;
	height: 100%;
	margin: 0;
	display: block;
}

.mask {
	position: absolute;
	width: 100%;
	height: 100%;
	background-color: #24242493;
	border-radius: 15px;
	cursor: zoom-in;
	font-size: 50px;
	color: white;
	align-items: center;
	display: flex;
	justify-content: center;
}

.imgDetail {
	position: relative;
	display: flex;
}
.imgDetail img{
	object-fit: contain;
}
.prevMask {
	height: 100%;
	width: 35%;
	position: absolute;
	left: 0;
	top: 0;
	cursor: url("src\\assets\\img\\pic_prev.cur"), auto;
}

.nextMask {
	height: 100%;
	width: 35%;
	position: absolute;
	right: 0;
	top: 0;
	cursor: url("src\\assets\\img\\pic_next.cur"), auto;
}

.imgsPreviewBox {
	overflow: hidden;
	position: relative;
}

.imgsPreview {
	display: flex;
	transition: transform 0.5s ease;
	/* 0.5秒内平滑过渡 */
}

.previewImg {
	width: 10%;
	margin: 5px 1.25% 5px 0;
	flex-shrink: 0;
	position: relative;
	border-radius: 10px;
	overflow: hidden;
	cursor: pointer;
}

.previewImg img {
	width: 100%;
	height: 100%;
	border-radius: 10px;
	
}

.previewCur {
	position: absolute;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	border: 3px solid rgb(229, 108, 33);
	box-sizing: border-box;
	border-radius: 10px;
}

.bottom {
	margin: 10px 0 ;
	position: relative;
}

.previewMask {
	position: absolute;
	width: 100%;
	height: 100%;
	background-color: #d6d6d66c;
	top: 0;
	left: 0;
}

.preGroup {
	height: calc(100% - 10px);
	width: 15px;
	background-color: white;
	position: absolute;
	left: -20px;
	top: 5px;
	align-items: center;
	display: flex;
}

.nextGroup {
	height: calc(100% - 10px);
	width: 15px;
	background-color: white;
	position: absolute;
	right: -20px;
	top: 5px;
	align-items: center;
	display: flex;
}
</style>
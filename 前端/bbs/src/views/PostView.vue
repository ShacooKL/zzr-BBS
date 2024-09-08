<template>
  <div class="box">
    <MdEditor v-model="text" @onUploadImg="onUploadImg" />
    <button>发布</button>
  </div>
 <p >{{ text }}</p>
</template>

<script setup>
import { ref } from 'vue';
import axios from 'axios';
import { MdEditor } from 'md-editor-v3';
import 'md-editor-v3/lib/style.css';

const text = ref('# Hello Editor');
const onUploadImg = async (files, callback) => {
  const res = await Promise.all(
    files.map((file) => {
      return new Promise((rev, rej) => {
        const form = new FormData();
        form.append('file', file);

        axios
          .post('http://localhost:8080/test', form, {
            headers: {
              'Content-Type': 'multipart/form-data'
            }
          })
          .then((res) => rev(res))
          .catch((error) => rej(error));
      });
    })
  );
    
  callback(res.map((item) => item.data.data));
};
</script>
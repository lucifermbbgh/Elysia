<template>
  <div class="main-layout">
    <div class="navbar">顶部导航栏</div>
    <div class="mainPanel">
      <div class="sidebar">左侧菜单栏</div>
      <div class="content">显示面板</div>
    </div>
  </div>
</template>

<script setup lang="ts">

</script>

<style scoped>
.main-layout {
  display: flex;
  flex-direction: column;
  height: 100vh; /* 100% 视窗高度 */
  width: 100vh; /* 100% 视窗高度 */
}

.navbar {
  width: 100%;
  height: 10%;
  background-color: #3498db; /* 顶部导航栏样式 */
  color: #fff;
  text-align: center;
  line-height: 100px;
}

.mainPanel {
  display: flex;
  flex-direction: row;
  height: 90%;
}

.sidebar {
  width: 25%;
  float: left;
  background-color: #2ecc71; /* 左侧菜单栏样式 */
  color: #fff;
  text-align: center;
}

.content {
  width: 75%; /* 剩余部分作为显示面板 */
  float: right;
}
</style>
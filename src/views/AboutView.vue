<template>
  <div class="about">
    <h1>This is an about page</h1>
    <h1>这里是模板内容：<span v-bind:id="id1">{{count}}</span>次点击</h1>
    <button v-on:click="clickButton">按钮</button>
  </div>
</template>
<script>
export default {
  data() {
    return {
      count: 0,
      id1: "h1"
    }
  },
  methods: {
    clickButton() {
      this.count++;
    }
  }
}
</script>

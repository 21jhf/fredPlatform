<template>
  <div id="app">
    <header-component/>
    <transition name="slide">
      <router-view>
        <div>this is template body</div>
      </router-view>
    </transition>
    <footer-component/>
  </div>
</template>

<script>
    import HeaderComponent from './components/header.vue'
    import FooterComponent from './components/footer.vue'
    export default {
        name: 'app',
        data () {
            return {
                dialogFormVisible: false,
            }
        },
        components:{
            'header-component':HeaderComponent,
            'footer-component':FooterComponent
        }
    }
</script>

<style lang="scss">
  body {
    margin: 0px;
    padding: 0px;
    /*background: url(assets/bg1.jpg) center !important;
    background-size: cover;*/
    background: #1F2D3D;
    font-family: Helvetica Neue, Helvetica, PingFang SC, Hiragino Sans GB, Microsoft YaHei, SimSun, sans-serif;
    font-size: 14px;
    -webkit-font-smoothing: antialiased;
  }

  #app {
    position: absolute;
    top: 0px;
    bottom: 0px;
    width: 100%;
  }

  .el-submenu [class^=fa] {
    vertical-align: baseline;
    margin-right: 10px;
  }

  .el-menu-item [class^=fa] {
    vertical-align: baseline;
    margin-right: 10px;
  }

  .toolbar {
    background: #fff;
    padding: 10px;
  .el-form-item {
    margin-bottom: 10px;
  }
  }
</style>
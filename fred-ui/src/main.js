import Vue from 'vue'
import App from './App.vue'
import VueI18n from 'vue-i18n'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-default/index.css'
import VueRouter from 'vue-router'
//导入ElementUI内置语言包
import enLocale from 'element-ui/lib/locale/lang/en'
import zhLocale from 'element-ui/lib/locale/lang/zh-CN'
//导入本地语言包
import enLocal from './locales/en'
import zhLocal from './locales/zh-CN'
import routerConfig from '../router.config'
import 'font-awesome/css/font-awesome.min.css'
import NProgress from 'nprogress'
import 'nprogress/nprogress.css'

Vue.use(ElementUI);
Vue.use(VueRouter);
Vue.use(VueI18n);

var locales = {
    "en": {
        ll:enLocal,
        el:enLocale.el
    },
    "zh-CN": {
        ll:zhLocal,
        el:zhLocale.el
    }
}
NProgress.configure({ showSpinner: false });
Vue.prototype.$language = window.localStorage.language;
if (window.localStorage.language){
    Vue.config.lang = window.localStorage.language;
}else{
    Vue.config.lang = navigator.language;
}

console.log(navigator.language);
Object.keys(locales).forEach(function (lang) {
    Vue.locale(lang, locales[lang])
});

const router = new VueRouter({
    mode: 'history',
    routes: routerConfig
});

new Vue({
    el: '#app',
    router,
    render: h => h(App)
});

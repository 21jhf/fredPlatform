/**
 * Created by fred on 17/1/22.
 */
import Home from './src/components/home.vue'
import Echarts from './src/components/echarts.vue'
import Login from './src/components/login.vue'
import NotFound from './src/components/404.vue'

export default [

    {path:'/',component:Home,hidden:true},
    {path: '/home',name:"home", component: Home,hidden:true},
    {
        path: '/login',
        component: Login,
        name: '',
        hidden: true
    },
    {
        path: '/404',
        component: NotFound,
        name: '',
        hidden: true
    },
    {
        path: '/',
        component: Home,
        name: '用户管理',
        iconCls: 'fa fa-user-circle-o',//图标样式class
        children: [
            { path: '/main', component: Home, name: '用户维护' },
            { path: '/table', component: Home, name: '用户组' },
            { path: '/form', component: Home, name: '权限管理' },

        ]
    },{
        path: '/',
        component: Home,
        name: '数据管理',
        iconCls: 'el-icon-message',
        children: [
            { path: '/page4', component: Home, name: '字典表维护' },
            { path: '/user', component: Home, name: '角色管理' },
        ]
    },
    {
        path: '/',
        component: Home,
        name: '分析图表',
        iconCls: 'fa fa-bar-chart',
        children: [
            { path: '/echarts', component: Echarts, name: '统计图表' }
        ]
    },
    {
        path: '*',
        hidden: true,
        redirect: { path: '/404' }
    }
]


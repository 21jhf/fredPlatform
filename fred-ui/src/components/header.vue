<template>
    <div>
       <span>this is header</span>
    </div>
</template>
<style>
    .header_div{
        position:absolute;
        margin-left: 0px;
        top:0;width:100%;
        height:56px;
    }
</style>

<script>
    import Vue from 'vue';
    export default{
        data(){
            return{
                visiblePopover:false,
                language:Vue.config.lang
            }
        },
        components:{

        },
        methods:{


        },
        mounted:function () {


        }
    }
</script>

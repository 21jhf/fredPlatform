<template>
    <div>
        <span>this is footer</span>
    </div>
</template>
<style>

    .footerTextStyle{
        margin-top: 20px;
        margin-bottom: 30px;
    }
    /* 屏幕宽度不大于500px(小于等于500px)宽度为360px*/
    @media screen and (max-width: 500px) {
        .footerTextStyle {width: 360px;}
    }
</style>
<script>
    import Vue from 'vue'
    export default{
        data(){
            return{
                dialogFormVisible:false,
                language: this.$language,
            }
        },
        components:{

        },
        methods:{
            changeLanguage(type){
                this.$language=type;
                window.localStorage.language = this.$language;
                //this.$root.$broadcast('language',this.$language);
                //this.$root.$dispatch('language',this.$language);
                Vue.config.lang = type;

            },
        },
        created() {
            // Acceptance speech signal change
            this.$on('language', type => {
                this.language = type
            })
        }
    }
</script>

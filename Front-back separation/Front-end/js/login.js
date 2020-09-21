


let vue =new Vue({
    el:"#app",
    data:{
        phone:"",

    },
    methods:{
        sendCode(){
            /*axios.get("http://localhost:8080/admin/sendCode?phone="+this.phone)*/
            axios.get(`http://localhost:8080/admin/sendCode?phone=${this.phone}`).then(response=>{

            })
        }
    }

})
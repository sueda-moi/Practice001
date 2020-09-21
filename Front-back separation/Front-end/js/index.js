/*Vue.filter("dataformat",function (time,sep) {
    var date=new Date(time)
    let y=date.getFullYear()
    let m=date.getMonth()
    let d=date.getDate()
    //处理完之后 必须return一个字符串
    return y+sep+m+sep+d
})*/

var vue=new Vue({
    el:"#app",
    created(){//进入页面需要查询所有  此时需要钩子函数 和生命周期有关
        axios.defaults.baseURL='http://localhost:8080';
        this.findAll();
    },
    data:{
        employeeList:[],//定义列表的数据模型
        employeeId:-1,//定义一个变量 随意给个默认值
        employee:{
            employeeImg:"",
        }
    },
    methods:{
        //查询所有
        findAll(){//定义查询所有方法 使用axios异步请求
            //异步请求controller
            axios.get("employee").then(response=> {
                let {status, data} =response.data;
                if(status==20000){
                    this.employeeList=data;
                }
            });
        },
        //通过id删除
        deleteById(){
            axios.delete(`employee/${this.employeeId}`).then(response=>{
                let {status} =response.data;
                if (status==20000){
                    this.findAll();
                }
            });
        },
        //文件上传
        uploadFile(e){
            let formData=new FormData();
            formData.append("head",e.target.files[0]);
            axios.post("upload",formData,
                {headers:{"Content-Type":"multipart/form-data"}}).then(
                    response=>{
                        let {status,data}=response.data;
                        if (status ==20000){
                            this.employee.employeeImg=data;
                        }
            });
        },

        //异步添加员工
        addOrEdit(){
            let type =this.employee.employeeId ? "put":"post";
            axios({
                method: type,
                url: 'employee',
                data: this.employee
            }).then(response => {
                let {status} =response.data;
                if (status == 20000){
                    this.findAll();
                    this.employee = {employeeImg: "",}
                }
            });
            /*if (this.employee.employeeId){
                //修改员工
                axios.put("employee",this.employee).then(response=>{
                    let {status}=response.data;
                    if (status==20000){
                        this.findAll();
                        this.employee={employeeImg:"",}
                    }
                });

            }else {
                //添加员工
                axios.post("employee",this.employee).then(response =>{
                  let {status} =response.data;
                  if(status==20000){
                      this.findAll();
                      this.employee={employeeImg:""}
                  }
                });
            }*/
        },
        //编写事件处理函数 做异步操作
        findById(id){
            axios.get(`employee/${id}`).then(response=>{
                let {status, data}=response.data;
                if (status==20000){
                    this.employee=data;
                }
            });
        },





    }
})
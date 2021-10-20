function f() {
    var passwd = document.getElementById("passwd").value;
    var repasswd = document.getElementById("repasswd").value;
    if (passwd != repasswd) alert("两次密码不一致");
    else document.write("欢迎");
}
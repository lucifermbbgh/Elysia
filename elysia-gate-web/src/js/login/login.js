function login(){
  alert("登录成功")
}

window.onload = function() {
  if (window.location.search.includes("error=true")) {
    document.getElementById("error-message").classList.remove("d-none");
  }
};

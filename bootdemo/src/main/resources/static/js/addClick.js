var loginBtn = document.querySelector('button');
var mask = document.querySelector(".mask");
var loginPage = document.querySelector(".login-page")
var close = document.querySelector('.close')

loginBtn.onclick = function() {
    mask.style.display = "block";
    loginPage.style.display = "block"
}



close.addEventListener('click', closePage);
mask.addEventListener('click', closePage)

function closePage() {
    mask.style.display = "none";
    loginPage.style.display = "none"
}
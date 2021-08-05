alert("Cargando");

const formLogin = document.querySelector("#formLogin");

formLogin.addEventListener("submit", (e) =>{

    e.preventDefault();
    const email = document.querySelector("#email");
    const password = document.querySelector("#password");

    const emailError = document.querySelector("#emailError");
    const passwordError = document.querySelector("#passwordError");

    if(email.value == ''){
        emailError.textContent = "Error, favor de ingresar un email";
    }

    if(password.value == ''){
        passwordError.textContent = "Error, favor de ingresar un password";
    }

    if(
        email.value != '' && password.textContent != ''){
            fetch('http://localhost:8080/login',{
            method: "POST",
            body : JSON.stringify({
                username : email.value,
                password : password.value
            })
        }).then(resp) => {
            console.log(resp.status);
        })
    }
});
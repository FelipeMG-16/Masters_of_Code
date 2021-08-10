token = localStorage.getItem('token');
const form = document.querySelector('#form');
form.addEventListener('submit', (e) => {
    e.preventDefault();
    const resumen = document.querySelector('#resumen').value;
    const opinion = document.querySelector('#opinion').value;

    // Comprobación y alerts para los campos
    if(calificacion == undefined) {
        // aqui va la configuracion de un alert o span
    }
    if(resumen == '') {
            
    }
    if(opinion == '') {
            
    }

    // Peticion fetch
    if (resumen != '' && opinion != '') {
    
        fetch('https://masters-of-code-back.herokuapp.com/resenas', {
            method: "POST",
            body: JSON.stringify({
                resumen: resumen,
                opinion: opinion,
                calificacion: calificacion
            }),
            headers: {
                'Authorization': token,
                'Content-Type': "application/json"
            }
        })
    }
});
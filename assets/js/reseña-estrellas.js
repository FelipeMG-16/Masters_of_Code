var calificacion; // aqui se guarda la calificacion del producto
function calificar(item) {
    calificacion=parseInt(item.id[0]); //Captura el primer caracter del id del item
    let nombre = item.id.substring(1) //Captura el resto del id del item
    for(let i = 0; i < 5; i++) { //Ciclo para recorrer todos los items
        // Si el item actual es menor que la calificacion se colorea de naranja
        if(i < calificacion) {
            document.getElementById((i+1)+nombre).style.color = '#FCA311';
        } 
        //Si el item actual es mayor que la calificacion se colorea de gris
        else {
            document.getElementById((i+1)+nombre).style.color = 'lightgrey'; 
        }
    }
}
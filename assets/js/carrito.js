const addArticle = document.querySelectorAll('.comprar');
addArticle.forEach(addToCardButton =>{
    addToCardButton.addEventListener('click',addToCardClicked);
})

function addToCardClicked(event){
const boton =event.target;
const item = button.closest('.clean-product-item');
console.log(item.value);
}
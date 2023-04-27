const pList = document.getElementsByTagName("p");
        
for(let p of pList){
    p.style.margin = "0";
    p.style.display = "none";
}

const openList = document.getElementsByClassName("open");
for(let open of openList){

open.addEventListener("click", e => {

    if(open.nextElementSibling.style.display == "none"){
        open.nextElementSibling.style.display = "inline-block";
        e.target.innerText="X";
    } else {
        open.nextElementSibling.style.display = "none"
        e.target.innerText="N";
    }


});
}
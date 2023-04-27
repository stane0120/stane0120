const openList = document.getElementsByClassName("open");
for(let open of openList){
    open.addEventListener("click", e => {
        const next = e.target.nextElementSibling;
        if(next.style.display == "none"){
            next.style.display = "inline-block";
        }  else { 
            next.style.display = "none";
        }
    });
}
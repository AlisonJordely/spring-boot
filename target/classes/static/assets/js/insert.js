let button = document.getElementById("btnSave");

button.addEventListener("click", evento=>{
    saveInfo();
});

let saveInfo = async()=>{

    let campos ={ };

    campos.id = document.getElementById("identifier").value;
    campos.name = document.getElementById("name").value;
    campos.sexo = document.getElementById("sex").value;
    campos.nationality = document.getElementById("nationality").value;
    campos.age = document.getElementById("age").value;

    console.log(campos.id);
    console.log(campos.name);
    console.log(campos.sexo);
    console.log(campos.nationality);
    console.log(JSON.stringify(campos));

    const request = await fetch("https://lucalice.com/users/save",
        {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
            body: JSON.stringify(campos)
        }
    );
}
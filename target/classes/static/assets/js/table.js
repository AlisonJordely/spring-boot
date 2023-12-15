window.onload = function (){
    listUsers();
}

let listUsers = async () =>{
    const requestGet = await fetch("https://lucalice.com/users/all/",
        {
            method: "GET",
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json"
            }
        });
        const info = await  requestGet.json();

        let contentTable = '';
    for (let usr of info) {
        let contentInfo = `<tr>
            <td>${usr.id}</td> 
            <td>${usr.name}</td> 
            <td>${usr.sex}</td> 
            <td>${usr.nationality}</td>
            <td>${usr.age}</td>
        </tr>`

        contentTable += contentInfo;
    }

    document.querySelector("#table tbody").outerHTML = contentTable;
}
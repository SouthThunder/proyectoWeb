function createApplication(){
const nombre = document.getElementById('nombre').value;
const apellido = document.getElementById('apellido').value;
const email = document.getElementById('email').value;
const semester = document.getElementById('semester').value;
const description = document.getElementById('description').value;
const xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8080/applications/create");
    xhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhttp.send(
      JSON.stringify({
        name: nombre,
        lastname: apellido,
        email: correo,
        semester: semester,
        description: description,
      })
    );
    xhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        const objects = JSON.parse(this.responseText);
        Swal.fire("Solicitud enviada", "Gracias por enviar tu solicitud", "success");
        
      }
    };
}
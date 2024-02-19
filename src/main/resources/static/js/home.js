document.addEventListener("DOMContentLoaded", function() {
    // Obtener todos los elementos con la clase 'member' de la primera sección
    let firstSectionMembers = document.querySelectorAll(".holder .container .member");
  
    // Recorrer todos los miembros de la primera sección
    firstSectionMembers.forEach(function(member, index) {
      // Agregar evento click a cada miembro
      member.addEventListener("click", function() {
        // Obtener el índice del miembro actual
        let memberId = index + 1;
  
        // Verificar si existe un miembro en la segunda sección con el mismo id
        let targetMember = document.getElementById("member-" + memberId);
        if (targetMember) {
          // Obtener la posición del miembro objetivo en la página
          let targetPosition = targetMember.offsetTop;
  
          // Desplazar la ventana hasta la posición del miembro objetivo
          if(index === 0){
            window.scrollTo({
                top:  window.innerHeight / 2,
                behavior: "smooth" // Desplazamiento suave
              });
          }else{
            window.scrollTo({
                top: targetPosition + window.innerHeight / 2,
                behavior: "smooth" // Desplazamiento suave
              });
          }
        }
      });
    });
  });
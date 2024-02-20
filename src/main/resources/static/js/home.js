document.addEventListener("DOMContentLoaded", function() {
  // Obtener todos los elementos con la clase 'acontainer'
  const members = document.querySelectorAll('.acontainer');

  // Agregar un evento de clic a cada elemento .acontainer
  members.forEach(member => {
      member.addEventListener('click', (event) => {
          // Prevenir el comportamiento predeterminado del enlace
          event.preventDefault();

          // Obtener el valor del atributo href
          const href = member.getAttribute('href');

          // Seleccionar el elemento de destino usando el valor de href como un selector CSS válido
          const target = document.querySelector(href);

          // Desplazar suavemente hacia el elemento de destino si existe
          if (target) {
              target.scrollIntoView({
                  behavior: 'smooth'
              });
          }
      });
  });
});
const personas = [
  { nombre: "Toni", edad: 35 },
  { nombre: "Eva", edad: 28 },
  { nombre: "Joan", edad: 45 },
  { nombre: "Maria", edad: 32 },
];

function mostrarTabla() {
  let html = `
            <table>
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Edad</th>
                    </tr>
                </thead>
                <tbody>
            `;

  for (let persona of personas) {
    html += `
            <tr>
                <td>${persona.nombre}</td>
                <td>${persona.edad}</td>
            </tr>`;
  }

    html += `
            </tbody>
            </table>`;

  document.body.innerHTML += html;
}
mostrarTabla()

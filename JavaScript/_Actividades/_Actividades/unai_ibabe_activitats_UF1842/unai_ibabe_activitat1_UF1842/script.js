const evaluacion = [
  { nombre: "Laia", nota_1: 7, nota_2: 9, grupo: "A" },
  { nombre: "Josep", nota_1: 5, nota_2: 6, grupo: "B" },
  { nombre: "Bernat", nota_1: 2, nota_2: 4, grupo: "B" },
  { nombre: "Jaime", nota_1: 10, nota_2: 10, grupo: "A" },
  { nombre: "Joan", nota_1: 10, nota_2: 10, grupo: "B" },
  { nombre: "Jorge", nota_1: 10, nota_2: 10, grupo: "A" },
  { nombre: "Marta", nota_1: 8, nota_2: 7, grupo: "A" },
  { nombre: "Carla", nota_1: 4, nota_2: 5, grupo: "B" },
  { nombre: "Marc", nota_1: 6, nota_2: 8, grupo: "A" },
  { nombre: "Pau", nota_1: 9, nota_2: 3, grupo: "B" },
  { nombre: "Sonia", nota_1: 5, nota_2: 5, grupo: "A" },
  { nombre: "Ivan", nota_1: 3, nota_2: 2, grupo: "B" },
  { nombre: "Elena", nota_1: 7, nota_2: 10, grupo: "A" },
  { nombre: "Oriol", nota_1: 6, nota_2: 4, grupo: "B" }
];


function generarTabla(grupo) {
  let tabla = `
        <div>
            <p>GRUPO ${grupo}</p>
            <table>
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Nota 1</th>
                            <th>Nota 2</th>
                            <th>Nota Final</th>
                        </tr>
                    </thead>
                    <tbody>
            `;

  for (let evaluaci of evaluacion) {
    if (evaluaci.grupo === grupo) {
      let nota_final = (evaluaci.nota_1 + evaluaci.nota_2) / 2;
      tabla += `
                  <tr>
                      <td>${evaluaci.nombre}</td>
                      <td>${evaluaci.nota_1}</td>
                      <td>${evaluaci.nota_2}</td>
                      <td>${nota_final}</td>
                  </tr>`;
    }
  }
  tabla += `
                  </tbody>
                </table>
            </div>`;

  document.body.innerHTML += tabla;
}
generarTabla("A");
generarTabla("B");

let elemento = document.querySelector("#principal");

/** arreglos */

let mascotas = [];
/** asignamos valores a las posiciones o indices */
//mascotas[0]= "Loro";
//mascotas[1] = "Perro";
//{propietario,especie,raza,edad,tamaño,imagen}
const agregarMascota=()=>{
    let datos= document.querySelectorAll("input");
   // console.log(datos[6].checked);
   let consulta = "";
   if (datos[6].checked){
       consulta = "urgencia";
   }else{
       consulta="consulta";
   }
    let mascota={
         propietario:datos[0].value,
         especie:datos[1].value,
         raza:datos[2].value,
         peso:datos[3].value,
         src:datos[4].value,
     };
    mascotas.push(mascota);
    
};

const mostrarMascotas=()=>{
    for(let a = 0; a < mascotas.length; a++){
        elemento.innerHTML+=`
        <h2> ${a} ${mascotas[a]}</h2>`;
    }
};

const CrearFormulario=()=>{
    elemento.innerHTML=`
    <form>
  <div class="mb-3">
    <label for="prop" class="form-label">
    Propietario
    </label>
    <input type="text" class="form-control" id="prop" aria-describedby="emailHelp">
    
  <div class="mb-3">
    <label for="especie" class="form-label">
    Especie
    </label>
    <input type="text" class="form-control" id="especie">
  </div>
    
  <div class="mb-3">
    <label for="raza" class="form-label">
    Raza
    </label>
    <input type="text" class="form-control" id="raza">
  </div>
  <div class="mb-3">
    <label for="peso" class="form-label">
    Peso
    </label>
    <input type="text" class="form-control" id="peso">
  </div>
  <div class="mb-3">
    <label for="img" class="form-label">Imagen
    </label>
    <input type="text" class="form-control" id="img">
  </div>
  <div class="mb-3 form-check">
    <input type="radio" name="consulta" class="form-check-input" id="urgencia">
    <label class="form-check-label" for="urgencia">Urgencia</label>
  </div>
  <div class="mb-3 form-check">
    <input type="radio" name="consulta" class="form-check-input" id="consulta">
    <label class="form-check-label" for="consulta">Consulta</label>
  </div>
  <button type="button" class="btn btn-primary" id="btn">Agregar Datos</button>
</form>`;
    document.getElementById("btn").addEventListener('click',agregarMascota)

};
CrearFormulario(); 

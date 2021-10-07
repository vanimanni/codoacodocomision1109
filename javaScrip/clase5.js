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
    mostrarMascotas();
    
};
  const cambiarDatos=(c)=>{
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
      mascotas[c]= mascota;
      mostrarMascotas();
  };

 const modificarM=(b)=>{
   let mascota =mascotas[b];
   let consulta = "";
   if(mascota.consulta=="consulta"){
   consulta= `   
  <div class="mb-3 form-check">
      <input type="radio" name="consulta" class="form-check-input" id="urgencia">
      <label class="form-check-label" for="urgencia">Urgencia</label>
  </div>
  <div class="mb-3 form-check">
      <input type="radio" name="consulta" class="form-check-input" id="consulta" checked>
      <label class="form-check-label" for="consulta">Consulta</label>
  </div>`
   }else{
     consulta=`
    
   <div class="mb-3 form-check">
     <input type="radio" name="consulta" class="form-check-input" id="urgencia" checked>
     <label class="form-check-label" for="urgencia">Urgencia</label>
   </div>
   <div class="mb-3 form-check">
     <input type="radio" name="consulta" class="form-check-input" id="consulta">
     <label class="form-check-label" for="consulta">Consulta</label>
   </div>`
   };
   elemento.innerHTML=`
   <form>
   <div class="mb-3">
     <label for="prop" class="form-label">
     Propietario
     </label>
     <input type="text" class="form-control" id="prop" value="${mascota.propietario}">
     
   <div class="mb-3">
     <label for="especie" class="form-label">
     Especie
     </label>
     <input type="text" class="form-control" id="especie "value="${mascota.especie}">
   </div>
     
   <div class="mb-3">
     <label for="raza" class="form-label">
     Raza
     </label>
     <input type="text" class="form-control" id="raza "value="${mascota.raza}">
   </div>
   <div class="mb-3">
     <label for="peso" class="form-label">
     Peso
     </label>
     <input type="text" class="form-control" id="peso" value="${mascota.peso}">
   </div>
   <div class="mb-3">
     <label for="img" class="form-label">Imagen
     </label>
     <input type="text" class="form-control" id="img" value="${mascota.src}">
   </div>
   
   ${consulta}
   <button type="button" onclick="cambiarDatos(${b})" class="btn btn-primary" id="btn">Guardar Datos</button>
 </form>
   `
 };

const mostrarMascotas=()=>{
      elemento.innerHTML="";
    for(let a = 0; a < mascotas.length; a++){
        elemento.innerHTML+=`
        <div class="card" style="width: 18rem;">
  <img src="${mascotas[a].src}" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Propietario ${mascotas[a].propietario}</h5>
    <p class="card-text">Especie ${mascotas[a].especie}</p>
    <p class="card-text">Raza ${mascotas[a].raza}</p>
    <p class="card-text">Edad ${mascotas[a].edad}</p>
    <p class="card-text">Peso ${mascotas[a].peso}</p>
    <p class="card-text">Tipo de consulta ${mascotas[a].consulta}</p>
    <a href="#" class="btn btn-primary" onclick="CrearFormulario()"> Agregar mascota</a>
    <a href="#" class="btn btn-primary" onclick="modificarM(${a})"> Modificar datos</a>  
    </div>
</div>`;
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



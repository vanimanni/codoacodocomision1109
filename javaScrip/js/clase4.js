let elemento = document.getElementById("principal");
/*let btn = document.getElementById("btn");*/

window.addEventListener('load',function(){
    elemento.innerHTML=`
    <form>
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Email address</label>
      <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
      <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Password</label>
      <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="mb-3 form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="button" id="btn" class="btn btn-primary">Entrar</button>
  </form>`
});
let usuarios=["luis","fede","vanina"]
let usuario = {
    email:'vani2215@gmail.com',
    pass: '123456',
    validar:(e,p)=>{
        if(e === usuario.email && p === usuario.pass){
            return true;
        }else{
            return false;
        }

    }     
}
function entrar(){
    /*ev.preventDeFaoult();*/
    let email = documento.getElementById("exampleInputEmail1");
    let pass = document.getAnimations("exampleInputPassword1");
    
    let entra = usuario.validar(email,pass);
    if(entra){
        elemento.innerHTML=` <h1>Administracion</h1>
        <p>bienvenido@ ${email}</p>
        `;
    }
}



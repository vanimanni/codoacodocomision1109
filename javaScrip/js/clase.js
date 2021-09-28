//let nombre = prompt("Ingresá tu nombre!")
let miDiv = document.getElementById("principal");
//miDiv.innerHTML="Hola "+nombre;

let btn = document.getElementById("btn");
btn.addEventListener('click',sumar);

function sumar(){
    let num = Number(prompt("ingresa tu primer numero"));
    let num2 = Number(prompt("ingresa tu segundo numero"));
    let op = prompt("escribi la operacion a realizar \n + par sumar \n - para restar\n * para multiplicar\n / para dividirs")
    let resultado=0;
    switch (op) {
        case "+":
             resultado = num + num2;
            miDiv.innerHTML+="<p> El resultado de la suma de "+num +" y "+num2 + " es: "+ resultado +"</p>";
            break;
        case "-":
             resultado = num - num2;
            miDiv.innerHTML+="<p> El resultado de la resta de "+num +" y "+num2 + " es: "  + resultado +"</p>";
            break;
        case "/":
             resultado = num / num2;
            miDiv.innerHTML+="<p> El resultado de la division de "+num +" y "+num2  + " es: " + resultado +"</p>";
            break;
        case "*":
            resultado = num * num2;
            miDiv.innerHTML+="<p> El resultado de la multiplicacion de "+num +" y "+num2  + " es: " + resultado +"</p>";
            break;
        default:
            alert ("No se puede ejecutar esta operación");
            break;
    }
}
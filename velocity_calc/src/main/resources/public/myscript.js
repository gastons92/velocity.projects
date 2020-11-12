    var first_num = true;
    function borrar(){
        /*
        document.calculator.a.value = 0;
        document.calculator.b.value = 0;
        document.calculator.action = "/none";
        */
        $('input[name=b]').val('0');
        $('#calc').attr('action', '/none');
        first_num = true;
    }
    
    function num(numero){
        /*
        //Usando javascript
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = numero;
            first_num = false;
        }
        else
            document.calculator.b.value+= numero.toString();
        */
        if($('input[name=b]').val() === '0' || first_num){
            $('input[name=b]').val(numero.toString());
            first_num = false;
        }
        else{
            var s = $('input[name=b]').val() + numero.toString();
            $('input[name=b]').val(s);    
        }
    }
    
    function setOperator(operador){
        /*
        //Usando javascript
        document.calculator.a.value = document.calculator.b.value;
        document.calculator.b.value = "0";
        first_num = true;
        
        if(operador === 'suma')
            document.calculator.action = "/getSuma";
        if(operador === 'resta')
            document.calculator.action = "/getResta";
        if(operador === 'producto')
            document.calculator.action = "/getProducto";
        if(operador === 'cociente')
            document.calculator.action = "/getCociente"; 
         */
        $('input[name=a]').val($('input[name=b]').val());
        $('input[name=b]').val('0');
        first_num = true;
        
        if(operador === 'suma')
            $('#calc').attr('action', '/getSuma');
        if(operador === 'resta')
            $('#calc').attr('action', '/getResta');
        if(operador === 'producto')
            $('#calc').attr('action', '/getProducto');
        if(operador === 'cociente')
            $('#calc').attr('action', '/getCociente');
    }
  
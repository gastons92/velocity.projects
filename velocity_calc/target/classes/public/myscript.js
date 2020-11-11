//var no_operator = ("none" === document.calculator.action.substr(-4));
    var first_num = true;
    function borrar(){
	document.calculator.a.value = 0;
	document.calculator.b.value = 0;
        first_num = true;
        document.calculator.action = "/none";
    }

    function num0(){
        if(first_num){
        document.calculator.b.value = 0;
        first_num = false;
        }
        if(document.calculator.b.value != 0)
            document.calculator.b.value+='0';
    }

    function num1(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 1;
            first_num = false;
        }
        else
            document.calculator.b.value+='1';
    }

    function num2(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 2;
            first_num = false;
        }
        else
            document.calculator.b.value+='2';
    }

    function num3(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 3;
            first_num = false;
        }
        else
            document.calculator.b.value+='3';
    }

    function num4(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 4;
            first_num = false;
        }
        else
            document.calculator.b.value+='4';
    }
                
    function num5(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 5;
            first_num = false;
        }
        else
            document.calculator.b.value+='5';
    }

    function num6(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 6;
            first_num = false;
        }
        else
            document.calculator.b.value+='6';
    }
		
    function num7(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 7;
            first_num = false;
        }
        else
            document.calculator.b.value+='7';
    }

    function num8(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 8;
            first_num = false;
        }
        else
            document.calculator.b.value+='8';
    }

    function num9(){
        if(document.calculator.b.value == 0 || first_num){
            document.calculator.b.value = 9;
            first_num = false;
        }
        else
            document.calculator.b.value+='9';
    }
        
    function suma() {
        document.calculator.a.value = document.calculator.b.value;
        document.calculator.b.value = "0";
        first_num = true;
        document.calculator.action = "/getSuma";
    }

    function resta() {
        document.calculator.a.value = document.calculator.b.value;
        document.calculator.b.value = "0";
        first_num = true;
        document.calculator.action = "/getResta";
    }

    function multiplicacion() {
        document.calculator.a.value = document.calculator.b.value;
        document.calculator.b.value = "0";
        first_num = true;
        document.calculator.action = "/getProducto";
    }

    function divicion() {
        document.calculator.a.value = document.calculator.b.value;
        document.calculator.b.value = "0";
        first_num = true;
        document.calculator.action = "/getCociente";
    }
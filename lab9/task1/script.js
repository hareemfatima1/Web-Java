function sum()
{
    var num1 = parseInt(document.getElementById('num1').value);
    var num2 = parseInt(document.getElementById('num2').value);
    document.getElementById('result').value = num1 + num2;
}

function sub()
{
    var num1 = parseInt(document.getElementById('num1').value);
    var num2 = parseInt(document.getElementById('num2').value);
    document.getElementById('result').value = num1 - num2;
}

function multiply()
{
    var num1 = parseInt(document.getElementById('num1').value);
    var num2 = parseInt(document.getElementById('num2').value);
    document.getElementById('result').value = num1 * num2;
}

function divide()
{
    var num1 = parseInt(document.getElementById('num1').value);
    var num2 = parseInt(document.getElementById('num2').value);
    if(num2 ==0)
    {
	    document.getElementById('result').value = 'Infinity';
    }
    else
    {
	    document.getElementById('result').value = num1 / num2;
    }
    
}

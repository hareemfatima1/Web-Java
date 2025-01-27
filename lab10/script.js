let display = document.getElementById('screen');
let currentNumber = '';
let previousNumber = '';
let operator = '';

function makeDisplay(digit) {
	currentNumber += digit;
	document.getElementById('screen').innerText = currentNumber;
}

function Operator(op) {
	operator = op;
	previousNumber = currentNumber;
	currentNumber = '';
	document.getElementById('screen').innerText = previousNumber + operator;
}

function clear() {
	document.getElementById('screen').value = '';
	currentNumber = '';
	previousNumber = '';
	operator = '';
}

function calculate() {
	let result = eval(previousNumber + operator + currentNumber);
	display.value = result;
	currentNumber = result;
	previousNumber = '';
	operator = '';
}

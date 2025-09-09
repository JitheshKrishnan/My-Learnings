const calculateBtn = document.getElementById("calculateBtn");
const numberInput = document.getElementById("number");
const percentInput = document.getElementById("percent");
const percentageResult = document.getElementById("percentageResult");
const finalResult = document.getElementById("finalResult");

function calculate(){
    const numberValue = parseFloat(numberInput.value);
    const percentageValue = parseFloat(percentInput.value);

    //! Validations
    if(isNaN(numberValue) || isNaN(percentageValue) || numberValue < 0 || percentageValue < 0){
        alert("Please enter valid numbers");
        return;
    }
    //! Calculations
    const result = (numberValue*percentageValue)/100;
    const final = result+numberValue;
    percentageResult.textContent = formatNumber(result);
    finalResult.textContent = formatNumber(final);
}

function formatNumber(amount){
    return (
        "$" + amount.toLocaleString(
            "en-Us", {
                minimumFractionDigits:2,
                maximumFractionDigits:2,
            }
        )
    );
}

calculateBtn.addEventListener("click", calculate);

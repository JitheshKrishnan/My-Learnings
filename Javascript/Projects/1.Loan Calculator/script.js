document.addEventListener("DOMContentLoaded", () => {
    // ! Select all elements
    const calculateBtn = document.getElementById("calculateBtn");
    const amountInput = document.getElementById("amount");
    const interestInput = document.getElementById("interest");
    const yearsInput = document.getElementById("years");

    const monthlyPayment = document.getElementById("monthly");
    const totalPayment = document.getElementById("total");
    const totalInterestPayment = document.getElementById("totalInterest");

    // ! Function to calculate loan
    function calculateLoan(){
        const principal = parseFloat(amountInput.value);
        const interest = parseFloat(interestInput.value)/100/12;
        const payments = parseFloat(yearsInput.value);
        if(isNaN(principal) || isNaN(interest) || isNaN(payments)){
            alert("Please enter valid numbers");
            return;
        }
        // ! Calculate monthly payment
        const x = Math.pow(1+interest, payments);
        const monthly = (principal*x*interest)/(x-1);
        if(isFinite(monthly)){
            // ! Calculate total payment and interest
            const total = monthly*payments;
            const totalInterest = total - principal;
            // ! Display the results
            // monthlyPayment.textContent = monthly;
            // totalPayment.textContent = total;
            // totalInterestPayment.textContent = totalInterest;
            animationValue(monthlyPayment, 0, monthly, 1000);
            animationValue(totalPayment, 0, total, 1000);
            animationValue(totalInterestPayment, 0, totalInterest, 1000);
        }
    }

    // ! Animation
    function animationValue(element, start, end, duration){
        const startTime = performance.now();

        function update(currentTime){
            const elapsed = currentTime - startTime;
            const progress = Math.min(elapsed/duration, 1);
            const current = start + (end-start)*progress;
            element.innerHTML = "$" + current.toFixed(2);
            if(progress < 1){
                requestAnimationFrame(update);
            }
        }
        requestAnimationFrame(update);
    }

    // ! Bind event to calculateBtn
    calculateBtn.addEventListener("click", calculateLoan);
});
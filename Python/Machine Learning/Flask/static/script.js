function predictImage() {
    var formData = new FormData(document.getElementById("uploadForm"));

    fetch("/predict", {
        method: "POST",
        body: formData
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById("result").innerText = "Prediction: " + data.prediction;
    })
    .catch(error => {
        console.error("Error:", error);
        document.getElementById("result").innerText = "Error occurred during prediction.";
    });
}

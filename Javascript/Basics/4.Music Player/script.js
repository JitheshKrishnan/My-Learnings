document.getElementById("sound1").addEventListener("click", () => {
    const audio = new Audio("Audios/cinematic.mp3");
    audio.play();
});

document.getElementById("sound2").addEventListener("click", () => {
    const audio = new Audio("Audios/magicSpell.mp3");
    audio.play();
});

document.getElementById("sound3").addEventListener("click", () => {
    const audio = new Audio("Audios/wildfire.mp3");
    audio.play();
});
function collectData(){
  const langProfElements = document.getElementsByName("languageProficiency");

  // console.log(langProfElements);
  for(let i = 0; i < langProfElements.length; i++){
    if(langProfElements[i].checked){
      console.log(`Selected Language is: ${langProfElements[i].value}`);    
    }
  }
  const emailElement = document.getElementsByName("email");
  console.log(emailElement);  
}

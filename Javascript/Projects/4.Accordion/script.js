document.querySelectorAll(".accordion-header").forEach((button) => {
    button.addEventListener("click", () => {
        const accordionItem = button.parentElement;
        const accordionContent = button.nextElementSibling;

        //! Get current height of content for smooth scrolling
        const contentHeight = accordionContent.querySelector(".accordion-body").offsetHeight;
        if(accordionItem.classList.contains("active")){
            //! close it
            accordionContent.style.maxHeight = "0px";
            accordionItem.classList.remove("active");
            accordionContent.classList.remove("active");
        } else{
            //! Close any open items first
            document.querySelectorAll(".accordion-item.active").forEach((activeItem) => {
                activeItem.classList.remove("active");
                activeItem.querySelector(".accordion-content").style.maxHeight = "0px";
                activeItem.querySelector(".accordion-content").classList.remove("active");
            });
            //! Open clicked item
            accordionContent.style.maxHeight = contentHeight + "px";
            accordionItem.classList.add("active");
            accordionContent.classList.add("active");
        }
    });
});
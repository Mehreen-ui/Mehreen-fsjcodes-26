
/* =========================================================
   MEHREEN — PORTFOLIO JAVASCRIPT
   ========================================================= */


/* ================= MOBILE MENU ================= */

function toggleMenu() {

    const menu = document.querySelector(".nav-links");

    menu.classList.toggle("active");

}


/* Close menu when a link is clicked */

document.querySelectorAll(".nav-links a").forEach(link => {

    link.addEventListener("click", () => {

        document.querySelector(".nav-links").classList.remove("active");

    });

});


/* ================= CURSOR GLOW ================= */

const cursorGlow = document.querySelector(".cursor-glow");

document.addEventListener("mousemove", (event) => {

    cursorGlow.style.left = event.clientX + "px";
    cursorGlow.style.top = event.clientY + "px";

});


/* ================= PROJECT BUTTONS ================= */

function showProject(projectName) {

    alert(
        "Project: " +
        projectName +
        "\n\nDetailed project information can be added here."
    );

}


/* ================= CONTACT FORM ================= */

const contactForm = document.getElementById("contactForm");

contactForm.addEventListener("submit", function(event) {

    event.preventDefault();

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const subject = document.getElementById("subject").value.trim();
    const message = document.getElementById("message").value.trim();

    const formMessage = document.getElementById("formMessage");


    /* Required fields */

    if (!name || !email || !subject || !message) {

        formMessage.textContent =
            "Please complete all fields before submitting.";

        return;

    }


    /* Email validation */

    const emailPattern =
        /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (!emailPattern.test(email)) {

        formMessage.textContent =
            "Please enter a valid email address.";

        return;

    }


    /* Success */

    formMessage.textContent =
        "Thank you, " +
        name +
        ". Your message has been received successfully.";

    contactForm.reset();

});
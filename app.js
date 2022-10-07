//back end tools needed to perform complex actions.

// Drop down effect of menu bar for mobile views
const menu = document.querySelector('#mobile-menu');// This captures the mobile menu tag and assings it to menu
// This captures the mobile menu links as an ibject and assigns it.
const menuLinks = document.querySelector('.navbar__menu');

// Now when the user clicks on the menu it toggles the menu pull down which is way off screen as described on the style sheet.
menu.addEventListener('click', function() {
    menu.classList.toggle('is-active');
    menuLinks.classList.toggle('active');
});



/*Function has a time out that resets the fields*/
function message(){
    var name = document.getElementById('name');
    var email = document.getElementById('email');
    var number = document.getElementById('number');
    var msg = document.getElementById('msg');
    
    setTimeout(() => {
        name.value = "";
        email.value = "";
        number.value = "";
        msg.value = "";
    }, 2000);



}


const btn = document.getElementById("submit");

//listens to when the submit button is pressed
document.getElementById("form").addEventListener("submit", function (event) {
  event.preventDefault();

  //changes the text of the button "Submit" to "Sending" as the email is being sent
  btn.value = "Sending...";

  //service being sent to (gmail)
  const serviceID = "default_service";
  //template of the email being used
  const templateID = "template_g8vszyl";

  //email being sent
  emailjs.sendForm(serviceID, templateID, this).then(
    () => {
      //changes the button text from "Sending..." back to "Submit"  
      btn.value = "Submit";
      //alerts that email has successfully been sent
      alert('Email Sent');
    },
    (err) => {
      btn.value = "Submit";
      alert(JSON.stringify(err));
    }
  );
  message();
});

$(function (){
    switch (menu){
        case "ABOUT":
            $('#about').addClass('active');
            break;
        case "Contact Us":
            $('#contact').addClass('active');
            break;
        default :
            $('#home').addClass('active');
            break;
    }
});
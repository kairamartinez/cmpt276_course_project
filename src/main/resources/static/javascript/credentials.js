function confirmRedirect() {
    alert("You are about to open another website.")
}

document.getElementById('username').addEventListener('input', function (e) {
    const username = e.target.value;
    const pattern = new RegExp(e.target.pattern);
    if (pattern.test(username)) {
        // The username has the correct pattern
        e.target.setCustomValidity('');
    } else {
        // The username has an incorrect pattern
        e.target.setCustomValidity('Username must be your sfu id. (ex. abc123@sfu.ca)');
    }
});

const password = document.getElementById("password"),
    confirm_password = document.getElementById("confirm_password");
if (confirm_password != null) {
    function validatePassword() {
        if (password.value !== confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
        } else {
            confirm_password.setCustomValidity('');
        }
    }
    password.addEventListener('onchange', validatePassword());
    confirm_password.addEventListener('keyup', validatePassword());
}

login = { username: "", password: ""};

const logins = JSON.parse(localStorage.getItem('logins')) || [];
    
localStorage.setItem('admin', JSON.stringify(students));
class Navbar extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
        <nav class="navbar nav navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="https://sfussss.org/" target="_blank" onclick="confirmRedirect()">
                    <img src="/assets/icons/sosy-logo.svg" alt="Sosy Logo" class="d-inline-block align-text-top">
                    SoSy Course Planner
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon navbar-dark"></span>
                </button>
                <div class="justify-content-end collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link" href="/users/listCourses">Progress Checklist</a>
                        <a class="nav-link" href="/users/scheduled">Schedule Courses</a>
                        <a class="nav-link" href="https://sfussss.org/" target="_blank" onclick="confirmRedirect()">SoSy Website</a>
                        
                        <form action="/users/logout" method="get">
                            <input class="btn button button-green" value="Log Out" type="submit">
                        </form>
                    </div>
                </div>
            </div>
        </nav>
        `
    }
}
customElements.define('navbar-component', Navbar)

function confirmRedirect() {
    alert("You will be redirected to an external website.")
}

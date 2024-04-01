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
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="justify-content-end collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link" href="/">Home</a>
                        <a class="nav-link" href="https://sfussss.org/events" target="_blank" onclick="confirmRedirect()">Events</a>
                        <a class="nav-link" href="https://sfussss.org/get-involved" target="_blank" onclick="confirmRedirect()">Get Involved</a>
                        <a class="nav-link" href="https://sfussss.org/resources" target="_blank" onclick="confirmRedirect()">Resources</a>
                        <a class="nav-link" href="https://sfussss.org/blog" target="_blank" onclick="confirmRedirect()">Blog</a>
                        <a class="nav-link" href="https://sfussss.org/courses" target="_blank" onclick="confirmRedirect()">Courses</a>
                        <a class="button" href="mailto:ssss-exec@sfu.ca" rel="noreferrer">Contact Us</a>
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
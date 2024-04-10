class NavbarLanding extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
        <nav class="navbar nav navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="/">
                    <img src="/assets/icons/sosy-logo.svg" alt="Sosy Logo" class="d-inline-block align-text-top">
                    <p>SoSy Course Planner</p>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="justify-content-end collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                        <a class="nav-link mt-1" href="https://sfussss.org/" target="_blank" onclick="confirmRedirect()">SoSy Website</a>
                        <a class="btn button button-green" href="/login">Log In</a>
                    </div>
                </div>
            </div>
        </nav>
        `
    }
}
customElements.define('navbar-landing-component', NavbarLanding)

function confirmRedirect() {
    alert("You will be redirected to an external website.")
}

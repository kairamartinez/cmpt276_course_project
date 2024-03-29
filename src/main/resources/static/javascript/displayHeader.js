class HeaderComponent extends HTMLElement {
    connectedCallback() {
        let pageTitle = this.getAttribute('page-title')
        let mainTitle = this.getAttribute('main-title')

        this.innerHTML = `
            <header>
                <link rel="stylesheet" href="header.css">
                <nav class="navbar navbar-expand-lg">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="https://sfussss.org/" target="_blank" onclick="confirmRedirect()">
                            <img src="/assets/icons/sosy-logo.png" alt="Sosy Logo" width="30" height="24" class="d-inline-block align-text-top">
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
                                <a class="nav-link btn bg-success" href="mailto:ssss-exec@sfu.ca" rel="noreferrer">Contact Us</a>
                            </div>
                        </div>
                    </div>
                </nav>

                <section class="container-fluid">
                    <div class="row justify-content-center">
                        <div class="col text-center title">
                            <h6>${pageTitle}</h6>
                            <h1>${mainTitle}</h1>
                        </div>
                    </div>
                </section>
            </header>
        `
    }
}

customElements.define('header-component', HeaderComponent)

function confirmRedirect() {
    alert("You will be redirected to an external website.")
}
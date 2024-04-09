class Header extends HTMLElement {
    connectedCallback() {
        let subtitle = this.getAttribute('subtitle')
        let title = this.getAttribute('title')

        this.innerHTML = `
            <header>
                <section class="container-fluid">
                    <div class="row justify-content-center">
                        <div class="col text-center title">
                            <p>${subtitle}</p>
                            <h1>${title}</h1>
                        </div>
                    </div>
                </section>
            </header>
        `
    }
}
customElements.define('header-component', Header)
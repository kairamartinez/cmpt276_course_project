window.addEventListener("pageshow", function (event) {
    const navigationHistory = (window.performance.navigation.type === 2);
    const eventHistory = event.persisted;
    const entries = window.performance.getEntriesByType("navigation");
    const entryHistory = (entries[0].type === "back_forward");
    if (navigationHistory || eventHistory || entryHistory) {
        window.location.reload();
    }
});
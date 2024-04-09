let shareData = {
    title: "SOSY Schedule",
    text: document.getElementsByTagName("main")[0].innerText,
};
// remove the "Download Schedule\nMail Schedule!" at the end
shareData.text = shareData.text.slice(0, -32);

console.log(shareData);

function generatePDF() {
    const { jsPDF } = window.jspdf;
    const doc = new jsPDF();

    const title = shareData.title;
    doc.setFontSize(16); // Set font size for the title
    doc.text(title, 10, 10); // Add title at position (10, 10)

    const textContent = shareData.text;
    doc.setFontSize(12); // Set font size for the text content
    doc.text(textContent, 10, 30); // Add text content starting from position (10, 30)

    return doc.output('blob');
}

function downloadAsPDF() {
    const pdfBlob = generatePDF();

    const formData = new FormData();
    formData.append('file', pdfBlob, 'SoSySchedule.pdf');

    fetch('https://file.io/?expires=1d', {
        method: 'POST',
        body: formData
    })
        .then(response => response.json())
        .then(data => {
            const uploadedFileLink = document.getElementById('uploadedFileLink');
            uploadedFileLink.innerHTML = `<a id="downloadLink" href="${data.link}" target="_blank">Download File</a>`;
            document.getElementById('downloadLink').style.display = "none";
            document.getElementById('downloadLink').click();
        })
        .catch(error => {
            console.error('File upload error:', error);
            alert('An error occurred while uploading the file. Please try again.');
        });
}

function mail() {
    navigator.share(shareData).then(() => {
        // Success callback, the file was successfully shared
        console.log('File shared successfully');
    })
    .catch(error => {
        console.error('File upload or share error:', error);
        alert('An error occurred while uploading or sharing the file. Please try again.');
    });
}
function uploadFile(userTriggered) {
    const fileInput = document.getElementById('fileInput');

    // Check if a file is selected
    if (fileInput.files.length > 0) {
        const file = fileInput.files[0];

        // Create FormData object to send file
        const formData = new FormData();
        formData.append('file', file);

        // Send file to File.io using fetch API
        fetch('https://file.io/?expires=1d', {
            method: 'POST',
            body: formData
        })
            .then(response => response.json())
            .then(data => {
                // Display the uploaded file link
                const uploadedFileLink = document.getElementById('uploadedFileLink');
                uploadedFileLink.innerHTML = `<a href="${data.link}" id="downloadLink" target="_blank">Uploaded File</a>`;
                if (userTriggered) {
                    // hide the link
                    uploadedFileLink.style.display = "none";
                } else {
                    const downloadLink = document.getElementById('downloadLink');
                    downloadLink.click();
                }
            })
            .catch(error => {
                console.error('File upload error:', error);
                alert('An error occurred while uploading the file. Please try again.');
            });
    } else {
        alert('Please select a file to upload.');
    }
}
function checkInputs() {
    var tag1 = document.getElementById('tag1').value.trim();
    var tag2 = document.getElementById('tag2').value.trim();
    var tag3 = document.getElementById('tag3').value.trim();
    var errorMessage = document.getElementById('error-message');
    const submitButton = document.getElementById('submit-button');

    if (tag1 === '' && tag2 === '' && tag3 === '') {
        submitButton.disabled = true;
        errorMessage.style.display = 'block';
    } else {
        submitButton.disabled = false;
        errorMessage.style.display = 'none';
    }
}
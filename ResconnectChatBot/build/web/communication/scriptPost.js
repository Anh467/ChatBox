// Get all post elements
const postElements = document.querySelectorAll('.post');

// Add event listener to comment and view comments buttons for each post
postElements.forEach(function (postElement) {
    const commentBtn = postElement.querySelector('.comment-btn');
    const commentInput = postElement.querySelector('.comment-input');
    commentBtn.addEventListener('click', function () {
        commentInput.style.display = 'block';
    });

    const viewCommentsBtn = postElement.querySelector('.view-comments-btn');
    const commentsDiv = postElement.querySelector('.comments');
    viewCommentsBtn.addEventListener('click', function () {
        if (commentsDiv.style.display === 'none') {
            commentsDiv.style.display = 'block';
            viewCommentsBtn.textContent = 'Hide Comments';
        } else {
            commentsDiv.style.display = 'none';
            viewCommentsBtn.textContent = 'View Comments';
        }
    });
});

const likeBtns = document.querySelectorAll('.like-btn');

likeBtns.forEach(btn => {
    btn.addEventListener('click', function () {
        const commentId = this.getAttribute('data-comment-id');
        const voteCountElem = this.querySelector('.vote-count');
        const voteCount = parseInt(voteCountElem.innerText.replace(/\D/g, ''));
        const isLiked = this.getAttribute('data-liked') === 'true';

        // Update the vote count on the page
        voteCountElem.innerText = `${isLiked ? voteCount - 1 : voteCount + 1} `;
        this.setAttribute('data-liked', isLiked ? 'false' : 'true');
        this.innerHTML = `${isLiked ? 'Like' : 'Dislike'} (<span class="vote-count">${isLiked ? voteCount - 1 : voteCount + 1}</span>)`;

        // Send a request to the server to update the vote count
        const xhr = new XMLHttpRequest();
        xhr.open('POST', '../PressVote', true);
        xhr.setRequestHeader('Content-Type', 'application/json');
        xhr.onreadystatechange = function () {
            if (xhr.readyState === 4 && xhr.status === 200) {
                console.log(xhr.responseText);
            }
        };
        xhr.send(JSON.stringify({commentId: commentId, isLiked: !isLiked}));
    });
});
function toggleEdit(btn) {
    var contentElem = btn.parentNode.parentNode.parentNode.parentNode.querySelector(".comment-content"); // Get the <p> element containing the comment text
    var commentId = contentElem.dataset.commentId; // Get the comment ID from the data attribute
    if (contentElem.contentEditable === 'false') {
        contentElem.contentEditable = 'true'; // Enable editing
        btn.querySelector('.pEdit').classList.add('hiden');
        btn.parentNode.querySelector('.pSave').classList.remove('hiden');
    }
}
function updateInput(elem) {
  var inputElem = elem.parentNode.querySelector("input.comment-get");
  inputElem.value = elem.innerText;
}

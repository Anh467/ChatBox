function toggleMenu(iconPost) {
    const subMenu = iconPost.querySelector(".sub-menu-wrap");
    subMenu.classList.toggle("open-menu");
}

document.addEventListener("click", function (event) {
    const subMenus = document.querySelectorAll(".sub-menu-wrap");
    subMenus.forEach(function (subMenu) {
        const iconPost = subMenu.parentNode;
        if (!iconPost.contains(event.target) && !subMenu.contains(event.target)) {
            subMenu.classList.remove("open-menu");
        }
    });
});

//const win = document.getElementById("chat-messages");
//    win.scrollTo(0,document.body.scrollHeight);
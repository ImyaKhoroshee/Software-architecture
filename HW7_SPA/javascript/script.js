// маршрутизация по страницам
const route = (event) => {

    event = event || window.event;
    event.preventDefault();
    window.history.pushState({}, "", event.target.href);
    handleLocation();
}


const routers = {
    "/": "/pages/main.html",
    "/main": "/pages/main.html",
    "/order": "/pages/order.html",
    "/about": "/pages/about.html"
}

const handleLocation = async() =>{
    const path = window.location.pathname;
    const route = routers[path]; 
    const html = await fetch(route).then((data) => data.text())
    document.getElementById("main-page").innerHTML = html;
}

window.onpopstate = handleLocation;
window.route = route;

handleLocation();
$(document).ready(function () {
    $('[data-toggle="popover"]').popover();

    var serviceList = $('#service_list');
    initService(serviceList);

    var navList = $('#nav_list');
    initServiceNav(navList);
});









$(document).ready(function () {
    $('[data-toggle="popover"]').popover();

    var serviceList = $('#service_list');
    var loginDiv = createServiceItem(loginService);
    var table = createTable(loginService.paramsList);
    loginDiv.append(table);
    serviceList.append(loginDiv);
    serviceList.append("<hr/>");
});





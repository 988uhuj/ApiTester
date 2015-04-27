$(document).ready(function () {
    var serviceList = $('#service_list');

    var userDiv = createServiceItem(user);
    var userTable = createTable(user.paramsList);
    userDiv.append(userTable);
    serviceList.append(userDiv);
    serviceList.append("<hr/>");

});

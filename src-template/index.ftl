$(document).ready(function () {
    $('[data-toggle="popover"]').popover();
    var serviceList = $('#service_list');

<#list services as service>
    var ${service.name}Div = createServiceItem(${service.name}Service);
    var ${service.name}Table = createTable(${service.name}Service.params);
    ${service.name}Div.append(${service.name}Table);
    serviceList.append(${service.name}Div);
    serviceList.append("<hr/>");

</#list>
});








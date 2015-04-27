$(document).ready(function () {
    $('[data-toggle="popover"]').popover();
    var serviceList = $('#service_list');

    <#list entities as entity>
    var ${entity.name}Div = createServiceItem(${entity.name}Entity);
    var ${entity.name}Table = createTable(${entity.name}Entity.params);
    ${entity.name}Div.append(${entity.name}Table);
    serviceList.append(${entity.name}Div);
    serviceList.append("<hr/>");
    </#list>
});
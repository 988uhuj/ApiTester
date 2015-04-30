function initService(serviceList){

<#list services as service>
    var ${service.name}Div = createServiceItem(${service.name}Service);
    var ${service.name}Table = createTable(${service.name}Service.params);
    ${service.name}Div.append(${service.name}Table);
    serviceList.append(${service.name}Div);
    serviceList.append("<hr/>");

</#list>
}

function initEntity(serviceList){

<#list entities as entity>
    var ${entity.name}Div = createServiceItem(${entity.name}Entity);
    var ${entity.name}Table = createTable(${entity.name}Entity.params);
    ${entity.name}Div.append(${entity.name}Table);
    serviceList.append(${entity.name}Div);
    serviceList.append("<hr/>");

</#list>
}

<#list services as service>
var ${service.name}Service = {
    name: "${service.name}",
    comment: "${service.comment}",
    params: [
        <#list service.params as param>
        {
            intro: "${param.intro}",
            type: "${param.type}",
            comment: "${param.comment}",
            default_value: "${param.defaultValue}"
        },
        </#list>
    ]
};
</#list>


<#list entities as entity>
var ${entity.name}Entity = {
    name: "${entity.name}",
    comment: "${entity.comment}",
    params: [
        <#list entity.params as param>
        {
            intro: "${param.intro}",
            type: "${param.type}",
            comment: "${param.comment}",
            default_value: "${param.defaultValue}"
        },
        </#list>
    ]
};
</#list>

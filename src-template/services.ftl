function initService(serviceList){

<#list services as service>
    var ${service.name}Div = createServiceItem(${service.name}Service);
    var ${service.name}Table = createTable(${service.name}Service.params);
    ${service.name}Div.append(${service.name}Table);
    serviceList.append(${service.name}Div);
    serviceList.append('<a class="btn btn-primary" data-toggle="collapse" href="#collapse${service.name}" aria-expanded="false" aria-controls="collapseExample"> json </a>');
    serviceList.append('<div class="collapse" id="collapse${service.name}"><div class="well"> ${service.comment} </div></div>');
    serviceList.append("<div/><br/><hr/>");

</#list>
}

function initServiceNav(navList){
<#list services as service>
    navList.append('<a href="entity.jsp#${service.name}" class="list-group-item">${service.name}</a>');
</#list>
}

function initEntity(serviceList){

<#list entities as entity>
    var ${entity.name}Div = createServiceItem(${entity.name}Entity);
    var ${entity.name}Table = createTable(${entity.name}Entity.params);
    ${entity.name}Div.append(${entity.name}Table);
    serviceList.append(${entity.name}Div);
    serviceList.append('<a class="btn btn-primary" data-toggle="collapse" href="#collapse${entity.name}" aria-expanded="false" aria-controls="collapseExample"> json </a>');
    serviceList.append('<div class="collapse" id="collapse${entity.name}"><div class="well"> ${entity.comment} </div></div>');
    serviceList.append("<div/><br/><hr/>");

</#list>
}

function initEntityNav(navList){
<#list entities as entity>
    navList.append('<a href="#${entity.name}" class="list-group-item">${entity.name}</a>');
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

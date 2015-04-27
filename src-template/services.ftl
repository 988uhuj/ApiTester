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
            default_value: "${param.default}"
        }，
        </#list>
    ]
}
</#list>

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
            default_value: "${param.default}"
        }，
        </#list>
    ]
}
</#list>

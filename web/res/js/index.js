$(document).ready(function () {
    $('[data-toggle="popover"]').popover();

    var serviceList = $('#service_list');
    var loginDiv = createServiceItem(loginService);
    var table = createTable(loginService.paramsList);
    loginDiv.append(table);
    serviceList.append(loginDiv);
    serviceList.append("<hr/>");
});

var loginService = {
    serviceName: 'login',
    comment: "This is a login service.",
    paramsList: [
        {
            intro: "参数",
            type: "String",
            description: "hahaha",
            default_value: "defaultHa"
        },
        {
            intro: "参数",
            type: "Long",
            description: "hahaLong",
            default_value: "defaultLong"
        },
        {
            intro: "返回值",
            type: "String",
            description: "hahaReturn",
            default_value: "defaultReturn"
        }
    ]
}


function createTable(dataList) {
    var table = $('<table class="table table-hover table-bordered">');
    var columns = [
        {
            name: 'intro',
            title: '#'
        },
        {
            name: 'type',
            title: '类型',
            render: renderEntity
        },
        {
            name: 'description',
            title: '含义'
        },
        {
            name: 'default_value',
            title: '默认值'
        },
    ];
    table.append(commonGetThead(columns));
    table.append(commonGetTbody(dataList, columns));
    return table;
}

function renderEntity(row, value, parent) {
    parent.append('<a href="../../view/entity.jsp#' + value + '">' + value + '</a>');
}

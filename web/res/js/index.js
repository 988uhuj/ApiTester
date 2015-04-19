$(document).ready(function () {
    $('[data-toggle="popover"]').popover();

    createTable($('#table'), dataList);
});

var dataList = [
    {
        intro: "参数 1",
        type: "String",
        description: "hahaha",
        default_value: "defaultHa"
    },
    {
        intro: "参数 2",
        type: "Long",
        description: "hahaLong",
        default_value: "defaultLong"
    }
];

function createTable(table, dataList) {
    var columns = [
        {
            name: 'intro',
            title: '#'
        },
        {
            name: 'type',
            title: '类型'
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
}

var user = {
    name: "User",
    comment: "This is user entity.js",
    params: [
        {
            intro: "userName",
            type: "String",
            comment: "This is userName"
        },
        {
            intro: "age",
            type: "Integer",
            comment: "This is user age"
        },

    ]
};


var loginService = {
    name: 'login',
    comment: "This is a login service.",
    params: [
        {
            intro: "参数",
            type: "String",
            comment: "hahaha",
            default_value: "defaultHa"
        },
        {
            intro: "参数",
            type: "Long",
            comment: "hahaLong",
            default_value: "defaultLong"
        },
        {
            intro: "返回值",
            type: "String",
            comment: "hahaReturn",
            default_value: "defaultReturn"
        }
    ]
};
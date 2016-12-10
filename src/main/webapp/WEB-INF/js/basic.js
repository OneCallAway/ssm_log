$(function () {
    var username = $('#username'),
        password = $('#password'),
        submit = $('#submit'),
        udiv = $('#u'),
        pdiv = $('#p'),
        reg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/,
        name,
        pwd;


    username.focus(function () {
        udiv.removeAttr('errr', '');
        udiv.removeAttr('errrf', '');
    });

    username.blur(function () {
        if (username.val() == '') {
            udiv.attr('errr', '');
            udiv.removeAttr('errrf', '');
        } else {
            udiv.removeAttr('errr');
            if (!reg.test(username.val())) {
                udiv.attr('errrf', '');
            } else {
                udiv.removeAttr('errrf', '');
            }
        }
    });

    password.focus(function () {
        pdiv.removeAttr('errr');
    });

    password.blur(function () {
        if (password.val() == '') {
            pdiv.attr('errr', '');
        } else {
            pdiv.removeAttr('errr');
        }
    });

    //登录按钮点击事件
    submit.on('click', function (event) {
        event.preventDefault();
        var flag = false;
        name = username.val();
        pwd = password.val();

        if (name == '') {
            udiv.attr('errr', '');
            flag = true;
        }
        if (pwd == '') {
            pdiv.attr('errr', '');
            flag = true;
        }
        if ('' != name && !reg.test(name)) {
            udiv.removeAttr('errr', '');
            udiv.attr('errrf', '');
            flag = true;
        }

        if (flag) {
            return false;
        }

        $.ajax({
            url: "user/login",
            method: "post",
            data: {username: name, password: pwd},
            dataType: "json",
            success: function (data) {
                if (data.code == 1) {
                    layer.msg("登录" + data.msg, {icon: 1, time: 1500});
                } else {
                    layer.msg("登录" + data.msg, {icon: 2, time: 1500});
                }
            }
        });
    });
});
